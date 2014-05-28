package class_18;
import java.util.Scanner;

public class zadanie02 {

public static void main(String[] args) {
		String stroka=new String(); 
		Boolean flag=true;
		Scanner r = new Scanner(System.in);
		System.out.print("Введите слово:");
		if(r.hasNextLine()) { 
			stroka= r.nextLine();
		};
		int length = stroka.length();
		if (length==0) flag=false; //пустая строка — не палиндром
		for (int i = 0; i<length/2; i++) {
		if (stroka.charAt(i)!=stroka.charAt(length - i - 1))
			flag = false;
		}
		if (flag) System.out.println(" Палиндром ");
		else System.out.println(" Не палиндром ");
	}
}
