package project1;

import java.util.Scanner;

public class programm3 {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 Scanner in1 = new Scanner(System.in);
		 System.out.println("количество строк");
		 int n =in1.nextInt();
		 for (int i=1;i<=n;++i) { 
		 		String name, str =in.nextLine();
		 		int index = str.indexOf(" ");
		 		name=str.substring(0,index);
		 		
		 		str=str.substring(index+1,str.length());
		 		index = str.indexOf(" ");
		 		
		 		double  digit1=Double.parseDouble(str.substring(0,index));
		 		double  digit2=Double.parseDouble(str.substring(index+1,str.length()));
		 		double result = digit1/digit2;
		 		
	     System.out.printf("%5s %5s %5s  %.3f %n",name,digit1,digit2,result); }
	 }	

}
