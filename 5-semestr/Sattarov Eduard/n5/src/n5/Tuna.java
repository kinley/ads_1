package n5;

import java.util.Scanner;

public class Tuna
{
	public static Dictionary goodguys = new Dictionary();
	public static Dictionary badguys = new Dictionary();
	private String command;
	private String legislator;
	public void favor(String friend)
	{
		badguys.DeleteMember(friend);
		goodguys.InsertMember(friend);
	}
	public void unfavor(String foe)
	{
		goodguys.DeleteMember(foe);
		badguys.InsertMember(foe);
	}
	public void report(String subject)
	{
		if(goodguys.IsMember(subject))
		{
			System.out.println(subject+" - ��� ����.");
		}
		else
		{
			if(badguys.IsMember(subject))
			{
				System.out.println(subject+" - ��� ����.");
			}
			else
			{
				System.out.println("��� ������ � "+subject);
			}
		}
	}
	public void Input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("F - ������������ ���������.");
		System.out.println("U - ������������ �����������.");
		System.out.println("? - �������� ����������.");
		System.out.println("E - ����� �����.");
		System.out.println();
		command = "nothing";
		while(command.equals("E") == false)
		{
			System.out.print("F/U/?/E: ");
			command = sc.nextLine();
			if(command.equals("F")||command.equals("U")||command.equals("?"))
			{
				System.out.print("��� ������������: ");
				legislator = sc.nextLine();
				if(command.equals("F"))
				{
					favor(legislator);
				}
				else
				{
					if(command.equals("U"))
					{
						unfavor(legislator);
					}
					else
					{
						if(command.equals("?"))
						{
							report(legislator);
						}
					}
				}
			}
			else
			{
				if(command.equals("E") == false)
				{
					System.out.println("����������� �������.");
				}
			}
		}
	}
}