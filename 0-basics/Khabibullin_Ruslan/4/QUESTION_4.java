import java.util.Scanner;
public class QUESTION_4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nod=0;
		System.out.println("¬ведите a");
		int a=in.nextInt();
		System.out.println("¬ведите b");
		int b=in.nextInt();
		while((a != 0) && (b != 0)){
			if(a >= b)  {
							a= a % b;
			}
			else b=b % a;
			nod=a+b;
			};
		System.out.println(nod);
		};
		
	}


