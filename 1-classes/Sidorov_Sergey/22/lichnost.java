package classes;

import java.util.Scanner;

public class lichnost{
	private String name;
	private String surname;
	private String sex;
	private int year;
	private int ch_numb;

    // ����������� ��-���������
    public lichnost()
    {
        this.name="Sergey";
        this.surname="Sidorov";
        this.sex="men";
        this.year=1995;
        this.ch_numb=0;
    }

    // ������ ����������� � �����������
	public lichnost(String name, String surname, String sex, int year, int ch_numb)
	{
		this.name=name;
		this.surname=surname;
		this.sex=sex;
		this.year=year;
		this.ch_numb=ch_numb;
	}

    // ������� ������������ ������ ���� lichnost
	public lichnost func(String name, String surname, String sex, int year, int ch_numb)
	{
        lichnost A=new lichnost();
		A.name=name;
		A.surname=surname;
		A.sex=sex;
		A.year=year;
		A.ch_numb=ch_numb;
		return A;
	}
	//������ �������
	public void change_surname(String surname)
	{
        this.surname = surname;
	}
	//��������� ���-�� ���� �� n	
	public void change_ch_numb(int n)
	{
		this.ch_numb+=n;
	}
	//�������� ���-�� �����
	public int get_ch()
	{
		return this.ch_numb;
	}
	
	//�������� �� ���������������(� ���������� ������ ������� ���)
	public boolean age(int year)
	{
		return(year-this.year>=16);
	}
	//������� �������
	public lichnost AddLichnch(String name, String sex, int year, int ch_numb)
	{
	this.ch_numb++;
	lichnost nlc=new lichnost(name, this.surname, sex, year, ch_numb);
	return nlc;
	}
	//��� ������ ��������(��������)
	public String toString() 
	{
        return "("+name+";"+surname+";"+sex+";"+year+";"+ch_numb+";)";
    }
	
	public static void main(String[] args)
	{
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.println("Insert name,surname,sex,year and number of children for lc1: ");
	lichnost lc1 = new lichnost(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()); // ������� �������� ����
	/*if(lc1.age(2014)== true)
	{
		lc1.change_surname(sc.nextLine());
	}*/
	System.out.println(lc1.toString());
	System.out.println("Insert name,sex,year and child number for lc2: ");
	lichnost lc2 = lc1.AddLichnch(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()); // ������� �������� ���(�������)
	System.out.println("lc1 "+lc1.toString());//
	System.out.println("lc2 "+lc2.toString());//������� ��� ��������
	System.out.println("Insert name,surname,sex,year and number of children for lc3: ");
	lichnost lc3 = new lichnost(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()); // ������� �������� ���
	lc3.ch_numb = lc3.ch_numb+lc1.ch_numb; // "����������" ����� � lc1
	lc1.ch_numb = 0; //�������� ���-�� ����� � lc1
	System.out.println("lc1 "+lc1.toString());//
	System.out.println("lc3 "+lc3.toString());//������� ��� ��������
	}	
}
