
import java.util.*;
public class Arrayout {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		System.out.print("¬ведите размеры массива через пробел");
		System.out.println();
		int m = sc.nextInt();
		int n = sc.nextInt();
		    Random rnd = new Random();
		         boolean[][] a = new boolean[m][n];
		         
		         System.out.print(" "+" ");
		         for (int j = 1; j<=n;j++){
		        	 System.out.print(j+"\t");}
		         
		         System.out.println();
		         
		    for (int i = 0; i<m; i++){
		    	System.out.print((i+1)+" ");
		        for (int j = 0; j<n;j++){
		        	a[i][j] = rnd.nextBoolean();
		        	if (a[i][j])  
		        			{System.out.print('*'+"\t");
		                    }
		        	else {
		        	    System.out.print(' '+"\t");
		                 }
		        
		        }
		        System.out.println();
	      }

}
}