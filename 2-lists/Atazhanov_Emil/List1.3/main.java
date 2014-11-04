package List;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        List test = new List();
        int exp = 0;
        int factor = 0;
        Scanner file = null;
        //считывание из файла с помощью сканнера(последовательность должна быть введена верно!)
        //верно - значит ввод попарно (коеф, степень, коеф(след.число), степень(след. число)). Ввод заканчивается точкой
        //Пример - 3,2,1,1.
        try {
            file = new Scanner(new File("input.txt"));
            String input = "";
            while(file.hasNextLine()){
                input = file.nextLine();
            }
            int indexBefore = 0;    //для чисел > 9
            String sDigit = "";     //для такой же цели. тут хранится текущее число
            boolean trigger = true; //для проверки, какое же число сейчас вводится(коеф. или степень)
            for (int i = 0; i < input.length(); i++){
                if (input.charAt(i) == ',' || input.charAt(i) == '.')
                {
                    sDigit = input.substring(indexBefore, i);
                    if (trigger)
                    {
                        factor =Integer.parseInt(sDigit);
                        trigger = false;
                    }
                    else
                    {
                        exp = Integer.parseInt(sDigit);
                        trigger = true;
                    }
                    if (exp != 0 && factor != 0){
                        test.initialList(exp,factor);
                        exp = 0;
                        factor = 0;
                    }
                    indexBefore = i + 1;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Неверная последовательность!");
        }
/*      Scanner in = new Scanner(System.in);            //это для чтения из консоли
        int exp = 0;
        int factor = 0;
        System.out.println("Enter count of nodes");
        int count = in.nextInt();
        for (int i = 0; i < count; i++){
            System.out.println("Enter factor and exp " + i);
            factor = in.nextInt();
            exp = in.nextInt();
            test.initialList(exp, factor);
        }*/
        test.printList();
    }
}
