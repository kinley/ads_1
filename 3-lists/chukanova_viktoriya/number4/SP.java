import java.util.Scanner;

//��� � ������, ���� ����� ���� ��������� � ����� ����� �����. 
//������� ��� ���������� ����� ���������� ����� ���� �� ���� ����������� ���������. 
//�����, ������ ��� � � ������� ������ ����������....

public class SP 
{
		
	private static final int Size = 0;
	private list first;		//����������� ������ ������
	private char Item;		//�������� ������
	private list next;      //������ �� ��������� �������
		
	public SP()//�����������
	{		
		this.next=null;
	}
		
	public SP(char Item)
	{
		this.Item=Item;
		this.next=null;
	}
		
		
	public void push(char Item)//���������� � ������
	{	
		list paste=new list(Item);
		list step=first;
		if(first==null)
				
		{
			first=paste;
		}
			
		else
				
		{
			while(next!=null) step = next;
			next=paste;
				
		}
	}
		
		
public void print_Item()//����� ������
	{	
		list step=first;
		while(step!=null)
				
		{
			System.out.print(next);
			step= next;
		}
	}
		
	
class Node
	{
		int number;
		Node next;
		Node last;
	}

	int main()
	{
		int n = 0;
		    
		System.out.print("������� ��������:");
		Scanner in = new Scanner(System.in);
		    
		int cin = n;
		return cin;
		    
	}

void does_equal()
		
	{
		int SP[] = null, next[] = null;

		int equal = 0; // ������ ������� � ������ ���� �� ���� ���������� ���������. �� ��������� ���������� � "����"

		for (int i = 0; i <= Size; i++)
				
		{
			for (int j = 1; j <= Size; j++)
					
			{
				if (SP[i] == SP[next[j]]) equal = 1;
			}
		}

			if (equal == 1)
	
			System.out.print("� ������ ���� ���������� ��������!\n");

			else
	
			System.out.print("���������� �������� � ������ �� �������!\n");

			getClass();

			return;
		}
	}