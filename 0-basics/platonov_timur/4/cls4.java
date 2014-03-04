// TASK 0.4
// НОД по Евклиду

import java.util.Scanner;

public class cls4 {
    public static void EucGCD() {
        Scanner sc = new Scanner(System.in); // сканнер чисел из system.in
        int a = sc.nextInt(), b = sc.nextInt();
        if (a < b) { // в 'a' будет наибольшее из чисел
            int tmp = a;
            a = b;
            b = tmp;
        }

        // основной код
        for (int i = 1; b > 0; i++) {
            int q = a/b;
            int p = a - (b*q);
            System.out.println("Step " + i + ": q=" + q + " r=" + p);
            a = b;
            b = p;
        }

        System.out.println("GCD=" + a);
    }

    // ##### MAIN #####
    public static void main(String[] args) {
        EucGCD();
    }
}

