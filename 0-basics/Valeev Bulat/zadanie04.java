package class_18;
import java.util.Scanner;

public class zadanie04 {
	//��������� ������� � ��������� �������
	public static void nod(int x, int y){
		//�������� ���������� ���
		while(x!=0 && y!=0){
		    if(x > y)//������� ������� ��������
		        x = x % y;
		    else
		        y = y % x;
		}
		System.out.println(x+y);
	}
	public static void main(String[] args) {
	//��������� ��� �����
	Scanner r=new Scanner(System.in);
	System.out.println("������� ��� ����� ����� ������");
	int a=r.nextInt();
	int b=r.nextInt();
	
	nod(a, b);
	
	}
}
