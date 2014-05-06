package hellointerval;
import java.util.Scanner;
public class Interval_Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int d=in.nextInt();
		int  wingspan,summa,raznost,chastnoe,MinProizv,MaxProizv;
		Interval IntervalnoeChislo = new Interval(a,b,c,d);	
		
		IntervalnoeChislo.razmah();
	   	
		IntervalnoeChislo.granitsa();
	    
	    IntervalnoeChislo.summa();
	    
	    IntervalnoeChislo.raznostb();
	   
	    IntervalnoeChislo.chastnoe();
	
	    IntervalnoeChislo.proizvedenie();
	
	
	
	
	
	}
	
	
	
}
