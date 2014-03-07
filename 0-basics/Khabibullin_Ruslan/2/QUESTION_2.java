import java.util.Scanner;
public class QUESTION_2 {

	public static void main(String[] args) {
		int i=0,a=1;
		String stroka2="";
		System.out.println("¬веди строку");
		Scanner in = new Scanner(System.in);
		String stroka=in.next();
		for(i=stroka.length()-1;i>=0;i--){
			stroka2+=stroka.charAt(i);
			};
			
			if(stroka.equals(stroka2)) {
				System.out.print("palindrom");
				}
				else System.out.print("ne palindrom");
		
		};
	}
		
	


