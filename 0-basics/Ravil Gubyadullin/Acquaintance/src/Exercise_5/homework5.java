package Exercise_5;

import java.util.Scanner;

public class homework5 {

    public static int factorial (int N){             // Метод вычисляющий факториал числа
        if(N==1 || N==0)                            // Если число равно 0 или 1 то факториал равен 1
            return 1;

        return (N*factorial(N-1));
    }

    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите N");
        int number = sc.nextInt();                                   // Считываем число

        int M = factorial(number);                                // Вычисляем факториал
        System.out.println("Факториал числа равен " + M);

        double b = Math.log(M);                                // Вычисляем логарифм по оснаванию e

        System.out.println("ln(N!) равен " + b);              // Выводим результат
    }
}