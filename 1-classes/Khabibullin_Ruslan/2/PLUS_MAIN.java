import java.util.Scanner;
public class PLUS_MAIN {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	PLUS A=new PLUS();
	PLUS B=new PLUS();
	System.out.println("������� I � R");
	double I=in.nextDouble();
	double R=in.nextDouble();
	A=A.create(R, I);	//������� ���������� (��. ���� PLUS)
	A.Show();		//������� ��� (������� ��� � ���������� � ��������)
	System.out.println("������ ������");
	System.out.println("������� I � R");
	double I1=in.nextDouble();
	double R1=in.nextDouble();
	B=B.create(R1, I1);		
	B.Show();		//������� ������ ������ (���� �����)
	A.inSeries(B);		//��� ������. ����������
	A.parallel(B);		//��� ������������ (������ �� ���� ������� ������� ���������)
}
}
