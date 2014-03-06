import java.util.Scanner;


public class nod {

	public static void main(String[] args) {
		int p = 0, q = 0; 
		Scanner sc = new Scanner(System.in);
    System.out.print("Введите два числа");
    if(sc.hasNextInt()) {
    	p = sc.nextInt();
    	q = sc.nextInt();
    	};
    while (q != 0) {
    	int ost = p % q;
    	p = q;
    	q = ost;
    }
   System.out.print("НОД=" +p);
	}

}
