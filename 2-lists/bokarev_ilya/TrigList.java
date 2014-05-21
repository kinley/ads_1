import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TrigList {

	// ����� ������ �����������
	public static void trigDerivative(List<TrigCoef> a) {
		TrigCoef n = a.returnHead();
		if (n.number == 0)
			a.firstDelete(); // ������� ������� ������� ��� ����������� ���������

		// ��������� ���������� �� ������
		for (TrigCoef x : a) { // ����� ����������� ������ � ��������
			int swap = -(x.cosCoef * x.number);
			x.cosCoef = x.sinCoef * x.number;
			x.sinCoef = swap;
		}

	}

	//���� ������������ �� ���������� ����� � ������������� ������
	//�������� - ��� �����
	public static List<TrigCoef> trigInput(String s)
			throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream(s));
		List<TrigCoef> list = new List<TrigCoef>();
		if (sc.hasNext()) { // ���� � ����� ���� ������������
			int a = sc.nextInt();
			if (a != 0)
				list.firstInsert(new TrigCoef(0, a, 0));
		}
		int cos = 0;
		int sin = 0;
		int number = 1;
		while (sc.hasNext()) { // ���� � ����� ���� �������������� �����������
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

	// ����� ������� ������������ ����������
	public static void trigOutput(List<TrigCoef> a) {
		int i = 1;
		TrigCoef n = a.returnHead();
		if (n.number == 0) { // ��������� �������� �����������
			int coef = n.cosCoef + n.sinCoef;
			System.out.print(coef + " ");
		} else
			System.out.print("0" + " ");
		for (TrigCoef x : a) {
			if (x.number != 0) { // ������� ����������� ��� ��������� ��������
				if (x.number == i) // ���� ��� ��������� �� ������� ����������
					System.out.print(x.cosCoef + " " + x.sinCoef + " "); // ������� ��� �� �����
				else { // ����� ������� ����� ��� ������ ���������� �����
					for (int j = 0; j < 2 * (x.number - i); j++)
						System.out.print("0" + " ");
					System.out.print(x.cosCoef + " " + x.sinCoef + " ");
				}
				i = x.number + 1;
			}
		}
		System.out.println(); // ������� ������� �� ����� ������
	}

	//������������ �������
	public static void main(String[] args) throws FileNotFoundException {
		List<TrigCoef> a = trigInput("in.txt");
		trigOutput(a);
		trigDerivative(a);
		trigOutput(a);
	}

}