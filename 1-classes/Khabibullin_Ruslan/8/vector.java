//Отдельный класс vector с методами
public class vector {
	private double a,b;
	public vector(double a,double b){
		this.a=a;
		this.b=b;
	}

	public double getA(){
		return this.a;
	}
	
	public double getB(){
		return this.b;
	}
	
	public vector summa(vector B){ 		//Сумма двух векторов
		vector C=new vector(this.a+B.a,this.b+B.b);
		return C;
	}
	
	public vector raznost(vector B){		//Разность
		vector C=new vector(B.a-this.a,B.b-this.b);
		return C;
	}
	
	public vector skalar(int n){	//Получив скаляр, умножаем на него вектор
		vector C=new vector(this.a*n,this.b*n);
		return C;
	}
	
	public double multiple(vector B){ 		//Скалярное произведение двух векторов
		return this.a*B.a+this.b*B.b;
	}
	
	public void show(){
		System.out.println("X= "+getA()+"  Y= "+getB());	//Просто вывод вектора
	}
}
