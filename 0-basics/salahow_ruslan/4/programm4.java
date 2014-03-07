package project1;

import java.util.Scanner;

public class programm4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r=0; //остаток
		System.out.println("введите число 1");
		int number1=in.nextInt();
		System.out.println("введите число 2");
		int number2=in.nextInt();
		while (number2 != 0) {
		  r=number1 % number2;
		  number1 = number2;
		  number2 = r;
		}
		System.out.println(number1);
		}

}
