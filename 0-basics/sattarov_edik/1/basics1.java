package edik;

import java.util.Random;

public class basics1 {
    public static void main( String[] args ) {
        int Size1 = 10 ;
        int Size2 = 20 ;
        int[][] array = new int[Size1][Size2] ;
        Random a = new Random() ;
        
        for ( int i = 0 ; i < Size1 ; i++ ) {
            for ( int j = 0 ; j < Size2 ; j++ ) {
                array[i][j] = 0 + a.nextInt(1 + 1) ;
            }
        }
        for ( int i = 0 ; i < Size1 ; i++ ) {
            for ( int j = 0 ; j < Size2 ; j++ ) {
            	if ( array[i][j] == 0 ) {
            	System.out.print (' ') ;
            	} 
            	else 
            		System.out.print('*') ;
            }
            System.out.println();
        }
    }
}