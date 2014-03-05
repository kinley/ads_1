package Семенова_Екатерина;
//4_zadanie
import java.io.PrintWriter;
import java.util.Scanner;

public class NOD {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);

        int a;
        a = scanner.nextInt();
        int b;
        b = scanner.nextInt();

        printWriter.println(gcd(a, b));

        scanner.close();
        printWriter.close();
    }
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
          return gcd(b, a % b);
        }
    }
}
