package n1;
//������� 8
import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		System.out.println("������� X, Y ������� �������");
		Scanner sc = new Scanner(System.in);
		Vector v1 = new Vector(sc.nextDouble(), sc.nextDouble());
		System.out.println("�������� ��������: '+', '-', '*', 'abcos': ");
		sc.nextLine();
		String command = sc.nextLine();
		if(command.equals("+") == true)
		{
			System.out.println("������� X, Y ������� �������");
			Vector v2 = new Vector(sc.nextDouble(), sc.nextDouble());
			v1.Plusing(v2);
		}
		else
		{
			if(command.equals("-") == true)
			{
				System.out.println("������� X, Y ������� �������");
				Vector v2 = new Vector(sc.nextDouble(), sc.nextDouble());
				v1.Minusing(v2);
			}
			else
			{
				if(command.equals("*") == true)
				{
					System.out.println("������� ���������");
					v1.ConstConj(sc.nextDouble());
				}
				else
				{
					if(command.equals("abcos"))
					{
						System.out.println("������� X, Y ������� �������");
						Vector v2 = new Vector(sc.nextDouble(), sc.nextDouble());
						System.out.println(v1.ScalarConj(v2));
					}
					else
					{
						System.out.println("����� ������� �� ����������");
					}
				}
			}
		}
	}
}
