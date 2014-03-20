package edik;

import java.util.Scanner;

public class basics2 {

	public static void main( String args[] ) {
		String string1, string2 = "" ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println( "Enter a string" ) ;
		string1 = sc.nextLine() ;
		
		for ( int i = string1.length() - 1 ; i >= 0 ; i-- )
			string2 = string2 + string1.charAt(i) ;
		
		if ( string1.equals ( string2 ))
			System.out.println ( "Its a palindrome" ) ;
		else
			System.out.println ( "Its not a palindrome" ) ;
	}
}
