import java.util.*;

//рекурсивно вычисляется факториал n, затем выводится на экран натуральный логарифм от n!
public class Task5 {

	public static long Fac(long a) {
		if (a == 0)
			return 1;
		else
			return a * Fac(a - 1);
	}

	public static void main(String[] args) {
		long n = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.print(Math.log(Fac(n)));
		sc.close();
	}

}