package 05;
//����� ��������� ������ ����������-�����(Union-Find)

public class UF {
    private int[] id;     // id[i] = �������� i
    private byte[] rank;  // rank[i] = ���� ��������� � ������ � i (�� ����� ���� ������ 31)
    private int count;    // ����� ��������

   
    public UF(int N) {
        if (N < 0) throw new IllegalArgumentException();
        count = N;
        id = new int[N];
        rank = new byte[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            rank[i] = 0;
        }
    }

    
    public int find(int p) {
        if (p < 0 || p >= id.length) throw new IndexOutOfBoundsException();
        while (p != id[p]) {
            id[p] = id[id[p]];    // ������ ���� �� ���������� �����
            p = id[p];
        }
        return p;
    } // ���������� ������������� ���������� ��� ����������, ����������� ���� <tt>p</tt>

    
    public int count() {
        return count;
    } // ���������� ����� ��������
  
    
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    } // ��� ���� <tt>p</tt> and <tt>q</tt> �������� ���������� ��������?

  
   
    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);
        if (i == j) return;

        if      (rank[i] < rank[j]) id[i] = j;
        else if (rank[i] > rank[j]) id[j] = i;
        else {
            id[j] = i;
            rank[i]++;
        }
        count--;
    } // ���������� ����


    
    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + " ���������");
    }
} // ������ �������������<tt> N </ tt> � ������������������ ��� ����� ����� (����� <tt> 0 </ tt> � <tt> N-1 </ TT>) �� ������������ �����, ��� ������ ����� � ���� ������������ �����-���� ����; ���� ���� ��������� � ������ �����������, ���������� ��� ���������� � ������� ���� � ����������� �����.