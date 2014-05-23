package Exercise_1;

import java.util.Random;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scn = new Scanner(System.in);

        System.out.println("Введите длину");
        int N = scn.nextInt();                      // Считывваем длину

        System.out.println("Введите ширину");
        int M = scn.nextInt();                      // Считываем ширину

        boolean [][] a = new boolean[N][M];         // Создаем двумерный логический массив

        for (int i = 0; i<N;i++){                   // Заполняем массив
            for (int j = 0; j<M; j++){
                a[i][j] = rand.nextBoolean();       // заполняем рандомными значениями

                if (a[i][j]==true)
                    System.out.print("*");          // если в ячейке true то выводим *

                else
                    System.out.print(" ");          // иначе пробел
            }
            System.out.println();                   // перевод строки
        }
    }
}