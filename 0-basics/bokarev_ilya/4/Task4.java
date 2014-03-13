import java.util.*;

//���������� ��������� ������� �� ������ ��� ���� �����
public class Task4 {

	public static int Euclid(int p, int q) {
		if (q == 0)
			return p;
		int r = p % q;
		System.out.println("������������� �������� p � q: " + q + " " + r);
		return Euclid(q, r);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������� ��� �����, ��� ������� ����� �����:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print("��� ��������� ����� ����� " + Euclid(a, b));
		sc.close();
	}

}