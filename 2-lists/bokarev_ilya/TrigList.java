import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TrigList {

	// метод взятия производной
	public static void trigDerivative(List<TrigCoef> a) {
		TrigCoef n = a.returnHead();
		if (n.number == 0)
			a.firstDelete(); // удаляем нулевой элемент как производную константы

		// пройдемся итератором по списку
		for (TrigCoef x : a) { // берем производную синуса и косинуса
			int swap = -(x.cosCoef * x.number);
			x.cosCoef = x.sinCoef * x.number;
			x.sinCoef = swap;
		}

	}

	//ввод коэффицентов из текстового файла с формированием списка
	//параметр - имя файла
	public static List<TrigCoef> trigInput(String s)
			throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream(s));
		List<TrigCoef> list = new List<TrigCoef>();
		if (sc.hasNext()) { // если в файле есть коэффициенты
			int a = sc.nextInt();
			if (a != 0)
				list.firstInsert(new TrigCoef(0, a, 0));
		}
		int cos = 0;
		int sin = 0;
		int number = 1;
		while (sc.hasNext()) { // пока в файле есть необработанные коэффиценты
			cos = sc.nextInt();
			sin = sc.nextInt();
			if (sin != 0 || cos != 0)
				list.lastInsert(new TrigCoef(number, cos, sin));
			number++;
			cos = 0;
			sin = 0;
		}
		sc.close();
		return list;
	}

	// вывод вектора коэффицентов многочлена
	public static void trigOutput(List<TrigCoef> a) {
		int i = 1;
		TrigCoef n = a.returnHead();
		if (n.number == 0) { // обработка нулевого коэффицента
			int coef = n.cosCoef + n.sinCoef;
			System.out.print(coef + " ");
		} else
			System.out.print("0" + " ");
		for (TrigCoef x : a) {
			if (x.number != 0) { // нулевой коэффициент уже обработан отдельно
				if (x.number == i) // если это следующий по порядку коэффицент
					System.out.print(x.cosCoef + " " + x.sinCoef + " "); // выводим его на экран
				else { // иначе выводим перед ним нужное количество нулей
					for (int j = 0; j < 2 * (x.number - i); j++)
						System.out.print("0" + " ");
					System.out.print(x.cosCoef + " " + x.sinCoef + " ");
				}
				i = x.number + 1;
			}
		}
		System.out.println(); // перевод курсора на новую строку
	}

	//тестирование методов
	public static void main(String[] args) throws FileNotFoundException {
		List<TrigCoef> a = trigInput("in.txt");
		trigOutput(a);
		trigDerivative(a);
		trigOutput(a);
	}

}