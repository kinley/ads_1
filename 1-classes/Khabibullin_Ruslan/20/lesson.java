//��������� ����� lesson � ��������
public class lesson {
	private String FIO,WhatWhen,Where;		//���� 4 ���������� private (���, ��������,��� � ����� ������)
	private int nomer;
	public lesson(){		
		this.FIO="";
		this.nomer=0;
		this.WhatWhen="";
		this.Where="";
	}
	private lesson(String FIO,int nomer,String WhatWhen,String Where){
			this.FIO=FIO;
			this.nomer=nomer;
			this.WhatWhen=WhatWhen;
			this.Where=Where;
	}
	public lesson create(String FIO,int nomer,String WhatWhen,String Where){	//����� �������� �������
			lesson A=new lesson();
			A.FIO=FIO;
			A.nomer=nomer;
			A.WhatWhen=WhatWhen;
			A.Where=Where;
			return A;
	}
	public String get_Prepod(){		//����� ������� ��� ������������� ������� �������
		lesson A=this;
		return A.FIO;
	}
	public int checking(lesson B){		//�����, ����������� �����. ������� � �����
		lesson A=this;
		if(A.WhatWhen.equals(B.WhatWhen)){	//���� ����� � ����� ����, �� return 1
			return 1;
		}
		else return 0;
	}
	public lesson merge(lesson B){		//����� "����������" ������� (����� � ������������� ���������� � ������ �������)
		lesson A=this;
		A.Where=B.Where;
		A.FIO=B.FIO;
		return A;
	}
	public lesson fio_change(String stroka){	//����� ��� ��������� ����� �������������
		lesson A=this;
		A.FIO=stroka;
		return A;
	}
	public lesson sub_create(lesson C){	// ��� �� ������ ������ ������� ������� ������, � �����������
		lesson A=this;					// �������, ����� ������-���� �������� �������������� �� ������� C
		lesson B=new lesson();
		B.FIO=A.FIO;
		B.nomer=A.nomer;
		B.Where=A.Where;
		B.WhatWhen=C.WhatWhen;
		return B;
	}
	public void show(){		//������ ����� �������
		lesson A=this;
		System.out.println("��� = "+A.FIO);
		System.out.println("����� = "+A.nomer);
		System.out.println("�������� = "+A.WhatWhen);
		System.out.println("��� = "+A.Where);
	}
}

