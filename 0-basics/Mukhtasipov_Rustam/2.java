package programm;

import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		String strin="";
		Scanner in = new Scanner(System.in);
		String str=in.nextLine();
		for(int i=str.length()-1;i>=0;i--) {
			 strin= strin + str.charAt(i);
			}
		if(str.equals(strin))
			System.out.print("palindrom");
		else
			System.out.print("not palindrom");
	}

}