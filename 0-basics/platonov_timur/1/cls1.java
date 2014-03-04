// TASK 0.1
// вывод булевого массива с заменами

import java.util.Random;

public class cls1 {
    public static void PrintBoolArr(int row, int col) {
        boolean arr[][] = new boolean[row][col];
        Random rand = new Random();     // создаём псевдослучайный генератор

        // подсчёт кол-ва разрядов в числе строк
        int tmp = row;
        int row_dig = 0;
        while (tmp > 0) {
            row_dig++;
            tmp /= 10;
        }

        // вывод верхних индексов c учётом форматирования
        for(int i = 0; i < row_dig-1; i++)
            System.out.print(" ");
        for(int i = 0; i < col; i++)
            System.out.print(" " + i);
        System.out.println();

        // основной цикл
        for(int i = 0; i < row; i++) {
            // вывод боковых индексов
            int this_row_dig; // кол-во разрядов в текущей строке
            if (i == 0)
                this_row_dig = 1; // число '0' имеет один символ
            else {
                tmp = i;
                this_row_dig = 0;
                while (tmp > 0) {
                    this_row_dig++;
                    tmp /= 10;
                }
            }
            for (int k = 1; k < row_dig-this_row_dig+1; k++)
                System.out.print(" ");
            System.out.print(i);

            // заполнение и вывод массива
            for(int j = 0; j < col; j++) {
                arr[i][j] = rand.nextBoolean();
                if (arr[i][j])
                    System.out.print("* ");
                else
                    System.out.print("  ");

                // правильное расставление пробелов между звёздочками и пробелами :)
                tmp = j;
                int this_col_dig = 0;  // кол-во разрядов в текущем столбце
                while (tmp > 0) {
                    this_col_dig++;
                    tmp /= 10;
                }
                for (int k = 1; k < this_col_dig; k++)
                    System.out.print(" ");
            }
            System.out.println(); // конец вывода одной строки
        }
    }

    // ##### MAIN #####
    public static void main(String[] args) {
        PrintBoolArr(125, 103);
    }
}