import java.util.Scanner;

public class Parentheses {

	//проверка правильности скобочной последовательности
	public static boolean isRight(String s) {
		CharStack st = new CharStack();
		char bracket;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			switch (c) {

			case '(':
			case '[':
			case '{':
				st.push(c);
				break;

			case ')':
				if (st.isEmpty())
					return false;
				else {
					bracket = st.pop();
					if (bracket != '(')
						return false;
				}
				break;

			case ']':
				if (st.isEmpty())
					return false;
				else {
					bracket = st.pop();
					if (bracket != '[')
						return false;
				}
				break;

			case '}':
				if (st.isEmpty())
					return false;
				else {
					bracket = st.pop();
					if (bracket != '{')
						return false;
				}
				break;

			}
		}

		if (st.isEmpty())
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите скобочную последовательность:");
		String str = sc.nextLine();
		System.out.print(isRight(str));
		sc.close();
	}

}