
import java.util.Scanner;
public class NOD {
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 int p;
		 int q;
		 p = sc.nextInt();
		 q = sc.nextInt();
		 
		 if (p==q) 
		   System.out.println("Наибольшим общим делителем является " + q ); 
		 
		 else {  
			 while (p != q)  
				 if  (p > q) {
					 p = p - q;
					 System.out.print(q);
		 		  	 System.out.print(" ");
		 		  	 System.out.print(p);
		 		  	 System.out.println(" ");         
				 }
		 
		 	     else {
		 	    	 q = q - p;
		 		 	 System.out.println(" ");
		 		 	 System.out.print(q);
		 		   	 System.out.print(p);
		 		 	 System.out.print(" ");
		 	     }   
			 
		 
			 System.out.println(" ");
			 System.out.println("Наибольшим общим делителем является " + q );
		 }
	 }
}


