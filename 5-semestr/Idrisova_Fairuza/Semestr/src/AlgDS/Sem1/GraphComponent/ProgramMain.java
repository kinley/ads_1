package AlgDS.Sem1.GraphComponent;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class ProgramMain {


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        TextParser textParser = new TextParser(sc, pw);                  //работа с файлами

        Graph G = new Graph(textParser);                                //создаем граф
        Stack<Integer> st = new Stack();
//        G.view(textParser);

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


        pw.close();
        sc.close();
    }


}
