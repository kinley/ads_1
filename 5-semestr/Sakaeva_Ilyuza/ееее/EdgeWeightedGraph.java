package 05;

import java.util.Stack;

public class EdgeWeightedGraph {
	
    private final int V;
    private int E;
    private Bag<Edge>[] adj;
    
    
    public EdgeWeightedGraph(int V) {
        if (V < 0) throw new IllegalArgumentException("Количество вершин не должно быть отрицательным");
        this.V = V;
        this.E = 0;
        adj = (Bag<Edge>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<Edge>();
        } 
    }   // Инициализирует пустой взвешенный граф с V вершинами и 0 ребрами

    
    public EdgeWeightedGraph(int V, int E) {
        this(V);
        if (E < 0) throw new IllegalArgumentException("Количество ребер не должно быть меньше нуля");
        for (int i = 0; i < E; i++) {
            int v = (int) (Math.random() * V);
            int w = (int) (Math.random() * V);
            double weight = Math.round(100 * Math.random()) / 100.0;
            Edge e = new Edge(v, w, weight);
            addEdge(e);
        } 
    }  // Инициализирует случайный взвешенный граф с V вершинами и E ребрами

    
    public EdgeWeightedGraph(In in) {
        this(in.readInt());
        int E = in.readInt();
        if (E < 0) throw new IllegalArgumentException("Число вершин или ребер не должно быть отрицательно");
        for (int i = 0; i < E; i++) {
            int v = in.readInt();
            int w = in.readInt();
            double weight = in.readDouble();
            Edge e = new Edge(v, w, weight);
            addEdge(e);
        } 
    }// Инициализация взвешенного графа с входного потока

    
    public EdgeWeightedGraph(EdgeWeightedGraph G) {
        this(G.V());
        this.E = G.E();
        for (int v = 0; v < G.V(); v++) {
            // возвращает так чтобы матрица сежности была как в оригинале
            Stack<Edge> reverse = new Stack<Edge>();
            for (Edge e : G.adj[v]) {
                reverse.push(e);
            }
            for (Edge e : reverse) {
                adj[v].add(e);
            } 
        }
    } // Инициализация нового взешенного графа которая является копией <tt>G</tt>


    
    public int V() {
        return V;
    } // Возращает количество вершин в графе

    
    public int E() {
        return E;
    }  // Возвращает количество ребер в графе

    
    public void addEdge(Edge e) {
        int v = e.either();
        int w = e.other(v);
        if (v < 0 || v >= V) throw new IndexOutOfBoundsException("Вершины " + v + " не между 0 и " + (V-1));
        if (w < 0 || w >= V) throw new IndexOutOfBoundsException("Вершины " + w + " не между 0 и " + (V-1));
        adj[v].add(e);
        adj[w].add(e);
        E++;
    } // Добавляет неориентированные ребра <tt>e</tt> в взешенный граф

    
    public Iterable<Edge> adj(int v) {
        if (v < 0 || v >= V) throw new IndexOutOfBoundsException("vertex " + v + " is not between 0 and " + (V-1));
        return adj[v];
    } // Возвращает ребра созданные на вершинах <tt>v</tt>

    
    public Iterable<Edge> edges() {
        Bag<Edge> list = new Bag<Edge>();
        for (int v = 0; v < V; v++) {
            int selfLoops = 0;
            for (Edge e : adj(v)) {
                if (e.other(v) > v) {
                    list.add(e);
                }  // Возвращает все ребра
    
                else if (e.other(v) == v) {
                    if (selfLoops % 2 == 0) list.add(e);
                    selfLoops++;
                }
            }
        }
        return list;
    } // Добавить только один экземпляр каждого самостоятельного цикла 

    
    public String toString() {
        String NEWLINE = System.getProperty("line.separator");
        StringBuilder s = new StringBuilder();
        s.append(V + " " + E + NEWLINE);
        for (int v = 0; v < V; v++) {
            s.append(v + ": ");
            for (Edge e : adj[v]) {
                s.append(e + "  ");
            }
            s.append(NEWLINE);
        }
        return s.toString();
    } // Возращает строковое представление графа
    
  //Данный класс используется в главном классе Main, вызывающем чтение из файла и вывод остова, и главном классе KruskalMST, реализующем алгоритм Крускала

}