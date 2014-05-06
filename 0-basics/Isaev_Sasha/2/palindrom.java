package palindrom;
import java.util.Scanner;
   public class palindrom {
	   public static void main(String[] args){
		   Scanner sc = new Scanner(System.in);
		   String stroka;
		   int n=0;
           int l;		   
        
           System.out.println("ВВедите слово");
		   stroka=sc.nextLine();
		   l=stroka.length();
           n=l/2;
           for (int i=0; i<n; i++) {  
        	   if  (stroka.charAt(i) != stroka.charAt(l-i-1)) {
        		   System.out.println("Это слово не палиндром");
        	   }
        	   else {
       	    	   System.out.println("Это слово  палиндром");
       	       }
           }  
       }
   }