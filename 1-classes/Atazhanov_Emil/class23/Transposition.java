package class23;
import java.util.Scanner;

public class Transposition {
    private int [] transposition; // сама перестановка

    public Transposition() // создать перестановку
    {
        transposition = new int[5]; // инициализируем перестановку (5 элементов для удобства)
    }

    public void init() // ввод перестановки с клавиатуры 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите перестановку 4 степени:");

        for(int i=1;i<5;i++)
            transposition[i] = sc.nextInt();
    }

    public void print() // вывод перестановки
    {
        System.out.println("Перестановка:");

        for(int i =1; i<5;i++)
            System.out.print(transposition[i]+" ");
        System.out.println();

    }

    public int getElement(int i) // получить отображение i-ото эл-та.
    {
        return transposition[i];
    }

    public boolean isEquals(Transposition b) // проверка на равенство перестановок
    {
        for (int i = 1;i<5;i++)
          if(transposition[i]!=b.transposition[i]) // если не равен хотя бы один элемент, то
              return false; // false.
        return  true;
    }

    public Transposition multiplication(Transposition b) // умножение перестановок
    {
        Transposition res = new Transposition(); // перестановка - результат.

        for (int i =1;i<5;i++)
            res.transposition[i] = b.transposition[transposition[i]]; // правило умножения перестановок
        return res;
    }

    public Transposition getInvertedTrasposition() // обратная перестановка
    {
        Transposition res = new Transposition(); // перестановка - результат.
        for (int i =1;i<5;i++)
            res.transposition[transposition[i]] = i; // по правилу обратной перестановки
        return  res;
    }

    public  Transposition reverse() // для развертки по заданию
    {
        Transposition res = new Transposition(); // перестановка - результат.
        for (int i =1;i<5;i++)
            res.transposition[i] = transposition[5-i];
        return  res;
    }


}

