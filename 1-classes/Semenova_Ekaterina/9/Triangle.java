package Семенова_Екатерина;

public class Triangle {
private double S;
private double h;
private double a1;

public Triangle() {
}

public Triangle(double S, double h, double a1) {
this.S=S;
this.h=h;
this.a1=a1;
}

public void calculating() {
Triangle A = this;
double d1 = 2*A.S/A.h;
double d2 = A.h/Math.toDegrees(Math.sin(A.a1));
double d3 = Math.sqrt(d1*d1+d2*d2-2*d1*d2*Math.toDegrees(Math.cos(A.a1)));
double a2 = Math.toDegrees(Math.asin(A.h/d3));
double a3 = 180 - A.a1-a2;
System.out.println(d1+" "+d2+" "+d3+" "+A.a1+" "+a2+" "+a3);
}
public Triangle trianglesame(double k) {
Triangle A = this;
Triangle B = new Triangle();
B.S=A.S * k*k;
B.h=A.h * k;
B.a1=A.a1;
return B;
}
public void calculatingsame() {
Triangle B = this;
double d1 = 2*B.S/B.h;
double d2 = B.h/Math.toDegrees(Math.sin(B.a1));
double d3 = Math.sqrt(d1*d1+d2*d2-2*d1*d2*(Math.toDegrees(Math.cos(B.a1))));
double a2 = Math.toDegrees(Math.asin(B.h/d3));
double a3 = 180 - B.a1-a2;
System.out.println(d1+" "+d2+" "+d3+" "+B.a1+" "+a2+" "+a3);
}

public static void main(String[] args) { 
Triangle A = new Triangle(20,5,90);
Triangle B = new Triangle(80,10,90);
A.calculating();
B.calculatingsame();
}
}