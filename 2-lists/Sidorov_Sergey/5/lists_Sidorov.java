package files;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
import java.util.Set;

public class list {		// ������� �������������� �������
	
	private list first;			//������ ������
	private char Item;			//�����. �������� � ������ �� ����. ������� ������
	private list next;
	//�������, ����� ��������� � ���� ����� �����. ��������, ����� �� ������� �� ������� � ��������� ��
	private Queue<Character> ArifmActions=new LinkedList <Character>();	
	//�������������, ���� ������ ��� ���������� � �������, �������� �� FALSE
	public boolean checked=true;	
	//������������
	public list()
	{		
		this.next=null;
	}
	public list(char Item)
	{
		this.Item=Item;
		this.next=null;
	}
	//���������� � ������
	public void push(char Item)
		{	
		list paste=new list(Item);
		list step=first;
		if(first==null)
		{
			first=paste;
		}
		else
			{
			while(step.next!=null) step=step.next;
			step.next=paste;
			}
		}
	//����� ������
	public void print_Item()
	{	
		list step=first;
		while(step!=null)
		{
			System.out.print(step.Item);
			step=step.next;
		}
	}
	//������ ���, ��������� ������, �����. ����� ������ � �������, ����������� ������
	public void first_step()
	{	
		Scanner in=new Scanner(System.in);
		list item=this;
		Set logic=new HashSet();		//��� ���������, ������ �� ������� �� ��������� ������ �����. ��������
		logic.add('+');
		logic.add('-');
		logic.add('/');
		logic.add('*');
		System.out.println("Enter formula");
		String stroka=in.nextLine();
		for(int i=0;i<stroka.length();i++)	//���� ������ ������ �� ���������, �� �������� �� ��������(��������� ������)
			if(stroka.charAt(i)>='a'&& stroka.charAt(i)<='z')
			{
					item.push('(');
					item.push(stroka.charAt(i));
					item.push(')');
			}
				//���� ��� �����. ��������, �� ��������� � �������
			else if(logic.contains(stroka.charAt(i)))
					{		
							ArifmActions.add(stroka.charAt(i));
					}
			else
				// ����� ������ ������, ������� ������ � ��������� �� false
			{
				System.out.println("Wrong symbol detected!");	
				checked=false;
				return;
			}
	}
	//������ ���, ����������� �� ������� ����� �����. ��������
	public void second_step()
	{	
			list letter=first.next;
			list prevLet=first;
			while(letter!=null)
			{
				//���� ��� ����������� ������, �� ����� ��� ����� �������� � ������ ���� �����. ��������
				if(letter.Item =='(')
				{		
						list paste=new list();
						paste.next=letter;
						paste.Item= (char) ArifmActions.poll();
						prevLet.next=paste;
						prevLet=letter;
						letter=letter.next;
				}
				//���� ������
				else
				{		
					prevLet=letter;
					letter=letter.next;
				}
			}
	}

	public static void main(String[] args)
	{
		list item=new list();	//���������� ������
		item.first_step();		//������� ������, � ���������� ��������
		//���� � ������ �� ���������� ���������, �� �������� �� ���������, �� ���� ������
		if(item.checked==true)
		{		
						item.second_step();	//���� ������ ��� ������ �������, ��������� �� �������, � ����������� ����� �����. ��������
						item.print_Item();	//������ ��������������� �������
		}
	}
}
		
