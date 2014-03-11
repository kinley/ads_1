//��������� ����� PLUS � ��������
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
	public PLUS create(double R, double I){	//�������
		PLUS A=new PLUS();
		A.I=I;
		A.R=R;
		return A;
	}
	public double voltage(){	//��������� ����������
		PLUS A=this;
		double U=A.I*A.R;
		return U;
	}
	public double Power() {		//��������� ��������
		PLUS A = this;
		double W=A.I*A.voltage();
		return W;
	}
	public void inSeries(PLUS B){ //������. ���������� (������� ��������-������ ���� I,R, � ����� ��� ����������
		PLUS A=this;
		double U=A.voltage()+B.voltage();
		double R=A.R+B.R;
		System.out.println("��� ����������������: U="+U+" R="+R);
	}
	public void parallel(PLUS B){	//������������ ����������
		PLUS A=this;
		double I=A.I+B.I;
		double R=(A.R*B.R)/(A.R+B.R);
		System.out.println("��� ������������: I="+I+" R="+R);
	}
	public void Show(){	//������ ���������� �� �����
		PLUS A=this;
		System.out.println("���� ���� = "+I);
		System.out.println("������������� = "+R);
		System.out.println("���������� = "+A.voltage());
		System.out.println("�������� = "+A.Power());
	}
}
