/*������ (������ Y=k*X+b, �������� ����� (k,b)).
������ ������ - ������� ������, �-��������� ��������� �� ����� ������ 
������ (����������� ������������  �k� �� ��), ������������ d-����� 
(�� ������ (k,b) ���� ������ (k,b+d)), ��������� ���� ������ �� 
�������������� (��������� ������������� �k�), ����� ����� ����������� 
���� ������.
*/
import java.util.*;

public class LStraight {

	private int k;
	private int b;

	public LStraight(int k, int b){ 	//�����������
		this.k = k;
		this.b = b;
	}

	public void Povorot(int p){ 		//������� ������
			p = k*p;
			Print(p,b);

	}

	public void Move(int d){ 		//�������� ������
			int bm = b+d;
			Print(k, bm);
	}

	public boolean Parall(LStraight l){ 	//�������� �� ��������������
			if (l.k == k) {
				return(true);
			}
			else{
				return(false);
			}
	}

	public void Cross(LStraight l){		//����� �����������
			double x = (l.b-b)/(k-l.k);
			System.out.print("("+x+" , "+ (k*x+b)+')');
	}

	public void Print(int k, int b){	//����� ������
			System.out.println("y="+k+'x'+'+'+b);
	}



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������������ ������. y=kx+b. k?  b?");
		LStraight l1 = new LStraight(sc.nextInt(), sc.nextInt());
		
		System.out.println("������� ���� ��������");
		l1.Povorot(sc.nextInt());
		
		System.out.println("������� �� ������� ����� �������� ������");
		l1.Move(sc.nextInt());
		
		System.out.println("������� ������������ ������ ������. y=kx+b. k?  b?");
		LStraight l2 = new LStraight(sc.nextInt(), sc.nextInt());
		if (l1.Parall(l2)){
			System.out.println("������ �����������");
		}
		else{
			System.out.println("������ �� �����������. ������������ � �����:");
			l1.Cross(l2);
		}

		
	}

}


