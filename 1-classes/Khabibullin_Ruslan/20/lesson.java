//Отдельный класс lesson с методами
public class lesson {
	private String FIO,WhatWhen,Where;		//Наши 4 переменные private (ФИО, ЧтоКогда,Где и номер группы)
	private int nomer;
	public lesson(String FIO,int nomer,String WhatWhen,String Where){
			this.FIO=FIO;
			this.nomer=nomer;
			this.WhatWhen=WhatWhen;
			this.Where=Where;
	}

	public String get_Prepod(){		
		return this.FIO;
	}
	
	public int get_nomer(){
		return this.nomer;
	}
	
	public String get_WhatWhen(){
		return this.WhatWhen;
	}
	
	public String get_Where(){
		return this.Where;
	}
	
	public int checking(lesson B){		//Метод, проверяющий соотв. времени и места
		if(get_WhatWhen().equals(B.WhatWhen)){	//Если время и место совп, то return 1
			return 1;
		}
		else return 0;
	}
	
	public lesson merge(lesson B){		//Метод "Склеивания" занятий (место и преподаватели передаются в другое занятие)
		this.Where=B.Where;
		this.FIO=B.FIO;
		return this;
	}
	
	public lesson fio_change(String stroka){	//Метод для изменения имени преподавателя
		this.FIO=stroka;
		return this;
	}
	
	public lesson sub_create(lesson C){	// Тут мы внутри одного занятия создаем второе, с аналогичыми
		lesson B=new lesson(this.FIO,this.nomer,this.Where,C.WhatWhen); //данными, кроме ЧтоГде-этот параметр подхватывается из занятия C
		return B;
	}
	
	public void show(){		//вывод 
		System.out.println("ФИО = "+get_Prepod());
		System.out.println("Номер = "+get_nomer());
		System.out.println("Что и Когда = "+get_WhatWhen());
		System.out.println("Где = "+get_Where());
	}
}

