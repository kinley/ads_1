package Atazhanov_Emil;

import java.util.Scanner;

public class number2 {
public static void main (String[] args){
	int z = 0;
	Scanner in = new Scanner(System.in);
	String s;
	s = in.nextLine();
	char[] r = s.toCharArray();
	int length = r.length;
	for (int i=0; i<length/2;i++){
		if (r[i]==r[length-i-1]){
			z=1;}
			else 
			z=0;}
	if (z==1){
		System.out.println("yep");
		;}
	else
		System.out.println("nope");	
}

}
