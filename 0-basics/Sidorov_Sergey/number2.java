package test;

import java.util.Scanner;

public class number2 {
	public static void main (String[] args){
		System.out.print("Введите строку: ");
		Scanner in = new Scanner(System.in);
		String  x = in.nextLine();
		int k = x.length();
		char[] ch = new char[k];
		for (int i=0;i<k;i++)
		{
		 ch[i] = x.charAt(i);
		 }
		int r=0;
		for (int i=0;i<k/2;i++){
			if (ch[i]==ch[k-i-1])
				 r++;}
			if (r==k/2)
				System.out.print("Палиндром");
			else
				System.out.print("Не палиндром");
			}
	}

