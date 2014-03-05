package Семенова_Екатерина;
//5_zadanie
import java.util.Scanner;

public class fifth_zadanie {
    private static Scanner scan;

	public static void main(String args[]) {
       int n;
        do {
            scan = new Scanner(System.in);
             System.out.print("Введите натуральное число n : ");
              n = scan.nextInt();
               int result = 1;
                for (int i = 2; i <= n; i++)
                  result *= i;
                  System.out.println(Math.log(result));
                if (n == 0 || n == 1)
                 System.out.println(Math.log(result));
             if(n < 0)
             System.out.println("Ошибка!");
        } while (n < 0);{System.out.println("Конец");}
    }
}