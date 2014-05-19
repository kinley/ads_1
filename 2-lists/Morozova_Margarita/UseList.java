public class UseList {
// Деление списка на два по четности положения каждого элемента
public static void main(String [] args) {
	// Напишем разделение списка на два
	int n = 7; // Будущий размер списка
	
	// Заполнение списка
	List<Integer> list = new List<Integer>();
	for (int i = 0; i<n; i++) {list.setElement(i+1);} // "Очеловеченные" индексы как элементы списка
//	for (int i = 1; i<(list.size()+1); i++) {System.out.print(i + " "); int a = list.getElement(i); System.out.println(a);}
	
	//Делим список
	List<Integer> list1 = new List<Integer>();

	List<Integer> list2 = new List<Integer>();
	for (int i = 1; i<n+1; i++) {
		if ((i % 2)!=0) list1.setElement(list.getElement(i));
		else list2.setElement(list.getElement(i));
	}

	// Выводим и смотрим, все ли получилось.
	for (int i = 1; i<(list1.size()+1); i++) {int a = list1.getElement(i); System.out.print(a + " ");}
	System.out.println();
	for (int i = 1; i<list2.size()+1; i++) {int a = list2.getElement(i); System.out.print(a + " ");}
	
}
}
