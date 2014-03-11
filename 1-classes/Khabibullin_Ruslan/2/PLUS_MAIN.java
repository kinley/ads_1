import java.util.Scanner;
public class PLUS_MAIN {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	PLUS A=new PLUS();
	PLUS B=new PLUS();
	System.out.println("Введите I и R");
	double I=in.nextDouble();
	double R=in.nextDouble();
	A=A.create(R, I);	//Создаем двуплюсник (см. файл PLUS)
	A.Show();		//Выводим его (показав еще и напряжение и мощность)
	System.out.println("Второе биполе");
	System.out.println("Введите I и R");
	double I1=in.nextDouble();
	double R1=in.nextDouble();
	B=B.create(R1, I1);		
	B.Show();		//Выводим второе биполе (тоже самое)
	A.inSeries(B);		//При послед. соединений
	A.parallel(B);		//При параллельном (каждый из этих методов выведет результат)
}
}
