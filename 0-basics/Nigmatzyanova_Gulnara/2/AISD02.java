

	import java.util.Scanner;

	public class AISD02 {

		public static void main(String[] args) {
			String stroka=new String(); Boolean s=true;
			Scanner c = new Scanner(System.in);
			System.out.print("¬ведите слово (буквы должны быть одного регистра): ");
			if(c.hasNextLine()) { 
			stroka= c.nextLine();
			};
			int dlina = stroka.length();
			if (dlina==0) s=false; //пуста€ строка Ч не палиндром
			for (int i = 0; i<dlina/2; i++) {
			if (stroka.charAt(i)!=stroka.charAt(dlina - i - 1))
			s = false;
			}
			if (s) System.out.println(" palindrom ");
			else System.out.println(" Ne palindrom ");
			}
			}

