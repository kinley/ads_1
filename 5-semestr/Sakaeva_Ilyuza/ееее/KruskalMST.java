package 05;
// ������� �����-�������� ��������. 

public class KruskalMST {
    private double weight;  // ��� ������������ ��������� ������
    private Queue<Edge> mst = new Queue<Edge>();  // ����� ����

    
    
    public KruskalMST(EdgeWeightedGraph G) {
        //����� ���������� ������� ����, ��������� ������ �����
        MinPQ<Edge> pq = new MinPQ<Edge>();
        for (Edge e : G.edges()) {
            pq.insert(e);
        } // ������� ��� � �����//����� ������������ ������ EdgeWeightedGraph(���������� ����������� ����� �����) � MinPQ(������� � ������������)

        
        UF uf = new UF(G.V());
        while (!pq.isEmpty() && mst.size() < G.V() - 1) {
            Edge e = pq.delMin();
            int v = e.either();
            int w = e.other(v);
            if (!uf.connected(v, w)) { // v-w �� ������� ����
                uf.union(v, w);  // ���������� v � w 
                mst.enqueue(e);  // ���������� ����� e � ���
                weight += e.weight();
            }
        } // ���� ������������ �������� ����������-����� �� ������ UF � �������� ��������-�������Min

        
        assert check(G);
    }  // �������� ������� �������������

    
    public Iterable<Edge> edges() {
        return mst;
    } // ���������� ����� � ���

    
    public double weight() {
        return weight;
    } // ���������� ����� ����� � ���
    
    
    private boolean check(EdgeWeightedGraph G) { // �������� ������������� �������

        double total = 0.0;                     // �������� ��������� ����
        for (Edge e : edges()) {
            total += e.weight();
        }
        double EPSILON = 1E-12;
        if (Math.abs(total - weight()) > EPSILON) {
            System.err.printf("����� ����� �� ������������ ����� weight(): %f vs. %f\n", total, weight());
            return false;
        }

        
        UF uf = new UF(G.V());
        for (Edge e : edges()) {
            int v = e.either(), w = e.other(v);
            if (uf.connected(v, w)) {
                System.err.println("�� ������");
                return false;
            }
            uf.union(v, w);
        } // �������� ��� ��� ������

        
        for (Edge e : G.edges()) {
            int v = e.either(), w = e.other(v);
            if (!uf.connected(v, w)) {
                System.err.println("�� �������� ������");
                return false;
            }
        }   // �������� ��� ��� �������� ������

        
        for (Edge e : edges()) {              // ��������� ��� ��� ���

            uf = new UF(G.V());              // ��� ����� � ��� �� e
            for (Edge f : mst) {
                int x = f.either(), y = f.other(x);
                if (f != e) uf.union(x, y);
            }
            
 
            for (Edge f : G.edges()) {
                int x = f.either(), y = f.other(x);
                if (!uf.connected(x, y)) {
                    if (f.weight() < e.weight()) {
                        System.err.println("����� " + f + " �������� ������� ����������� �������");
                        return false;
                    }
                } // ��������� ��� e ��� ����������� ���������� ����� � ���������� ����
            }

        }  

        return true;
    }



}