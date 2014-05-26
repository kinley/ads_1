
public class Main {

	public static void main(String[] args) {
		 String a[]={"Fusion","Anderson","Gravity"};	//массив строк		
	     RadixSort element=new RadixSort(a);	//элемент нашего класса
	     element.Sort(); 	//отправили на сортировку
	     element.Print();	//вывод
	     System.out.println("DONE!");
	}

}
