////Отдельный класс PLUS с методами
public class PLUS {
	public double R,I;
	
	public PLUS(double R, double I){
		this.I=I;
		this.R=R;
	}

	public double getR(){
		return this.R;
	}
	
	public double getI(){
		return this.I;
	}
	
	public double voltage(){	
		return this.I * this.R;
	}
	
	public double Power() {		
		return this.I*this.voltage();
	}
	
	public void inSeries(PLUS B){ 
		double U=this.voltage()+B.voltage();
		double R=this.R+B.R;
		System.out.println("При последовательном: U="+U+" R="+R);
	}
	
	public void parallel(PLUS B){	
		double I=this.I+B.I;
		double R=(this.R*B.R)/(this.R+B.R);
		System.out.println("При параллельном:: I="+I+" R="+R);
	}
	
	public void Show(){	
		System.out.println("Сила тока = "+getI());
		System.out.println("Сопротивление = "+getR());
		System.out.println("Напряжение = "+voltage());
		System.out.println("Мощность = "+Power());
	}
}
