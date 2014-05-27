package 05;
//Класс реализует классы Объединить-Найти(Union-Find)

public class UF {
    private int[] id;     // id[i] = родитель i
    private byte[] rank;  // rank[i] = ранг поддерево с корнем в i (не может быть больше 31)
    private int count;    // номер элемента

   
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
            id[p] = id[id[p]];    // сжатие пути по сокращению вдвое
            p = id[p];
        }
        return p;
    } // Возвращает идентификатор компонента для компонента, содержащего узел <tt>p</tt>

    
    public int count() {
        return count;
    } // Возвращает номер элемента
  
    
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    } // Два узла <tt>p</tt> and <tt>q</tt> содержат одинаковые элементы?

  
   
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
    } // Объединяет узлы


    
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
        StdOut.println(uf.count() + " элементов");
    }
} // Читает целочисленное<tt> N </ tt> и последовательность пар целых чисел (между <tt> 0 </ tt> и <tt> N-1 </ TT>) из стандартного ввода, где каждое целое в паре представляет какой-либо узел; если узлы находятся в разных компонентах, объединить два компонента и вывести пару в стандартный вывод.