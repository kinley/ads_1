

import java.util.Scanner;

public class AISD04 {
	
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int ost=0; 
			System.out.println("������� ������ �����");
			int num1=in.nextInt();
			System.out.println("������� ������ �����");
			int num2=in.nextInt();
			while (num2 != 0) {
			  ost=num1 % num2;
			  num1 = num2;
			  num2 = ost;
			}
			System.out.println(num1);
			}

	}
