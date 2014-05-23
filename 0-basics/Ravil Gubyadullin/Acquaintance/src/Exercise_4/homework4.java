package Exercise_4;

import java.util.Scanner;

public class homework4 {

    public static int gcd(int p, int q){                // Метод возращающий Нод двух чисел
        if (q==0) return p;
        int r = p%q;
        System.out.println("p равно "+ p + ", " + "q равно " + q);
        return gcd(q, r);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число");
        int First_number = sc.nextInt();                // Считываем первое число

        System.out.println("Введите второе число");
        int Second_number = sc.nextInt();               // Считываем второе число

        int NOD = gcd(First_number, Second_number);
        System.out.println("NOD равен " +NOD);
    }
}