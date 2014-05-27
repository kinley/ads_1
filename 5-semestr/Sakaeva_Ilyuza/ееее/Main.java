package 05;

                                      //Головная программа. Чтение, алгоритм Крускала, вывод.
public class Main {
	public static void main(String[] args) {
	        In in = new In("Первый_тест(8 вершин).txt");//Второй_тест(250 вершин).txt на смену.
	        EdgeWeightedGraph G;
	        G = new EdgeWeightedGraph(in);
	        KruskalMST mst = new KruskalMST(G);
	        for (Edge e : mst.edges())
	        StdOut.println(e);
	        StdOut.println(mst.weight());
	    }
}

