
import java.util.*;
public class nod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("НОД"+ "\n" + "Введите два числа, через пробел");
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.println(nod(m, n));
	}
	public static int nod(int p, int q) {
	    if (q == 0) return p;
	    int c = p % q;
	    System.out.println(q+" "+c);
	    return nod(q, c);
	    }
}
