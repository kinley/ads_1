//��������� ����� vector � ��������
public class vector {
	public double a,b;
	public vector(){
		this.a=0;
		this.b=0;
	}
	public vector(double a,double b){
		this.a=a;
		this.b=b;
	}
	public vector create(double a,double b){
		vector A=new vector();
		A.a=a;
		A.b=b;
		return A;
	}
	public vector summa(vector B){ 		//����� ���� ��������
		vector A=this;
		vector C=new vector();
		C.a=A.a+B.a;
		C.b=A.b+B.b;
		return C;
	}
	public vector raznost(vector B){		//��������
		vector A=this;
		vector C=new vector();
		C.a=B.a-A.a;
		C.b=B.b-A.b;
		return C;
	}
	public vector skalar(int n){	//������� ������, �������� �� ���� ������
		vector A=this;
		vector C=new vector();
		C.a=A.a*n;
		C.b=A.b*n;
		return C;
	}
	public void multiple(vector B){ 		//��������� ������������ ���� ��������
		vector A=this;
		double rez=A.a*B.a+A.b*B.b;
		System.out.println("��������� ������������ �������� = "+rez);
	}
	public void show(){
		System.out.println("X= "+a+"  Y= "+b);	//������ ����� �������
	}
}
