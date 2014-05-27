
public class msd_sort {
	private static int R = 256; //основание
	private static final int M = 15; //отсечка для небольших подмассивов
	private static String[] aux; //вспомогательный массив для распределения
	
	private static int charAt(String s, int d){
		if (d<s.length()) return s.charAt(d);
		else return -1;
	}
	
	public static void sort(String[] a) {
		int N = a.length;
		aux = new String[N];
		sort(a, 0, N-1, 0);
	}
	
	private static void sort(String[] a, int lo, int hi, int d) {
		//сортировка от а[lo] до a[hi], начиная с d-ого символа
		if (hi <= lo + M) {
			Insertion.sort(a, lo, hi,d);
			return;}
		
		int[] count = new int[R+2]; 		//вычисление счетчиков повторений
		for (int i = lo, i <=hi, i++)
			count[charAt(a[i], d) + 2]++;
		
		for (int r = 0; r <R+1; r++)		//преобразование счетчиков в индексы
			count[r+1] += count[r];
		
		for (int i = lo; i<=hi; i++)		//распределение
			aux[count[charAt(a[i], d) +1]++] = a[i];
		
		for (int i = lo; i <=hi; i++)		//копирование
			a[i] = aux[i-lo];
				
		for (int r=0; r < R; r++)	//рекурсивная сортировка для каждого значения символа
			sort(a, lo+count[r], lo+count[r+1]-1, d+1);
		}
	}
