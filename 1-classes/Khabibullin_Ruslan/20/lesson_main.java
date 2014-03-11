import java.util.Scanner;
public class lesson_main {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	lesson A=new lesson();		//Создаем две переменный типа lesson (см. класс lesson, и методы lesson)
	lesson B=new lesson();
	lesson C=new lesson();		//По заданию, третий формируется из первого, со временем второго занятия(lesson)
	System.out.println("Введите имя преподавателя");	//Забиваем сначала 1-ое занятие (A), а потом и второе (B)
	String FIO=in.nextLine();
	System.out.println("Введите номер группы");
	String nomer1=in.nextLine();
	int nomer=(int) Double.parseDouble(nomer1);
	System.out.println("Введите ЧтоКогда");
	String WhatWhen=in.nextLine();
	System.out.println("Введите Где");
	String Where=in.nextLine();
	A=A.create(FIO, nomer, WhatWhen, Where);	//вызываем метод создания занятия lesson для переменной А
	System.out.println("Введите имя преподавателя");
	String FIO2=in.nextLine();
	System.out.println("Введите номер группы");
	String nomer3=in.nextLine();
	int nomer2=(int) Double.parseDouble(nomer1);
	System.out.println("Введите ЧтоКогда");
	String WhatWhen2=in.nextLine();
	System.out.println("Введите Где");
	String Where2=in.nextLine();
	B=B.create(FIO2, nomer2, WhatWhen2, Where2); //Тоже самое для второго занятия B
	if(A.checking(B)==1){		//Если 2 занятия можно совместить, то "склеиваем" и показываем результат
		A=A.merge(B);
		A.show();
	}
	else {		// Иначе в занятий А будет новый преподаватель, затем показываем занятие A
		System.out.println("Введите имя нового препода");
		String stroka=in.nextLine();
		A=A.fio_change(stroka); 
		A.show();
	};
	C=A.sub_create(B);		//Переменная С, созданная в занятий А со временем, как у занятия B
	C.show();		//Показываем занятие С
	}
}
