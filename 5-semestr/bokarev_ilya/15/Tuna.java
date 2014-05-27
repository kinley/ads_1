//реализация Общества защиты тунца на основе списка пропусков
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Tuna {

	public static Dictionary goodGuys = new Dictionary();
	public static Dictionary badGuys = new Dictionary();

	public static void favor(String friend) {
		goodGuys.insert(friend);
		badGuys.delete(friend);
	}

	public static void unfavor(String foe) {
		badGuys.insert(foe);
		goodGuys.delete(foe);
	}

	public static void report(String subject) {
		if (goodGuys.member(subject))
			System.out.println(subject + " - это друг");
		else if (badGuys.member(subject))
			System.out.println(subject + " - это враг");
		else
			System.out.println("Нет данных о " + subject);
	}

	// основной метод проекта, обеспечивает ввод-вывод информации
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("in.txt"));
		char command = 0;
		String legistator;
		while (command != 'E') {
			legistator = sc.nextLine();
			command = legistator.charAt(0);
			if (legistator.length() > 2)
				legistator = legistator.substring(2, legistator.length());
			switch (command) {

			case 'F':
				favor(legistator);
				break;

			case 'U':
				unfavor(legistator);
				break;

			case '?':
				report(legistator);
				break;
			}

		}
		sc.close();
	}
}