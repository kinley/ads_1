package Семенова_Екатерина;
//3_zadanie

import java.util.Scanner;
public class File {

private static Scanner in;

public static void main(String[] args) {
int i,index=0;
String name,digit1="",digit2="";
in = new Scanner(System.in);
System.out.println("Введите число строк");
String n=in.nextLine();
double n1=Double.parseDouble(n);
for(i=0;i<(int)n1;i++){
System.out.println("Введите строку");
String stroka=in.nextLine();
index=stroka.indexOf(' ');
name=stroka.substring(0,index);
digit1=stroka.substring(index+1,stroka.length());
index=digit1.indexOf(' ');
digit2=digit1.substring(index+1,digit1.length());
digit1=digit1.substring(0,index);
double x=Double.parseDouble(digit1);
double y=Double.parseDouble(digit2);
double answer=x/y;
System.out.printf("%5s %1s %1s %.3f",name,digit1,digit2,answer);
System.out.println();
digit1="";
digit2="";
};

};
}