package test;

import java.util.Scanner;

public class number1 {

	public static void main(String[] args) {
         System.out.print("¬ведите размерность массива m и n:");
         Scanner in= new Scanner(System.in);
         int n= in.nextInt();
         int m= in.nextInt();
         int [][] mas = new int[n][m];
         for (int j=0;j<n;j++){
        	 for (int i=0;i<m;i++){
        		 mas [j][i] = (int)(Math.random()*2);
        		 if (mas[j][i]==1)
        			 System.out.print("*");
        		 else
	        		 System.out.print("-");
	         }
         System.out.println();
         }
         

	}

}
