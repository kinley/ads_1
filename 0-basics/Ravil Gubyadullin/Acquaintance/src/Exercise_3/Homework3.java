package Exercise_3;

import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";              // для хранения считанной строки
        String  name = "";          // Для хранения имени
        int number1;
        int number2;

        while (sc.hasNextLine()){
            s = sc.nextLine();

            // Записываем имя в переменную name
            int index = s.indexOf(" ");
            name = s.substring(0, index);

            s = s.substring(index + 1 , s.length());
            index = s.indexOf(" ");
            number1 = Integer.parseInt(s.substring(0, index));
            number2 = Integer.parseInt(s.substring(index + 1, s.length()));
            int result = number1 * number2;

            System.out.printf("%5s %5s %5s  %.3f %n",name,number1,number2,result);
        }
    }
}
