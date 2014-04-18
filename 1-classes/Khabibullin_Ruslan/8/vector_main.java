import java.util.Scanner;
public class vector_main {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Введите x и y");
	double x=in.nextDouble();
	double y=in.nextDouble();
	vector A=new vector(x,y);
	System.out.println("Второй вектор");
	System.out.println("Введите x и y");
	double x1=in.nextDouble();
	double y1=in.nextDouble();
	vector B=new vector(x1,y1);
	A=A.summa(B);	//Вычисляем сумму двух векторов
	System.out.print("Сумма: ");
	A.show();	//Выводим
	A=A.raznost(B);		//Вычисляем их разность и выводим
	System.out.print("Разность: ");
	A.show();
	System.out.println("Введите скаляр");	//Умножаем на скаляр и выводим
	int n=in.nextInt();
	A=A.skalar(n);
	A.show();
	System.out.println("Скалярное произведение = "+A.multiple(B));	//скалярное произведение
	}
}
