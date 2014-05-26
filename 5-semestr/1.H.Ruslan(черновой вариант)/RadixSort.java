public class RadixSort {
	 private static final int BITS_PER_BYTE =   8;	 //константы класса
	 private static final int BITS_PER_INT  =  32;   // в JAVA int  содержит 32  бита 
	 private static final int R             = 256;   // в ASCII таблице алфавит
	 private static final int CUTOFF        =  15;   // для сортировки вставкой
	 
	 private String[] input;			//входная строка, позже ее и ретерним
	 private String[] created;			//вспомогательная строка
	 private int length,d;				//длина строки, и переменная для поразрядной сортировки
	 
	 public RadixSort(String[] input){		//просто конструктор
		this.length=input.length;
		this.created=new String[length];
		this.input=input;
		this.d=0;
	 }
	 
	 public void Sort(){		//метод сортировки (через процедуру делать было удобнее, ибо с ООП слабо 
		 Sort(this.input,0,this.length-1,0,this.created);	//передаем строку, начало ее, конец, индекс(для начала) и всп. строку
	 }
	 
	 public void Print(){ //просто вывод строки(результат)
		 for(int i=0;i<this.length;i++){
			 System.out.println(input[i]);
		 }
	 }
	 
	 private static int charAt(String s, int d) {	//возвращает символ из стринга, -1 если d=s.length 
	        assert d >= 0 && d <= s.length();
	        if (d == s.length()) return -1;
	        return s.charAt(d);
	    } 
	 
	 
	 private static void Sort(String[] input, int lo, int hi, int d, String[] created){	//сортировка начиная с input[low] по input[hi]
		
		 
		 // для сортировки маленьких подпослед.
		 if (hi <= lo + CUTOFF) {
	            insertion(input, lo, hi, d);
	            return;
	        }

	        // частота
	        int[] count = new int[R+2];
	        for (int i = lo; i <= hi; i++) {
	            int c = charAt(input[i], d);
	            count[c+2]++;
	        }

	        //насчитали частоту, преобразуем ее в индекс
	        for (int r = 0; r < R+1; r++)
	            count[r+1] += count[r];

	        // копируем во всп. строку
	        for (int i = lo; i <= hi; i++) {
	            int c = charAt(input[i], d);
	            created[count[c+1]++] = input[i];
	        }

	        // достаем обратно
	        for (int i = lo; i <= hi; i++) 
	            input[i] = created[i - lo];


	        // рекурсия для сортировки следующих символов
	        for (int r = 0; r < R; r++)
	            Sort(input, lo + count[r], lo + count[r+1] - 1, d+1, created);
	 }
	 
	 // сортировка вставкой для a[lo,hi]
	    private static void insertion(String[] a, int lo, int hi, int d) {
	        for (int i = lo; i <= hi; i++)
	            for (int j = i; j > lo && less(a[j], a[j-1], d); j--)
	                exch(a, j, j-1);
	    }

	    // просто SWAP
	    private static void exch(String[] a, int i, int j) {
	        String temp = a[i];
	        a[i] = a[j];
	        a[j] = temp;
	    }

	    //процедура сравнения(из СЕДЖВИКА)
	    private static boolean less(String v, String w, int d) {
	        for (int i = d; i < Math.min(v.length(), w.length()); i++) {
	            if (v.charAt(i) < w.charAt(i)) return true;
	            if (v.charAt(i) > w.charAt(i)) return false;
	        }
	        return v.length() < w.length();
	    }
}
