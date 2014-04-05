package edik;

import java.util.Scanner;

public class basics4 {
	public static void main( String args [] ) {
		Scanner sc = new Scanner ( System.in ) ;
		
		System.out.println( "Enter 2 numbers" ) ;
		int a = sc.nextInt() ;
		int b = sc.nextInt() ;	
		System.out.print ( "nod is " ) ;
		System.out.println ( nod( a , b )) ;
	}
	public static int nod ( int a, int b ) {
		if ( b == 0 ) return a ;
		int x = a % b ;
		return nod ( b, x ) ;
	}
}
