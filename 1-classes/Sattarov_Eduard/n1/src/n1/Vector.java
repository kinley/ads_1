package n1;

import java.util.Scanner;

public class Vector
{
	private double x;
	private double y;
	public Vector(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	public void Plusing(Vector v2)
	{
		x = x + v2.x;
		y = y + v2.y;
		System.out.println(x);
		System.out.println(y);
	}
	public void Minusing(Vector v2)
	{
		x = x - v2.x;
		y = y - v2.y;
		System.out.println(x);
		System.out.println(y);
	}
	public void ConstConj(double n)
	{
		x = x*n;
		y = y*n;
		System.out.println(x);
		System.out.println(y);
	}
	public double ScalarConj(Vector v2)
	{
		return x * v2.x + y * v2.y;
	}
}
