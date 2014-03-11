import java.util.Scanner;
public class vector_main {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	vector A=new vector();
	vector B=new vector();
	System.out.println("Введите x и y");
	double x=in.nextDouble();
	double y=in.nextDouble();
	A=A.create(x, y);
	System.out.println("Второй вектор");
	System.out.println("Введите x и y");
	double x1=in.nextDouble();
	double y1=in.nextDouble();
	B=B.create(x1, y1);	//Создали два вектора, с помощью метода .create(double x,double y)
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
	A.multiple(B);	//скалярное произведение, вывод сразу внутри метода
	}
}
