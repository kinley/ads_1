
public class Main {

	public static void main(String[] args) {
		In in = new In("input.txt");	//будем считывать строки из файли
		int N = in.readInt();		//первая строка содержит число слов в файле
	    String [] a = new String [++N];	//массив наших слов
	    int i=0;
	    while (in.hasNextLine()) {	//забиваем массив
	    	a[i] = in.readLine();
	        i++;
	       }
	     RadixSort element=new RadixSort(a);	//элемент нашего класса
	     element.Sort(); 	//отправили на сортировку
	     element.Print();	//вывод в файл
	}

}
