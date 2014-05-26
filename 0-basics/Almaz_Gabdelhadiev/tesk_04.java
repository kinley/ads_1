import java.util.Scanner;

public class cls4 {
    public static void EucGCD() {
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt(), b = sc.nextInt();
        if (a < b) { 
            int tmp = a;
            a = b;
            b = tmp;
        }

        for (int i = 1; b > 0; i++) {
            int q = a/b;
            int p = a - (b*q);
            System.out.println("Step " + i + ": q=" + q + " r=" + p);
            a = b;
            b = p;
        }
	System.out.println("GCD=" + a);
    }

    public static void main(String[] args) {
        EucGCD();
    }
}

