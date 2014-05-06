package zvezdochka;
import java.util.Scanner;
import java.util.Random;
public class zvezdochka {
	 public static void main(String[] args) {
	        int A,B;
	        Scanner in = new Scanner (System.in);
	        Random rand = new Random();
	        System.out.println("BBeguTe A");
	        A = in.nextInt();
	        System.out.println("BBeguTe B");
	        B = in.nextInt();
	        
	        boolean  Matrix[][] = new boolean[A][B];
	        	for ( int i=0; i<A;  i++  )  
	        		for ( int j=0; j<B;  j++  )  
	        			Matrix[i][j] = rand.nextBoolean();
	        
	        System.out.print(" "+" "+" ");
	        	for ( int i=0; i<A;  i++  ){
	        		System.out.print(i+" ");
	        	}	
	        
	        System.out.println(" ");
	        	for (int j = 0; j<B;j++){
	        		System.out.println(" "+j);		
	        	 	}
	        
	        for (int i = 0; i<A; i++)
	        	for (int j = 0; j<B;j++){
	        		Matrix[i][j] = rand.nextBoolean();
	        		if (Matrix[i][j]==false) { 
	        			System.out.print("* ");
	        			}
	        		else {
	        			System.out.print("  ");
	        		}
	    		}
	    }
}
