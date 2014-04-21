/**
 * Created by acer on 21.04.14.
 */

//Развернуть односвязный список.

import java.util.Scanner;

public class List<Item> {

    private Node head;
    private Node last;
    private int N;

    private class Node {
        Item data;
        Node next;
    }

    public void add(Item item) {      //добавление в конец
        Node oldlast = last;
        last = new Node();
        last.data = item;
        last.next = null;
        if (isEmpty()) head = last;
        else oldlast.next = last;
        N++;
    }

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return head == null;
    }


    @Override
    public String toString() {
        if (!isEmpty()) {
            String st = "";

            Node n = head;
            int k = 0;
            while (n != null && k != N) {    //лист может быть зациклен. доп. проверка.
                st = st + n.data + ' ';
                n = n.next;
                k++;
            }
            return st;
        } else {
            return ("null");
        }
    }


    public static class ReverseList {

        public static void reverse(List list) {

            List.Node node = list.head;
            List.Node previous = null;
            int k = list.size();

            while (k>0) {
                List.Node tmp = node.next;            //обмен узлов
                node.next = previous;
                previous = node;

                list.head = node;
                node = tmp;                           //переход к следующему
                k--;
            }
        }
    }


    public static void main(String[] args) {
        List<String> l = new List<String>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Could you write the list, please.");
        String sample = sc.nextLine();              //читаем как строку, делим слова по пробелам и записываем в массив строк
        String[] stt = sample.split(" ");

        for (String st : stt) {                     //добавляем элементы в лист
            l.add(st);
        }

        ReverseList.reverse(l);                     //разворот списка
        System.out.println(l.toString());

    }
}
