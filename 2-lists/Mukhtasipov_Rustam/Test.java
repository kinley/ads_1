
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Digit test = new Digit();   //переменная нашего класса
        Digit toSum = new Digit();  //второе число
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your digit in 10 numeric format");
        test.toBinaryForm(in.nextInt());
        test.printBinaryDigit();    //превращаем 10-ичное число в двоичное
        System.out.println();
        System.out.println("Enter second digit in 10 numeric format");
        toSum.toBinaryForm(in.nextInt());
        test.getSum(toSum); // складываем два числа. Результат - измененное первое число
        test.printBinaryDigit();
    }
}
