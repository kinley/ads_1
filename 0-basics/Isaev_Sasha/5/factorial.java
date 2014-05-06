package factorial;
import java.util.Scanner;
public class factorial {
	
	public static int fact(int k) {
		if (k == 0) 
			return 1;
		else
	        return k*fact(k-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ВВедите значение к");
		int k = sc.nextInt();
		System.out.println("Факториал равен " + fact(k));
	}
}
	


      
      
      
      

