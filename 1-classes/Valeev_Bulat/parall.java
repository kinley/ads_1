package class_18;


class parallParam{//Описываем класс параллелограмма
	
	// Свойства класса
	private double d1;// Большая диагональ
	private double d2;// Малая диагональ
	private double ugol;// Меньший угол между диагоналями
	// Методы класса
	// Создать парал.
	public parallParam(double a, double b, double c){//Конструктор
		this.d1 = a;
		this.d2 = b;
		this.ugol = c;
	}

	// Длины сторон
	public double lengthSidesX(){
		double x = Math.sqrt(Math.pow( this.d1, 2 ) + Math.pow( this.d2, 2 ) - 2*this.d1*this.d2*Math.cos(this.ugol))/2;
		return x;
	}
	// Длины сторон
	public double lengthSidesY(){
		double y = Math.sqrt(Math.pow( this.d1, 2 ) + Math.pow( this.d2, 2 ) + 2*this.d1*this.d2*Math.cos(this.ugol))/2;
		return y;
	}
	// Углы 1
	public double angles1(){
		double u1 = Math.acos((Math.pow(lengthSidesX(), 2)+Math.pow(lengthSidesY(), 2)-Math.pow(this.d2, 2))/(2*lengthSidesX()*lengthSidesY()));
		u1 = 180 - (180 / Math.PI) * u1;
		return u1;
	}
	// Углы 2
	public double angles2(){
		double u2 = Math.acos((Math.pow(lengthSidesX(), 2)+Math.pow(lengthSidesY(), 2)-Math.pow(this.d2, 2))/(2*lengthSidesX()*lengthSidesY()));
		u2 = (180 / Math.PI) * u2;
		return u2;
	}
	// Area
	public double area(){
		double ar = lengthSidesX()*lengthSidesY()* Math.sin(angles1());
		return ar;
		
	}

	// "Сжатие вытягивание"
	public parallParam xysize(parallParam P, double k1, double k2){
		P.d1 = P.d1*k1;
		P.d2 = P.d2*k2;
		P.ugol = (180/Math.PI) * ((Math.pow(this.d1, 2)+Math.pow(this.d2, 2)-4*Math.pow(lengthSidesX(), 2))/(2*this.d1*this.d2));
		return P;
	}
}

public class parall {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parallParam A= new parallParam(2,8,30);
		
		System.out.println("-----------Длины------------");
		System.out.print(A.lengthSidesX()); 
		System.out.println("-----------Углы------------");
		A.angles1();
		System.out.println("-----------Площадь------------");
		A.area();
		System.out.println("-----------Растяжение------------");
		A.xysize(A,2,2);
		System.out.println("-----------Новые значения сторон------------");
		A.lengthSidesX();
	}

}
