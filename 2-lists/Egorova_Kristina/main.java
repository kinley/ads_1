import java.io.FileNotFoundException;


public class main {

	public static void main(String[] args) throws FileNotFoundException {
		List stroka=new List();	//переменная класса
		stroka.get_string();	//считали из файла строки
		stroka.z_exception();	//исключили из них слова, начинающиеся на 'z'
		stroka.print();		//вывели
		}
}
