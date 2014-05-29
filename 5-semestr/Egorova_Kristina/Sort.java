
public class Sort {
	 private static final int BITS_PER_BYTE =   8;
	 private static final int BITS_PER_INT  =  32;   // � JAVA int ��� 32 ���� 
	 private static final int R             = 256;   // ��� ASCII �������
	 private static final int CUTOFF        =  15;   // ��� ���������� ���������
	 
	 private String[] input;
	 private String[] created;
	 private int length, d;
	 
	 public Sort(String[] input){		//���������� ������� ��������
		this.length=input.length;
		this.created=new String[length];
		this.input=input;
		this.d=0;
	 }
	 
	 public void Sort() {		//���������� ������� ��������
		 sort(this.input,0,this.length-1,0,this.created);
	 }
	 
	 public void Print() { //����� ������
		 for(int i=0;i<this.length;i++){
			 System.out.println(input[i]);
		 }
	 }
	 
	 private static int charAt(String s, int d) {	//���������� ������ ������
	        assert d >= 0 && d <= s.length();
	        if (d == s.length()) return -1;
	        return s.charAt(d);
	    } 
	 
	 
	 private static void sort(String[] input, int lo, int hi, int d, String[] created)
	 {	//���������� ����������� ������� �� input[low] �� input[hi]
		 // ��� ���������� ��������� ��������
		 if (hi <= lo + CUTOFF) {
	            insertion(input, lo, hi, d);
	            return;
	        }

	        // ���������� ������
	        int[] count = new int[R+2];
	        for (int i = lo; i <= hi; i++) {
	            int c = charAt(input[i], d);
	            count[c+2]++;
	        }

	        // ������� � ������� 
	        for (int r = 0; r < R+1; r++)
	            count[r+1] += count[r];

	        // �� ������ ������� ���������
	        for (int i = lo; i <= hi; i++) {
	            int c = charAt(input[i], d);
	            created[count[c+1]++] = input[i];
	        }

	        // ������� �������
	        for (int i = lo; i <= hi; i++) 
	            input[i] = created[i - lo];


	        // � ��� ���������� ��� ������� �������
	        for (int r = 0; r < R; r++)
	            sort(input, lo + count[r], lo + count[r+1] - 1, d+1, created);
	 }
	 
	 // ���������� �������� ��� ������[lo,hi]
	    private static void insertion(String[] a, int lo, int hi, int d) {
	        for (int i = lo; i <= hi; i++)
	            for (int j = i; j > lo && less(a[j], a[j-1], d); j--)
	                exch(a, j, j-1);
	    }

	    // ������ SWAP
	    private static void exch(String[] a, int i, int j) {
	        String temp = a[i];
	        a[i] = a[j];
	        a[j] = temp;
	    }

	    // ������ ����������(�������)
	    private static boolean less(String v, String w, int d) {
	        for (int i = d; i < Math.min(v.length(), w.length()); i++) {
	            if (v.charAt(i) < w.charAt(i)) return true;
	            if (v.charAt(i) > w.charAt(i)) return false;
	        }
	        return v.length() < w.length();
	    }
	    
}
