/**
 * Created by ruslansalahov on 27.05.14.
 */
public class QueueRing<Item> {

    Node first;
    int Size=0;

    public class Node<Item> {

        Item value;
        Node next;
    }

    public boolean isEmpty() { // Пуста ли очередь
        return Size == 0;
    }

    public int getSize() { // Получить размер
        return Size;
    }

    public void enqueue(Item value) { // Добавить элемент
        Node In = new Node();
        In.value = value;

        if(isEmpty()) {
            first = In;
            In.next = first;
        }
        else {
            Node watch = first;
            while(watch.next!=first)
                watch=watch.next;

            watch.next = In;
            In.next = first;
        }
        Size++;
    }

     public Item dequeue() { // Удалить элемент
       Item out = (Item) first.value;

       if(Size==0)
           return null;



       if (Size == 1) {
            first = null;
         }
       else {
           first = first.next;
       }
       Size--;
       return out;

    }

    public void Print() { // Распечатать кольцо

        if(Size==0) {
            System.out.println("Очередь пуста");
            return;
        }

        int N = Size;
        Node Output = first;

            while (N!=0) {
                System.out.println(Output.value);
                Output = Output.next;
                N--;
            }
    }

}
