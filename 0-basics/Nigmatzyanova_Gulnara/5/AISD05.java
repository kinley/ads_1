
import java.util.Scanner;

public class AISD05 {
	public static int Fact(int n) {
		if (n!=1)
			return  n * Fact(n-1);
		else
			return  1;
	}
	public static void main(String args[]) {
		
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ведите число");
		int n1 = sc.nextInt();
		System.out.print(Math.log(Fact(n1)));
		sc.close();
	}

}