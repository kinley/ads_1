

public class Parabola {
	private double a,b,c;
	public Parabola(){
	}
	
	public Parabola(double a, double b, double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public Parabola pCompression(double p){
		Parabola A = this;
		Parabola B = new Parabola();
		B.a=A.a*p;
		B.b=A.b;
		B.c=A.c;
		return B;
	}
	public Parabola shift(double dx, double dy){
		Parabola A = this;
		Parabola C = new Parabola();
		C.a=A.a;
		C.b=A.b+dx;
		C.c=A.c+dy;
		return C;
	}
	public boolean checkRoots(){
		Parabola A = this;
		if((2*A.a*A.b)*(2*A.a*A.b) - 4*A.a*(A.b*A.b+A.c) < 0) 
			return false;
		else
			return true;
		
	}
	public void findRoots(){
		Parabola A = this;
		double disc = A.b*A.b-4*A.a*A.c;
		double x1, x2;
		if (disc > 0){
			x1 = (-A.b+Math.sqrt(disc))/2*A.a;
			x2 = (-A.b-Math.sqrt(disc))/2*A.a;
		}
		if (disc == 0)
			x1 = -A.b/2*A.a;
		if (disc < 0)
			System.out.println("No roots.");
	}
	public static void main(String[] args) {
		Parabola A = new Parabola(3,8,15);
		A.pCompression(0);
		A.shift(0, 0);
		A.checkRoots();
		A.findRoots();
	}
}
