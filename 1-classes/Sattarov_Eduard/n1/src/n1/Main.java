package n1;
//задание 8
import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		System.out.println("Введите X, Y первого вектора");
		Scanner sc = new Scanner(System.in);
		Vector v1 = new Vector(sc.nextDouble(), sc.nextDouble());
		System.out.println("Выберите действие: '+', '-', '*', 'abcos': ");
		sc.nextLine();
		String command = sc.nextLine();
		if(command.equals("+") == true)
		{
			System.out.println("Введите X, Y второго вектора");
			Vector v2 = new Vector(sc.nextDouble(), sc.nextDouble());
			v1.Plusing(v2);
		}
		else
		{
			if(command.equals("-") == true)
			{
				System.out.println("Введите X, Y второго вектора");
				Vector v2 = new Vector(sc.nextDouble(), sc.nextDouble());
				v1.Minusing(v2);
			}
			else
			{
				if(command.equals("*") == true)
				{
					System.out.println("Введите константу");
					v1.ConstConj(sc.nextDouble());
				}
				else
				{
					if(command.equals("abcos"))
					{
						System.out.println("Введите X, Y второго вектора");
						Vector v2 = new Vector(sc.nextDouble(), sc.nextDouble());
						System.out.println(v1.ScalarConj(v2));
					}
					else
					{
						System.out.println("Такой команды не существует");
					}
				}
			}
		}
	}
}
