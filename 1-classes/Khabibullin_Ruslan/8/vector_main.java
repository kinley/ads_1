import java.util.Scanner;
public class vector_main {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	vector A=new vector();
	vector B=new vector();
	System.out.println("������� x � y");
	double x=in.nextDouble();
	double y=in.nextDouble();
	A=A.create(x, y);
	System.out.println("������ ������");
	System.out.println("������� x � y");
	double x1=in.nextDouble();
	double y1=in.nextDouble();
	B=B.create(x1, y1);	//������� ��� �������, � ������� ������ .create(double x,double y)
	A=A.summa(B);	//��������� ����� ���� ��������
	System.out.print("�����: ");
	A.show();	//�������
	A=A.raznost(B);		//��������� �� �������� � �������
	System.out.print("��������: ");
	A.show();
	System.out.println("������� ������");	//�������� �� ������ � �������
	int n=in.nextInt();
	A=A.skalar(n);
	A.show();
	A.multiple(B);	//��������� ������������, ����� ����� ������ ������
	}
}
