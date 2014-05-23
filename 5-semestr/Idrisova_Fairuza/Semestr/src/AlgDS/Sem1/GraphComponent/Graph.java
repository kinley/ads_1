package AlgDS.Sem1.GraphComponent;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Graph<Item> {
    private final int V; //количество вершин
    private int E;       //количество ребер



    private List<Integer>[] AllV;  //списки смежных вершин

    public Graph(int V)      //конструктор с параметром-число вершин
    {
        this.V = V;
        this.E = 0;
        AllV = new ArrayList[V + 1];  // создание массива списков

        for (int v = 0; v < V+1; v++)        //Вначале они пустые
            AllV[v] = new ArrayList<Integer>();
    }

    public Graph(TextParser text) throws IOException {
        this(text.readInt());        //чтение V и создание графа
        int E = text.readInt();
        for (int i = 0; i < E; i++) {
            //добавляем ребро
            int v = text.readInt();
            int w = text.readInt();
            addEdge(v, w);
        }
    }

    public int getV() {
        return V;
    }

    public int getE() {
        return E;
    }

    public List getAllV(int v) {
        return AllV[v];
    }

    public void addEdge(int v, int w) {
        AllV[v].add(w);
        AllV[w].add(v);
        E++;
    }

    public void view(TextParser p) throws IOException {
        for (int i = 1; i <= V; i++){
            p.print(i+": ");
                for(Iterator<Integer> j = AllV[i].iterator(); j.hasNext();)
                    p.print(j.next());
            p.println();
        }
    }


}
