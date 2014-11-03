package n5;

public class List
{
	private String data;
	private List next;
	private List skip;//��������� �� ����, ������� �� ����������
	private final int skipsize = 3;//����� ���������� 3 ����
	private List head;
	
	public List()
	{
		this.next = null;
		this.skip = null;
	}
	
	public List(String legislator)//����������� � �������������� �����
	{
		this.data = legislator;
		this.next = null;
		this.skip = null;
	}
	
	public void SetSkipLinks(List q)//��������� ���������� � ����������
	{
		if(q != null)//���� ������ ��������� ������� �� ����
		{
			List step = q;//������� ����� ���������
			step = step.next;//����� ��������� �� ���������
			int i = 1;
			while(step != null)//���� ����� ��������� ������� �� ����
			{
				if(i % skipsize == 0)//���� ������� ������� ����� 0
				{
					q.skip = step;//�� ������ 3 ����
					              //����� ��������� ��������� � ��������� ����
					q = step;//���������� ������ ��������� �� �����
				}
				step = step.next;//���������
				i++;
			}
		}
	}
	
	public void InsertMember(String legislator)//���������� � ������ �����
	{
		if(IsMember(legislator) == false)//���� ������ ��� ���
		{
			List newleg = new List(legislator);//������� ����
			if(head == null)//���� ������ ����
			{
				head = newleg;//������ ������ ����� ����
			}
			else//���� ������ �� ����
			{
				List step = head;//������ ��������� �� ������
				while((step.skip != null)&&(IsAMoreThanB(step.skip.data, legislator) == false))
				{                    //���� ��������� � ���������� ������� �� ����
					step = step.skip;//� ���� �� ��������� ������ ������� �����
				}                    //��������� �� ������ � ���������
				List finalskip = step;//������ � ���������� ����������� ��� �������� ����� �������
				                      //��������� ���������, ��� ��� ������ ��� �������
				while((step.next != null)&&(IsAMoreThanB(step.next.data, legislator) == false))
				{                    //��������� ������ � ����� 1
					step = step.next;//���� �� ������ ������ �������
				}
				if(IsAMoreThanB(step.data, legislator) == true)
				{                    //���� ����� �������� ����� ���� � ������
					newleg = head;
					head = newleg;   //����� ���� ������ ������
					finalskip = head;//������ �������� ������� ������ � ����������
				}
				else//���� ����� �������� ���� �� � ������
				{
					newleg.next = step.next;//�������� ��� ���� - ��������� ��� ���������
					step.next = newleg;//��������� ������� ����� � �����
				}
				SetSkipLinks(finalskip);//������������ ������ � ����������
			}
		}
	}
	
	public boolean IsMember(String legislator)//���� �� ��� � ������
	{
		if(head == null)//���� ������ ����
		{
			return false;
		}
		else//���� �� ����
		{
			List step = head;//��������� ������ �� ������
			if(step.data.equals(legislator))//���� ����� ����������
			{
				return true;
			}
			while((step.skip != null)&&(IsAMoreThanB(step.skip.data, legislator) == false))
			{                    //���� ��������� � ���������� ������� �� ����
				step = step.skip;//� ���� �� ��������� ������ ������� �����
			}                    //��������� �� ������ � ���������
			for(int i = 0; i < skipsize; i++)//������ � ���������� ����������� ��� �������� ����� �������
			{                                //3 ���� ������ ��� 1
				if(step == null)//���� ������ � ����� ������
				{
					return false;
				}
				else//���� �� � ����� ������
				{
					if(step.data.equals(legislator))//������� �����
					{
						step = step.next;
					}
				}
			}
		}
		return false;
	}
	
	public void DeleteMember(String legislator)//�������� �� ������ �����
	{
		if(IsMember(legislator) == true)//���� ��� ���� � ������
		{
			List finalskip;
			if(IsAMoreThanB(head.data, legislator) == false)//���� ����� ������� �� ������
			{
				head = head.next;//��������� ������ ������
				finalskip = head;//������ � ���������� �������������� ������
			}
			else//���� ������� �� �� ������
			{
				List step = head;//��������� ������ �� ������
				while((step.skip != null)&&(IsAMoreThanB(step.skip.data, legislator) == false))
				{                    //���� ��������� � ���������� ������� �� ����
					step = step.skip;//� ���� �� ��������� ������ ������� �����
				}                    //��������� �� ������ � ���������
				finalskip = step;//������ � ���������� ����������� ��� �������� ����� �������
				                 //��������� ���������, ��� ��� ������ ��� �������
				while(step.next.data.equals(legislator) == false)
				{   //���� ��������� ����� �� ��, ��� ��� �����
					step = step.next;//���� � ����� 1
				}
				if(step.next.next == null)//���� ������ ������� - ���������
				{
					step.next = null;//������� ������ � ����
				}
				else//���� ������ ������� � ��������
				{
					step.next = step.next.next;//������� ������ �� ����������
				}
			}
			SetSkipLinks(finalskip);//����������� ������ � ����������
		}
	}
	
	public boolean IsAMoreThanB(String a, String b)//�������� �� ������ � "������" �
	{
		int vshorter;//����� �� ���� ������
		if(a.length() < b.length())//����������� ���� �����
		{
			vshorter = a.length();
		}
		else
		{
			vshorter = b.length();
		}
		int i = 0;
		char ac = 0;
		char bc = 0;
		while((ac == bc)&&(i < vshorter))//���� ����� ����� ���� ��� ���� �� ���� �� �����������
		{
			ac = a.charAt(i);
			bc = b.charAt(i);
			i++;
		}
		if(ac == bc)
		{
			if(a.length() > b.length())//���� ��� ����� �����, �� 1 �� ���� �������
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else//���� ����� �� �����
		{
			if(ac > bc)//�������, ��� ����� "������"
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
}
