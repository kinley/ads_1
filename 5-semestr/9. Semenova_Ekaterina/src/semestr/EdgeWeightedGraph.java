package semestr;

import java.util.Stack;

public class EdgeWeightedGraph {
	
    private final int V;
    private int E;
    private Bag<Edge>[] adj;
    
    /**
     * �������������� ������ ���������� ���� � V ��������� � 0 �������.
     * param V ���������� ������
     * @throws java.lang.IllegalArgumentException ���� V < 0
     */
    public EdgeWeightedGraph(int V) {
        if (V < 0) throw new IllegalArgumentException("���������� ������ �� ������ ���� �������������");
        this.V = V;
        this.E = 0;
        adj = (Bag<Edge>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<Edge>();
        }
    }

    /**
     * �������������� ��������� ���������� ���� � V ��������� � E �������.
     * param V ���������� ������
     * param E ���������� �����
     * @throws java.lang.IllegalArgumentException ���� V < 0
     * @throws java.lang.IllegalArgumentException ���� E < 0
     */
    public EdgeWeightedGraph(int V, int E) {
        this(V);
        if (E < 0) throw new IllegalArgumentException("���������� ����� �� ������ ���� ������ ����");
        for (int i = 0; i < E; i++) {
            int v = (int) (Math.random() * V);
            int w = (int) (Math.random() * V);
            double weight = Math.round(100 * Math.random()) / 100.0;
            Edge e = new Edge(v, w, weight);
            addEdge(e);
        }
    }

    /**  
     * ������������� ����������� ����� � �������� ������.
     * ������: ���������� ������ <em>V</em>,
     * ����� ���������� ����� <em>E</em>,
     * ����� ���� ������ � ��� �����,
     * ������ ������ ��������� ��������.
     * @param in ������� �����
     * @throws java.lang.IndexOutOfBoundsException ���� ����� ������ ����� �� � �������� ���������
     * @throws java.lang.IllegalArgumentException ���� ����� ������ ��� ����� ������������
     */
    public EdgeWeightedGraph(In in) {
        this(in.readInt());
        int E = in.readInt();
        if (E < 0) throw new IllegalArgumentException("����� ������ ��� ����� �� ������ ���� ������������");
        for (int i = 0; i < E; i++) {
            int v = in.readInt();
            int w = in.readInt();
            double weight = in.readDouble();
            Edge e = new Edge(v, w, weight);
            addEdge(e);
        }
    }

    /**
     * ������������� ������ ���������� ����� ������� �������� ������ <tt>G</tt>.
     * @param G ���������� ������������� ����
     */
    public EdgeWeightedGraph(EdgeWeightedGraph G) {
        this(G.V());
        this.E = G.E();
        for (int v = 0; v < G.V(); v++) {
            // ���������� ��� ����� ������� �������� ���� ��� � ���������
            Stack<Edge> reverse = new Stack<Edge>();
            for (Edge e : G.adj[v]) {
                reverse.push(e);
            }
            for (Edge e : reverse) {
                adj[v].add(e);
            }
        }
    }


    /**
     * ��������� ���������� ������ � �����.
     */
    public int V() {
        return V;
    }

    /**
     * ���������� ���������� ����� � �����.
     */
    public int E() {
        return E;
    }

    /**
     * ��������� ����������������� ����� <tt>e</tt> � ��������� ����.
     * @param e �����
     * @throws java.lang.IndexOutOfBoundsException ���� ��� �������� ����� �� ����� 0 � V- 1
     */
    public void addEdge(Edge e) {
        int v = e.either();
        int w = e.other(v);
        if (v < 0 || v >= V) throw new IndexOutOfBoundsException("������� " + v + " �� ����� 0 � " + (V-1));
        if (w < 0 || w >= V) throw new IndexOutOfBoundsException("������� " + w + " �� ����� 0 � " + (V-1));
        adj[v].add(e);
        adj[w].add(e);
        E++;
    }

    /**
     * ���������� ����� ��������� �� �������� <tt>v</tt>.
     * @param v �������
     * @throws java.lang.IndexOutOfBoundsException ���� �� 0 <= v < V
     */
    public Iterable<Edge> adj(int v) {
        if (v < 0 || v >= V) throw new IndexOutOfBoundsException("vertex " + v + " is not between 0 and " + (V-1));
        return adj[v];
    }

    /**
     * ���������� ��� �����
     * ��� �������� ���� �����, ������������:
     * <tt>for (Edge e : G.edges())</tt>.
     * @return ��� ����� ��� Iterable.
     */
    public Iterable<Edge> edges() {
        Bag<Edge> list = new Bag<Edge>();
        for (int v = 0; v < V; v++) {
            int selfLoops = 0;
            for (Edge e : adj(v)) {
                if (e.other(v) > v) {
                    list.add(e);
                }
                // �������� ������ ���� ��������� ������� ���������������� ����� ( ����� ����� ��������� ���� �� ������ )
                else if (e.other(v) == v) {
                    if (selfLoops % 2 == 0) list.add(e);
                    selfLoops++;
                }
            }
        }
        return list;
    }

    /**
     * ��������� ��������� ������������� �����.
     * ���� ����� ���������� �����, ���������������� <em>E</em> + <em>V</em>.
     * @return ���������� ������ <em>V</em>, ����� ���������� ����� <em>E</em>,
     *  ����� ������� ������ �����
     */
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
    }
    
  //������ ����� ������������ � ������� ������ Main, ���������� ������ �� ����� � ����� ������, � ������� ������ KruskalMST, ����������� �������� ��������

}