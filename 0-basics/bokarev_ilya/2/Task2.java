import java.util.*;

//проверяет, является ли введенная строка палиндромом
public class Task2 {

	public static boolean isPalind(String s) {

		int a = s.length() / 2;
		for (int i = 0; i < a; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите строку:");
		String str = sc.nextLine();
		if (isPalind(str))
			System.out.println("Ваша строка - палиндром");
		else
			System.out.println("Ваша строка не является палиндромом");
		sc.close();
	}

}
