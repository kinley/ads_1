package project2;

public class main {

	public static void main(String[] args) {
		List a = new List();
		a.InList('c');  
		a.InList('d'); // Нынче первый
		a.InEndOfList('a'); // последний вставленный
		
		System.out.print(a.FirstOutput());
		System.out.print(a.LastOutput());
		System.out.print(a.LastOutput());
	}
}
