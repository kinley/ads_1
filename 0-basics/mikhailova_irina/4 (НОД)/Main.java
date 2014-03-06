import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
    	    int first=0, second=0;
    	    Scanner sc = new Scanner(System.in);
            System.out.print("Введите 2 числа");
            if(sc.hasNextInt()) { 
              first= sc.nextInt();
              second= sc.nextInt();
            };
            while (second!=0) {
            	int ost = first%second;
            	first = second;
            	second = ost;
            };
           System.out.println ("НОД="+ first); 
    }   
}
