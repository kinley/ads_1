import java.util.*;
import java.io.*;
// Читаем из файла строки с фамилией и двумя числами. 
//Записываем в файл то же + результат деления чисел
public class Name {
	
	public static Double Rez (String people){
		int p = people.lastIndexOf(' ');
		Double a = Double.parseDouble(people.substring(people.indexOf(' '),p));
		Double b = Double.parseDouble(people.substring(p,people.length()));
		Double r = a/b;
		return r;
	}  
	
	public static void main(String[] args) throws IOException{

		String st;
		PrintWriter pw;
		Scanner sc;
		sc = new Scanner(new File("input.txt"));
		
	    st = sc.nextLine();
		int ind = Integer.parseInt(st);
		Double c;
		pw = new PrintWriter(new File("output.txt"));
		
		for (int i=0; i<ind;i++){
			
			st = sc.nextLine();
			c = Rez(st);
			pw.printf(st+' '+"%.3f",c);
			pw.println();
									
		}
		
		pw.close();
			
	}

}
