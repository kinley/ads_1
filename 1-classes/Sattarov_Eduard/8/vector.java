package edik;

import java.util.Scanner;

public class vector{
	private int a, b;
	static int abcos;
	void init(int xx, int yy){
		a = xx; b = yy;
	}
	void plusing(vector vv){
		a = a+vv.a;
		b = b+vv.b;
	}
	void minusing(vector vv){
		a = a-vv.a;
		b = b-vv.b;
	}
	void constconjunction(int n){
		a = a*n;
		b = b*n;
	}
	int scalarconjunction(vector vv){
		abcos = a*vv.a+b*vv.b;
		return abcos;
	}
	public static void main(String args[]){
		vector v1 = new vector();
		vector v2 = new vector();
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите координаты первого вектора(x, y):");
		v1.init(sc.nextInt(), sc.nextInt());
		System.out.println("¬ведите координаты второго вектора(x, y):");
		v2.init(sc.nextInt(), sc.nextInt());
		v1.plusing(v2);
		System.out.println("v1+v2 = "+v1.a+", "+v1.b);
		
		v1.minusing(v2);
		System.out.println("v1+v2-v2 = "+v1.a+", "+v1.b);
		
		System.out.println("¬ведите константу, на которую надо умножить вектор: ");
		int n = sc.nextInt();
		v1.constconjunction(n);
		System.out.println("(v1+v2-v2)*"+n+" = "+v1.a+", "+v1.b);
		
		v1.scalarconjunction(v2);
		System.out.println("(v1+v2-v2)*"+n+"*v2*cos(v1, v2) = "+abcos);
	}
}