package 00;

import java.util.Scanner;

public class 00-04 {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ost=0;
         System.out.println("введите a");
        int a=in.nextInt();
         System.out.println("введите b");
        int b=in.nextInt();
        while (b != 0) {
          r=a % b; a = b;b = ost;
		       }
	System.out.println(a);
		}

}
