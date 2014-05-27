package class_18;



class parallParam{//��������� ����� ���������������
	
	// �������� ������
	public double d1;// ������� ���������
	public double d2;// ����� ���������
	public double ugol;// ������� ���� ����� �����������
	public double x;// ������
	public double y;// �����
	public double u1;// ������ ���� �����.
	public double u2;// ����� ���� �����.
	
	// ������ ������
	// ������� �����.
	public parallParam(double a, double b, double c){
		d1 = a;
		d2 = b;
		ugol = c;
		//������� �� ����� ��������
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(ugol);
	}
	
	// ����� ������
	public void lengthSides(){
		x = Math.sqrt(Math.pow( d1, 2 ) + Math.pow( d2, 2 ) - 2*d1*d2*Math.cos(ugol))/2;
		y = Math.sqrt(Math.pow( d1, 2 ) + Math.pow( d2, 2 ) + 2*d1*d2*Math.cos(ugol))/2;
		//������� �� ����� ��������
		System.out.println(x);
		System.out.println(y);
	}
	// ����
	public void angles(){
		u1 = Math.acos((Math.pow(x, 2)+Math.pow(y, 2)-Math.pow(d2, 2))/(2*x*y));
		u1 = 180 - (180 / Math.PI) * u1;
		u2 = 180 - u1;
		//������� �� ����� ��������
		System.out.println(u1);
		System.out.println(u2);
	}
	// "������ �����������"
	public void xysize(double k1, double k2){
		d1 = d1*k1;
		d2 = d2*k2;
		//������� �� ����� ��������
		System.out.println(d1);
		System.out.println(d2);
	}
	// Area
	public void area(){
		double ar;
		ar = x*y* Math.sin(u1);
		//������� �� ����� ��������
		System.out.println(ar);
	}
}

public class parall {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parallParam A= new parallParam(2,8,30);
		System.out.println("-----------�����------------");
		A.lengthSides();
		System.out.println("-----------����------------");
		A.angles();
		System.out.println("-----------�������------------");
		A.area();
		System.out.println("-----------����������------------");
		A.xysize(2,2);
		System.out.println("-----------����� �������� ������------------");
		A.lengthSides();
		System.out.println("-----------����� �������------------");
		A.area();
		System.out.println("-----------------------");
	}

}
