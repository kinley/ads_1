import java.util.*;
//lg(n!)
public class LOG {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("¬ведите n");
		int n = sc.nextInt();
		int result = factorial(n);
		System.out.printf("%.3f", Math.log(result));
	}

	public static int factorial(int n){
		if (n == 1) {return 1;}
		else {
		return n*factorial(n-1);}
	}
}
