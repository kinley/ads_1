//Отдельный класс lesson с методами
public class lesson {
	private String FIO,WhatWhen,Where;		//Наши 4 переменные private (ФИО, ЧтоКогда,Где и номер группы)
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
	public lesson create(String FIO,int nomer,String WhatWhen,String Where){	//Метод создания занятия
			lesson A=new lesson();
			A.FIO=FIO;
			A.nomer=nomer;
			A.WhatWhen=WhatWhen;
			A.Where=Where;
			return A;
	}
	public String get_Prepod(){		//Метод выводит имя преподавателя данного занятия
		lesson A=this;
		return A.FIO;
	}
	public int checking(lesson B){		//Метод, проверяющий соотв. времени и места
		lesson A=this;
		if(A.WhatWhen.equals(B.WhatWhen)){	//Если время и место совп, то return 1
			return 1;
		}
		else return 0;
	}
	public lesson merge(lesson B){		//Метод "Склеивания" занятий (место и преподаватели передаются в другое занятие)
		lesson A=this;
		A.Where=B.Where;
		A.FIO=B.FIO;
		return A;
	}
	public lesson fio_change(String stroka){	//Метод для изменения имени преподавателя
		lesson A=this;
		A.FIO=stroka;
		return A;
	}
	public lesson sub_create(lesson C){	// Тут мы внутри одного занятия создаем второе, с аналогичыми
		lesson A=this;					// данными, кроме ЧтоГде-этот параметр подхватывается из занятия C
		lesson B=new lesson();
		B.FIO=A.FIO;
		B.nomer=A.nomer;
		B.Where=A.Where;
		B.WhatWhen=C.WhatWhen;
		return B;
	}
	public void show(){		//Просто вывод занятия
		lesson A=this;
		System.out.println("Имя = "+A.FIO);
		System.out.println("Номер = "+A.nomer);
		System.out.println("ЧтоКогда = "+A.WhatWhen);
		System.out.println("Где = "+A.Where);
	}
}

