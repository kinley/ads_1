import Java.lang.Math;

public class Complex {
	// Класс, определяющий комплексное число в полярных (в первую очередь) координатах

	double r;
	double t;
	
	double a = r*Math.cos(t);
	double b = r*Math.sin(t);// Это можно было бы провернуть через отдельный класс со стандартной формой числа, 
    // но сейчас это лишнее усложение.

	// Равенство
	public Boolean compare(Complex numb1, Complex numb2) {
		if ((numb1.a == numb2.a) && (numb1.a == numb2.a)) return true;
		else return false;
	}
	
	// Сложение
    public Complex sum(Complex numb) {
        Complex sum = new Complex();
        sum.a = a + numb.a;
        sum.b = b + numb.b; 
        // Перевод из обычного вида в параметрический
        // Тут бы использовать switch , но у нас 2 параметра для сравнения, так что if проще
		if ((0 == a) & (0== b)) { r = 0; t = 0;} else
			if (0 == a) {r = b; t = Math.PI/2;}
			if (0 == b) {r = a; t = 0;}
		if ((a!=0.0) & (b!=0.0)) {
			sum.t = Math.atan(sum.b/sum.a);
			sum.r = sum.a/(Math.cos(sum.t));}
			return sum;
    }
    
    // Вычитание
	    public Complex subtr(Complex numb) {
			numb.a = -numb.a;
			numb.b = -numb.b;
			this.sum(numb);
	}
	// Умножение
	public Complex numb(Complex numb) {
		return new Complex(r*numb.r, t+numb.t);
	}
	// Деление
	public Complex divis(Complex numb) {
		return new Complex(r/numb.r, t-numb.t);
	}
	// Конструктор
	public Complex(double r, double t) {
		this.r = r;
		this.t = t;
	}
		public Complex() {
		this.r = 0;
		this.t = 0;
	}
	
	public static void main (String args[]) {
		
	}
}

