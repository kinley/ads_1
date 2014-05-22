package Atazhanov_Emil;

public class Triangle {
	
	public static double xa, ya, xb, yb, xc, yc, AB, BC, AC, Alfa, Beta, Gamma, Sq;
	@SuppressWarnings("static-access")
	public Triangle(double xa, double ya, double xb, double yb, double xc, double yc){
		this.xa=xa;
		this.xb=xb;
		this.xc=xc;
		this.ya=ya;
		this.yb=yb;
		this.yc=yc;
	}
	@SuppressWarnings("static-access")
	public void Show(){
		Triangle A = this;
		System.out.print("Треугольник с вершинами в точках: A("+A.xa+","+A.ya+"), B("+A.xb+","+A.yb+"), C("+A.xc+","+A.yc+")");
	}
	public void Length(double AB, double BC, double AC){
		this.AB=Math.sqrt((xb-xa)*(xb-xa)+(yb-ya)*(yb-ya));
		this.BC=Math.sqrt((xc-xb)*(xc-xb)+(yc-yb)*(yc-yb));
		this.AC=Math.sqrt((xc-xa)*(xc-xa)+(yc-ya)*(yc-ya));
	
		
		
	}
	public void Angle(double Alfa, double Beta, double Gamma) {
		this.Alfa=Math.toDegrees(Math.acos((AC*AC+AB*AB-BC*BC)/(2*AC*AB)));
		this.Beta=Math.toDegrees(Math.acos((BC*BC+AB*AB-AC*AC)/(2*AB*BC)));
		this.Gamma=Math.toDegrees(Math.acos((AC*AC+BC*BC-AB*AB)/(2*AC*BC)));
	}
	public void Square(double Sq){
		this.Sq=(BC*AC*Math.sin(Gamma))/2;	
	}
	
	public static void main(String[] args){
		Triangle A = new Triangle(1,2,1,9,6,1);
		A.Show();
		System.out.println();
		A.Length(AB, BC, AC);
		System.out.println("Длина AB="+AB);
		System.out.println("Длина BC="+BC);
		System.out.println("Длина AC="+AC);
		A.Angle(Alfa, Beta, Gamma);
		System.out.println("Угол А="+Alfa);
		System.out.println("Угол B="+Beta);
		System.out.println("Угол C="+Gamma);
		A.Square(Sq);
		System.out.println("Площадь треугольника="+Sq);
		
	}

}
