import java.util.Scanner;
public class Полиндром {

	public static void main(String[] args) {
	{
	    int i=0, a=1;
	    String stroka2="";
	    System.out.println("Введите строку");
	    Scanner in = new Scanner(System.in);
	    String stroka = in.next();
	    int n=in.nextInt();
	    for(i=stroka.length()-1; i>=0; i--) {
	    	stroka2+=stroka.charAt(i);
	    };
	    
	    	if(stroka.equals(stroka2)){
	    		System.out.print("полиндром");
	}
	        else System.out.print("не полиндром");
	}
	}}