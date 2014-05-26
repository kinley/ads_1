import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class ProgramMain {


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(new File("src/input1.txt"));
        //Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new File("src/output.txt"));
        //PrintWriter pw = new PrintWriter(System.out);
        TextParser textParser = new TextParser(sc, pw);                  //работа с файлами

        System.out.println("Введите количество вершин в графе:");
        Graph G = new Graph(textParser);                                //создаем граф
        Stack<Integer> st = new Stack();

        DoubComp Comp = new DoubComp(G);
        st = Comp.MakeComp();

        if (st.isEmpty()) textParser.print("нет двусвязных компонент");

        else {

            int i;
            int c = 1;

            textParser.println("Двусвязные компоненты ");

            while (!st.isEmpty()) {
                i = st.pop();
                if (i == -1) textParser.println();
                else {
                    textParser.print(i);
                    textParser.print(st.pop()+";");
                }
            }
        }
        System.out.println(Comp.getCountCom());

        pw.close();
        sc.close();
    }


}
