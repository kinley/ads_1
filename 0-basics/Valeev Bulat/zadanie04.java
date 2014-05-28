package class_18;
import java.util.Scanner;

public class zadanie04 {
	//Процедура деления и получения остатка
	public static void nod(int x, int y){
		//Алгоритм нахождения НОД
		while(x!=0 && y!=0){
		    if(x > y)//Находим большее значение
		        x = x % y;
		    else
		        y = y % x;
		}
		System.out.println(x+y);
	}
	public static void main(String[] args) {
	//Считываем два числа
	Scanner r=new Scanner(System.in);
	System.out.println("Введите два числа через пробел");
	int a=r.nextInt();
	int b=r.nextInt();
	
	nod(a, b);
	
	}
}
