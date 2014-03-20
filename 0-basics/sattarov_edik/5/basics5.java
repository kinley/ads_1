package edik;

import java.util.Scanner;

public class basics5 {
	public static void main( String args [] ) {
		Scanner sc = new Scanner ( System.in ) ;
		
		System.out.println( "Enter a number" ) ;
		int x = sc.nextInt() ;
		
		System.out.print ( "Ln(õ!) is " ) ;
		System.out.print ( Math.log10 ( fac ( x ))) ;
	}
	public static int fac ( int x ) {
		if ( x == 0 )
			return 1 ;
		x = x * fac ( x - 1 ) ;
		return x ;
	}
}
