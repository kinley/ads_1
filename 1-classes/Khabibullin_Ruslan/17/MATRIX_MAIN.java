import java.util.Scanner;
public class MATRIX_MAIN {
public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		MATRIX matrix = new MATRIX();
		MATRIX matrix2=new MATRIX();
		matrix=matrix.create();		//������� ������� 1 � 2 (��� ����. �������� � ������)
		matrix2=matrix.create();
		System.out.println("������ �������");	//���������� ������ �������
		matrix.Show();
		System.out.println("������ �������");
		matrix2.Show();
		System.out.println("����� ���� ������"); //�������� ����� ������������ ������, ����� ����������
		matrix=matrix.summa(matrix2);
		matrix.Show();
		System.out.println("�������� ���� ������");
		matrix=matrix.raznost(matrix2);		//����������, �� ��� ��������
		matrix.Show();
		System.out.println("������� ������");	//�������� ������� �� ����� �� ����� ����� � �������
		int n=in.nextInt();
		matrix=matrix.skalar(n);
		System.out.println("��������� �������(��������) �� �������");	
		matrix.Show();
		matrix=matrix.multiplication(matrix2);
		System.out.println("��������� ������� �� ������");	//����������� �������
		matrix.Show();
		System.out.println("������������ �������");	//������� ������������ � ������� ���
		matrix.Determinant();
		}

}
