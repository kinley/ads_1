import java.util.Random;
public class Quicksort {

// Задача: имеются болты и гайки. Для каждого болта есть только одна гайка
// и наоборот. Все болты и гайки имеют пары. 
// Болты и гайки можно сравнивать.
// Найти эффективное решение.

// Поскольку все болты и все гайки имеют пары, сделаем просто:
// отсортируем массивы с болтами и с гайками, и
// тогда пары соберутся сами собой.


	public static void quicksort(int arr[],int min, int max)
	{
		
		int l = min; //Указатель слева
		int r = max; //Указатель справа
		int m = arr[l + (r - l)/2]; // Опорный элемент
		
		while (l<r)
		{
			while ((l<max) && arr[l]<m) l++; // Поиск элемента больше опорного слева от него
			while ((r>min) && arr[r]>m) r--; // Поиск элемента меньше опорного справа от него
			if (l<r) // Когда нашли - меняем местами
			{
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
				if (l!=r && arr[l]==arr[r]) {r--; l++;} // Если в паре два одинаковых элемента, пропускаем
			}
		}
		// Когда прошли по всему массиву, упорядочиваем его левую и правую части - относительно опорного элемента
		if (l>min) quicksort(arr,min,r-1);
		if (r<max) quicksort(arr,l+1,max);
	}


	public static void main(String [] args)
	{

		int bolts[] = {15,5,9,11,1};
		int nuts[] = {6,16,12,10,2};

		
		System.out.println("Посмотрим на все болты и на все гайки");
		for (int i = 0; i<bolts.length; i++) {System.out.println(bolts[i]);}
		System.out.println();
		for (int i = 0; i<nuts.length; i++) {System.out.println(nuts[i]);}
		
		System.out.println();
		
		// Отсортируем массивы болтов и гаек
		quicksort(bolts,0,bolts.length-1);
		quicksort(nuts,0,nuts.length-1);
		
		System.out.println("Теперь под каждым болтом мы видим соответствующую гайку");
		for (int i = 0; i<bolts.length; i++) {System.out.print(bolts[i] + " ");}
		System.out.println();
		for (int i = 0; i<nuts.length; i++) {System.out.print(nuts[i] + " ");}		
		
	}


}
