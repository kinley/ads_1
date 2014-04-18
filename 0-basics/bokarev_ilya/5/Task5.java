import java.util.Scanner;

// рекурсивное вычисление натурального логарифма от (n!)
public class Task5 {

	public static double logFac(int a) {
		if (a == 0)
			return 0;
		else
			return Math.log(a) + logFac(a - 1);
	}

	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(logFac(n));
		sc.close();
	}

}