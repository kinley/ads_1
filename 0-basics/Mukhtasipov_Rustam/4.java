package programm;

import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r=0;
		System.out.println("������� ������ �����");
		int p=in.nextInt();
		System.out.println("������� ������ �����");
		int q=in.nextInt();
		while (q != 0) {
		  r=p % q;
		  p = q;
		  q = r;
		}
		System.out.println(p);
		}

}