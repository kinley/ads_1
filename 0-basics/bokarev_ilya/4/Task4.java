import java.util.*;

//реализация алгоритма Евклида по поиску НОД двух чисел
public class Task4 {

	public static int Euclid(int p, int q) {
		if (q == 0)
			return p;
		int r = p % q;
		System.out.println("Промежуточные значения p и q: " + q + " " + r);
		return Euclid(q, r);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите два числа, НОД которых нужно найти:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print("НОД введенных чисел равен " + Euclid(a, b));
		sc.close();
	}

}