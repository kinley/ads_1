import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;


public class GraphTest {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        TextParser t = new TextParser(sc, pw);                  //работа с файлами

        System.out.println("Введите количество вершин в графе:");
        Graph G = new Graph(t);

        System.out.println("Результат");
        System.out.println("Вершин:"+G.getV());
        System.out.println("Ребер:"+G.getE());
        System.out.println("Соседство:");
        for (int i = 1; i <= G.getV(); i++){
            System.out.print(i + ": ");
            for(Iterator<Integer> j = G.getAllV(i).iterator(); j.hasNext();)
                System.out.print(j.next() + " ");
            System.out.println();
        }

    }
}
