import java.util.Scanner;
public class QUESTION_5 {
	public static int factorial (int n){
		if(n==0) return 1;
		n=n*factorial(n-1);
		return n;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double answer=1;
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите N");
		int n=in.nextInt();
		answer=Math.log10(factorial(n));
		System.out.println(answer);
	}

}
