package n2;
//задание 12(4.2)
public class Main
{
	public static void main(String args[])
	{
		List polinom1 = new List();
		List polinom2 = new List();
		System.out.println("Первый полином.");
		polinom1.InputPolinom();
		System.out.println("Второй полином.");
		polinom2.InputPolinom();
		System.out.println("Первый полином:");
		polinom1.PrintPolinom();
		System.out.println("Второй полином:");
		polinom2.PrintPolinom();
		polinom1.PlusPolinom(polinom2);
		polinom1.FindUseless();
		System.out.println("Результат сложения:");
		polinom1.PrintPolinom();
	}
}
