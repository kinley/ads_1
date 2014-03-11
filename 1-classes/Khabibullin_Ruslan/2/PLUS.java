//Отдельный класс PLUS с методами
public class PLUS {
	public double R,I;
	public PLUS() {
		this.I=0;
		this.R=0;
	}
	public PLUS(double R, double I){
		this.I=I;
		this.R=R;
	}
	public PLUS create(double R, double I){	//Создаем
		PLUS A=new PLUS();
		A.I=I;
		A.R=R;
		return A;
	}
	public double voltage(){	//Вычисляем напряжение
		PLUS A=this;
		double U=A.I*A.R;
		return U;
	}
	public double Power() {		//Вычисляем мощность
		PLUS A = this;
		double W=A.I*A.voltage();
		return W;
	}
	public void inSeries(PLUS B){ //Послед. соединение (входной параметр-вторая пара I,R, в итоге тут двуплюсник
		PLUS A=this;
		double U=A.voltage()+B.voltage();
		double R=A.R+B.R;
		System.out.println("При последовательном: U="+U+" R="+R);
	}
	public void parallel(PLUS B){	//Параллельное соединение
		PLUS A=this;
		double I=A.I+B.I;
		double R=(A.R*B.R)/(A.R+B.R);
		System.out.println("При параллельном: I="+I+" R="+R);
	}
	public void Show(){	//Просто показываем на экран
		PLUS A=this;
		System.out.println("Сила тока = "+I);
		System.out.println("Сопротивление = "+R);
		System.out.println("Напряжение = "+A.voltage());
		System.out.println("Мощность = "+A.Power());
	}
}
