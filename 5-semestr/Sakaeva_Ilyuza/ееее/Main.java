package 05;

                                      //�������� ���������. ������, �������� ��������, �����.
public class Main {
	public static void main(String[] args) {
	        In in = new In("������_����(8 ������).txt");//������_����(250 ������).txt �� �����.
	        EdgeWeightedGraph G;
	        G = new EdgeWeightedGraph(in);
	        KruskalMST mst = new KruskalMST(G);
	        for (Edge e : mst.edges())
	        StdOut.println(e);
	        StdOut.println(mst.weight());
	    }
}

