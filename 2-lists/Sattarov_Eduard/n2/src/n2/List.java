package n2;

import java.util.Scanner;//���� � ����������

public class List
{
	private int i;//����������� ����� X
	private int a;//����������� ����� cos
	private int b;//����������� ����� sin
	private List next;//��������� ���� ��� �����
	private List prev;//���������� ���� ��� �����
	private List head;//������ ������
	
	public List()//�����������
	{
		this.next=null;//���������� ��������� �� �������� � ���������� ������� �� �����
		this.prev=null;
	}
	public List(int i, int a, int b)//����������� c �������������� "������"
	{
		this.i = i;//��������� �������� ���������� ������������
		this.a = a;//� ��������������� ���� ������
		this.b = b;
		this.next = null;//���������� ��������� �� �������� � ���������� ������� �� �����
		this.prev = null;
	}
	public void AddNode2End(int i, int a, int b)//���������� ���� � �����
	{
		List new3 = new List(i, a , b);//�������������� ����� "������"
		if(head == null)//���� ������ �� �������� �����
		{
			head = new3;//������ ������ ������ - "������"
		}
		else//���� ������ ��� �������� ����
		{
			List step = head;//������ ��������� �� ������ ������
			while(step.next != null)//���� �� ����� �� �����
			{
				step = step.next;//������� ��������� �� ���-�� ��������� (���� ��� �����)
			}
			step.next = new3;//������ � ����� ������ "������"
			step.next.prev = step;//����� � �������� �������
		}
	}
	public void AddNode2Start(int i, int a, int b)//���������� ���� � ������
	{
		List new3 = new List(i, a, b);//�������������� ����� "������"
		if(head == null)//���� ������ �� �������� �����
		{
			head = new3;//������ ������ ������ - "������"
		}
		else//���� ������ ��� �������� ����
		{
			new3.next = head;//��������� ��� "������" - ������ ������
			new3.next.prev = new3;//����� � �������� �������
			head = new3;//"������" ������ - ������ ������ 
		}
	}
	/*public void AddNodeAfter(List q, int i, int a, int b)//��������� �������� �����
	{
		List new3 = new List(i, a, b);
		if(q.next == null)
		{
			q.next = new3;
			q.next.prev = q;
		}
		else
		{
			new3.next = q.next;
			new3.next.prev = new3;
			q.next = new3;
			q.next.prev = q;
		}
	}*/
	public void AddNodeBefore(List q, int i, int a, int b)//������� ���� ����� ���������
	{
		List new3 = new List(i, a, b);//�������������� ����� "������"
		if(q.prev == null)//���� ��������� ������� �� ������ ������
		{
			q.prev = new3;//���������� ����� ������ - ���� � ����� "�������"
			q.prev.next = q;//����� � �������� �������
			head = new3;//���� � "�������" ������ - ������ ������
		}
		else//���� ��������� ������� �� �� ����� ������
		{
			new3.prev = q.prev;//���������� ��� "������" ��, ��� ���������� ��� ���������
			new3.prev.next = new3;//����� � �������� �������
			q.prev = new3;//���������� ��� ��������� ������ - ���� � "�������"
			q.prev.next = q;//����� � �������� �������
		}
	}
	public void DelNode(List q)//�������� ���������� ����
	{
		if((q.next == null)&&(q.prev != null))//���� ��������� ���� � ����� ������
		{
			q = q.prev;//���� � ����������� ����
			q.next = null;//������� ����� � ���������� ���� ����
		}
		if((q.next != null)&&(q.prev == null))//���� ��������� ���� � ������ ������
		{
			q = q.next;//���� � ���������� ����
			q.prev = null;//������� ����� � ���������� ���� ����
			head = q;//������������ ������, �.�. ��� ������ �� ��������� ����
		}
		if((q.next != null)&&(q.prev != null))//���� ��������� ���� � �������� ������
		{
			q.prev.next = q.next;//������� ���� ��������� �� ��������� ����� next
			q.next.prev = q.prev;//��������� ���� ��������� �� ���������� ����� prev
			q = q.prev;//��������� ������ �� ���������� ����, ����� ��������� ����� 1
			           //� ������� � �������, ��� ������ �� ������ ���������, ���� ����
		}
	}
	public void InputPolinom()//���� "�����" i, a, b
	{
		int vmore = 1;//���������� �� �� ���������� �� �����
		while(vmore == 1)//���� �� �� ���������� �� ����� ��������� "������"
		{
			System.out.print("������� ����������� ������(i): ");
			Scanner sc = new Scanner(System.in);//���� ����� � ����������
			int vi = sc.nextInt();
			System.out.print("������� ����������� ��������(a): ");
			int va = sc.nextInt();
			System.out.print("������� ����������� ������(b): ");
			this.AddNode2End(vi, va, sc.nextInt());//������� ������ � ����� ������
			System.out.print("�������� ��� ������? 0/1: ");
			vmore = sc.nextInt();
		}
	}
	public void PlusPolinom(List p2)//�������� ���������
	{
		List step = head;//c����� ��������� �� ������ ������
		while(step.next != null)//���� ��������� ������� �� ����
		{
			step = step.next;//������� ��������� �� ���-�� ��������� (���� ��� �����)
		}
		step.next = p2.head;//����� �� ����� 1, ����� ��������� � ������� 2
		step.next.prev = step;//����� � �������� �������
	}
	public void FindUseless()//���������� ����� � ����������� �������������� ��� X
	{                        //���������� ����� � �������� �������������� ��� cos/sin
		List i = head;//������ ��������� �� ������ ������
		while (i != null)//���� ��������� ������� �� ����
		{
			List j = i.next;//� ������ ����������� "i", ����������� "j" i+1,
			                //��� ������ ��������� ���� �� 2 ���� � ������������� ����
			while(j != null)//���� ��������� ������� �� ����
			{
				if (i.i == j.i)//���� � "�����" ���������� ����������� ��� X
				{
					i.a += j.a;//���������� ������������ ��� ��������� � �������
					i.b += j.b;
					DelNode(j);//������� "������", �������� ������� �� ������� � ������
				}
				j = j.next;//������� ��������� �� ���-�� ��������� (���� ��� �����)
			}
			if ((i.a == 0)&&(i.b == 0))//���� ������������ ��� cos/sin ��� ����� ����
			{
				DelNode(i);//������� ����
			}
			i = i.next;//������� ��������� �� ���-�� ��������� (���� ��� �����)
		}
	}
	public void PrintPolinom()//����� ��������
	{
		List pr = head;//������ ��������� �� ������ ������
		if(pr == null)//���� � ������ ��� �����
		{
			System.out.println("������� ���� � ���������� ����������");
		}
		else//���� � ������ ���� ����
		{
			while (pr != null)//���� ��������� ������� �� ����
			{
				if(pr.next == null)//���� ������� ���������
				{
					if(pr.a == 0)//�� �������� �������� � ������� �������������
					{
						System.out.print(+pr.b+"sin("+pr.i+"x)");
					}
					if(pr.b == 0)//�� �������� ������ � ������� �������������
					{
						System.out.print(pr.a+"cos("+pr.i+"x)");
					}
					if((pr.b != 0)&&(pr.a != 0))
					{
						System.out.print(pr.a+"cos("+pr.i+"x) + "+pr.b+"sin("+pr.i+"x)");
					}
				}
				else//���� ������� �� ���������, ������� ��� "+"
				{
					if(pr.a == 0)//�� �������� �������� � ������� �������������
					{
						System.out.print(+pr.b+"sin("+pr.i+"x) + ");
					}
					if(pr.b == 0)//�� �������� ������ � ������� �������������
					{
						System.out.print(pr.a+"cos("+pr.i+"x) + ");
					}
					if((pr.b != 0)&&(pr.a != 0))
					{
						System.out.print(pr.a+"cos("+pr.i+"x) + "+pr.b+"sin("+pr.i+"x) + ");
					}
				}
				pr = pr.next;//������� ��������� �� ���-�� ��������� (���� ��� �����)
			}
			System.out.println("");//����� ������ ���� �������, ������ ������
		}
	}
}