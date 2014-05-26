import java.math.BigInteger;
import java.util.Scanner;


public class DlinnoeChislo {
	public static int c;
	public static long b;
	public static long d;
	public static void main(String[] args){
		 Scanner sc=new Scanner(System.in);
		 c=sc.nextInt();
		 b=sc.nextLong();
		
	}
	public static long vichislit(int c, long b){
		double a=c*Math.pow(2, 15)+b;
		long l=(new Double(a)).longValue();
		System.out.println(l);
		return l;
	}
	public void proizvedenie(){
		long t=d;
		BigInteger f,l,e;
		l=BigInteger.valueOf(d);
		e=BigInteger.valueOf(t);
		f=l.multiply(e);
		System.out.println(f.toString());
	}
	public void summa(){
		long t=d;
		BigInteger f,l,e;
		l=BigInteger.valueOf(d);
		e=BigInteger.valueOf(t);
		f=l.add(e);
		System.out.println(f.toString());
	}
	public void raznost(){
		long t=d;
		BigInteger f,l,e;
		l=BigInteger.valueOf(d);
		e=BigInteger.valueOf(t);
		e=e.negate();
		f=l.add(e);
		System.out.println(f.toString());
		
	}
	public void sravn(){
		long t=d;
		BigInteger l,e;
		l=BigInteger.valueOf(d);
		e=BigInteger.valueOf(t);
		int f=l.compareTo(e);
		System.out.println(f);
	}

}
