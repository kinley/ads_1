package class23;

import java.util.Scanner;

public class main {

    public static void main(String[] args)
    {

        Transposition p = new Transposition(); // создаем и заполняем перестановку p
        p.init();

        Transposition q = new Transposition(); // создаем и заполняем перестановку q
        q.init();

        Transposition r1 = new Transposition(); // получаем перестановку (q*p)^-1

        r1 = q.multiplication(p);
        r1 = r1.getInvertedTrasposition();
        r1.print();

        Transposition r2 = new Transposition(); // получаем перестановку (p*q) c компонентами в обратном порядке

        r2 = p.reverse().multiplication(q.reverse());
        r2.print();

        System.out.println(r1.isEquals(r2)); // проверка на равенство (q*p)^-1 и (p*q) c компонентами в обратном порядке.
    }
}