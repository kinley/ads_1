package class_18;



class parallParam{//Описываем класс параллелограмма
	
	// Свойства класса
	public double d1;// Большая диагональ
	public double d2;// Малая диагональ
	public double ugol;// Меньший угол между диагоналями
	public double x;// Ширина
	public double y;// Длина
	public double u1;// Острый угол парал.
	public double u2;// Тупой угол парал.
	
	// Методы класса
	// Создать парал.
	public parallParam(double a, double b, double c){
		d1 = a;
		d2 = b;
		ugol = c;
		//Выводим на экран значения
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(ugol);
	}
	
	// Длины сторон
	public void lengthSides(){
		x = Math.sqrt(Math.pow( d1, 2 ) + Math.pow( d2, 2 ) - 2*d1*d2*Math.cos(ugol))/2;
		y = Math.sqrt(Math.pow( d1, 2 ) + Math.pow( d2, 2 ) + 2*d1*d2*Math.cos(ugol))/2;
		//Выводим на экран значения
		System.out.println(x);
		System.out.println(y);
	}
	// Углы
	public void angles(){
		u1 = Math.acos((Math.pow(x, 2)+Math.pow(y, 2)-Math.pow(d2, 2))/(2*x*y));
		u1 = 180 - (180 / Math.PI) * u1;
		u2 = 180 - u1;
		//Выводим на экран значения
		System.out.println(u1);
		System.out.println(u2);
	}
	// "Сжатие вытягивание"
	public void xysize(double k1, double k2){
		d1 = d1*k1;
		d2 = d2*k2;
		//Выводим на экран значения
		System.out.println(d1);
		System.out.println(d2);
	}
	// Area
	public void area(){
		double ar;
		ar = x*y* Math.sin(u1);
		//Выводим на экран значения
		System.out.println(ar);
	}
}

public class parall {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parallParam A= new parallParam(2,8,30);
		System.out.println("-----------Длины------------");
		A.lengthSides();
		System.out.println("-----------Углы------------");
		A.angles();
		System.out.println("-----------Площадь------------");
		A.area();
		System.out.println("-----------Растяжение------------");
		A.xysize(2,2);
		System.out.println("-----------Новые значения сторон------------");
		A.lengthSides();
		System.out.println("-----------Новая площадь------------");
		A.area();
		System.out.println("-----------------------");
	}

}
