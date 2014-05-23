import java.io.PrintWriter;
import java.util.Scanner;

public class sortirovka {
private static Scanner rand;

public static void main(String[] args) {
	  
		int [] a = new int [10]; 

		for ( int i=0; i<10; ++i) 
		{// ввели массив
			a[i]= (int) Math.round(Math.random()*100);
		}
		
		for (int i=0; i<10; ++i) 
		{
			for (int j=i; j<10; ++j) 
			{
				if (a[i]>a[j]) { // в том случае, если встретили элемент, больший предыдущего,
					Object zapas=a[i]; a[i]=a[j]; a[j]=(int)zapas; //поменять их местами после этого большие элементы уходят в конец, а маленькие - в начало
				}
			} 
		}
	}

 public static void SSort(int[] array, int l, int r) {
            int i = l;
            int j = r;
            rand = null;
            int x = array[l + rand.nextInt(r - l + 1)];
            while (i <= j) {
                while (array[i] < x) 
                {
                    i++;
                }
                while (array[j] > x) 
                {
                    j--;
                }
                if (i <= j) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    i++;
                    j--;
                }
            }
            if (l<j)
            {
                SSort(array, l, j);
            }
            if(i<r)
            {
                SSort(array, i, r);
            }
 }

public void printArray(int[] array)//вывели массив на печать
{
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
    }
}
}
	


