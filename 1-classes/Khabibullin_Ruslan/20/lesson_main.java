import java.util.Scanner;
public class lesson_main {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	lesson A=new lesson();		//������� ��� ���������� ���� lesson (��. ����� lesson, � ������ lesson)
	lesson B=new lesson();
	lesson C=new lesson();		//�� �������, ������ ����������� �� �������, �� �������� ������� �������(lesson)
	System.out.println("������� ��� �������������");	//�������� ������� 1-�� ������� (A), � ����� � ������ (B)
	String FIO=in.nextLine();
	System.out.println("������� ����� ������");
	String nomer1=in.nextLine();
	int nomer=(int) Double.parseDouble(nomer1);
	System.out.println("������� ��������");
	String WhatWhen=in.nextLine();
	System.out.println("������� ���");
	String Where=in.nextLine();
	A=A.create(FIO, nomer, WhatWhen, Where);	//�������� ����� �������� ������� lesson ��� ���������� �
	System.out.println("������� ��� �������������");
	String FIO2=in.nextLine();
	System.out.println("������� ����� ������");
	String nomer3=in.nextLine();
	int nomer2=(int) Double.parseDouble(nomer1);
	System.out.println("������� ��������");
	String WhatWhen2=in.nextLine();
	System.out.println("������� ���");
	String Where2=in.nextLine();
	B=B.create(FIO2, nomer2, WhatWhen2, Where2); //���� ����� ��� ������� ������� B
	if(A.checking(B)==1){		//���� 2 ������� ����� ����������, �� "���������" � ���������� ���������
		A=A.merge(B);
		A.show();
	}
	else {		// ����� � ������� � ����� ����� �������������, ����� ���������� ������� A
		System.out.println("������� ��� ������ �������");
		String stroka=in.nextLine();
		A=A.fio_change(stroka); 
		A.show();
	};
	C=A.sub_create(B);		//���������� �, ��������� � ������� � �� ��������, ��� � ������� B
	C.show();		//���������� ������� �
	}
}
