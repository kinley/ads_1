import java.util.Scanner;

public class MyList <Item>{

    private int N;              // количество элементов
    private Refer first;        // последний добавленный элемент
    public class Refer {        // Класс узел
        Item item;
        Refer next;
    }

    public void add(Item p){        // Метод добавления
        Refer oldfirst = first;
        first = new Refer();
        first.item = p;
        first.next = oldfirst;
        N++;
    }

    public Item peek(){             // Метод возращающий последний элемент, но не удаляющий последний элемент
        return first.item;
    }

    public Item remove(){           // Метод возращающий последний элемент и удаляющий его
        Item item = first.item;
        first = first.next;
        N--;
        return  item;
    }

    public int getN(){             // Метод возращающий длину списка
        return this.N;
    }

    public static  void  main(String[] args){
        MyList mainList = new MyList();
        In in = new In ("input.txt");

        while (in.hasNextLine()){               // Считываем слова из файла
            mainList.add(in.readLine());
        }




        MyList oddElements = new MyList();      //Список для слов расположенных на нечетных позиция
        MyList evenElements = new MyList();     //Список для слов расположенных на четных позициях

        while (!(mainList.getN() == 0)){
            if(mainList.getN()%2==0)
                evenElements.add(mainList.remove());

            else
                oddElements.add(mainList.remove());

        }

        for(int i = 0; i<evenElements.getN();)            // Выводим список со словами расположенными на четных позициях
            System.out.println(evenElements.remove());

        System.out.println();

        for(int i = 0; i<oddElements.getN();)             // Выводим список со словами расположенными на нечетных позициях
            System.out.println(oddElements.remove());

    }
}
