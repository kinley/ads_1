package class_18;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class zadanie03 {
	
	public static void main(String[] args) throws IOException  {
		final Scanner r = new Scanner(new File("input.txt"));
		while (r.hasNext()) {
            String name = r.next();
            int a = r.nextInt();
            int b = r.nextInt();
            double del = (double)a/b;
            
        System.out.printf("%20s| %10s | %10s | %10.3f", name, a, b, del);
		System.out.println();
		System.out.printf("%20s| %10s | %10s | %10s", "-------","-------","-------","-------");
		System.out.println();
		
		}
			
	}

}

