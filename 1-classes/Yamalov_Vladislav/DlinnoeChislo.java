import java.math.BigInteger;
import java.util.Scanner;


public class DlinnoeChislo {
	public static int c;
	public static int b;
	public static long d;
	public static void main(String[] args){
		 Scanner sc=new Scanner(System.in);
		 c=sc.nextInt();
		 b=sc.nextInt();
		
	}
	public static long vichislit(int c, int b){
		double a=c*Math.pow(2, 15)+b;
		d=(new Double(a)).longValue();
		System.out.println(d);
		return d;
	}
	public void proizvedenie(){
		BigInteger f,l,e;
		l=BigInteger.valueOf(d);
		e=BigInteger.valueOf(c);
		f=l.multiply(e);
		System.out.println(f.toString());
	}
	public void summa(){
		BigInteger f,l,e;
		l=BigInteger.valueOf(d);
		e=BigInteger.valueOf(c);
		f=l.add(e);
		System.out.println(f.toString());
	}
	public void raznost(){
		BigInteger f,l,e;
		l=BigInteger.valueOf(d);
		e=BigInteger.valueOf(c);
		e=e.negate();
		f=l.add(e);
		System.out.println(f.toString());
		
	}
	public void sravn(){
		BigInteger l,e;
		l=BigInteger.valueOf(d);
		e=BigInteger.valueOf(c);
		int f=l.compareTo(e);
		System.out.println(f);
	}

}
