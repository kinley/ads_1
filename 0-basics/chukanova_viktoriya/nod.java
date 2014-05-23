import java.util.Scanner;
public class nod {
	
	public static int gcd (int a, int b) 
	{
	    if (b == 0)
	    {
	        return a;
	    }
	    else
	    {
	        return gcd (b, a % b);
	    }
	}
	public static void main(String[] args) 
	{
	    Scanner in = new Scanner(System.in);
	    int a = in.nextInt();
	    int b = in.nextInt();
	    System.out.println(gcd (a, b));
	}
}