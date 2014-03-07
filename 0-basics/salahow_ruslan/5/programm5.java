package project1;

import java.util.Scanner;

public class programm5 {
	public static int Factorial(int n) {
		if (n!=1)
			return  n * Factorial(n-1);
		else
			return  1;
	}
	public static void main(String[] args) {
		double result;
		Scanner in = new Scanner(System.in);
		System.out.println("‚ведите число");
		int number =in.nextInt();
		result = Math.log(Factorial(number));
		System.out.print(result);
	}

}
