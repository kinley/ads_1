import java.util.Scanner;
public class MATRIX_MAIN {
public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		MATRIX matrix = new MATRIX();
		MATRIX matrix2=new MATRIX();
		matrix=matrix.create();		//Создаем матрицы 1 и 2 (они созд. рандомно в классе)
		matrix2=matrix.create();
		System.out.println("Первая матрица");	//Показываем каждую матрицу
		matrix.Show();
		System.out.println("Вторая матрица");
		matrix2.Show();
		System.out.println("Сумма двух матриц"); //Вызываем метод суммирования матриц, затем показываем
		matrix=matrix.summa(matrix2);
		matrix.Show();
		System.out.println("Разность двух матриц");
		matrix=matrix.raznost(matrix2);		//аналогично, но уже разность
		matrix.Show();
		System.out.println("Введите Скаляр");	//Умножаем матрицу на какое то целое число и выводим
		int n=in.nextInt();
		matrix=matrix.skalar(n);
		System.out.println("Умножение матрицы(разности) на скалляр");	
		matrix.Show();
		matrix=matrix.multiplication(matrix2);
		System.out.println("Умножение матрицы на вторую");	//Перемножаем матрицы
		matrix.Show();
		System.out.println("Определитель матрицы");	//Находим определитель и выводим его
		matrix.Determinant();
		}

}
