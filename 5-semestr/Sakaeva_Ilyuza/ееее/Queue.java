package 05;
import java.util.Iterator;
import java.util.NoSuchElementException;

//Класс, реализующий очереди. Используется для других классов. Класс принадлежит группе классов "Инструменты".

public class Queue<Item> implements Iterable<Item> {
    private int N;               // количество элементов очереди
    private Node<Item> first;    // начало очереди
    private Node<Item> last;     // конец очереди

    
    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    } // использует класс связанных списков

    
    public Queue() {
        first = null;
        last  = null;
        N = 0;
    } // Инициализирует пустую очередь

    
    public boolean isEmpty() {
        return first == null;
    } // Очередь пустая?

    
    public int size() {
        return N;     
    } // Возвращает количество элементов очереди

    
    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("Потеря значимости очереди");
        return first.item;
    } // Возвращает элемент недавно добавленный в очередь

    
    public void enqueue(Item item) {
        Node<Item> oldlast = last;
        last = new Node<Item>();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else           oldlast.next = last;
        N++;
    } // Добавление элемента в очередь. Операция Добавить, которая указана в тексте задачи
 

    public Item dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Потеря значимости очереди");
        Item item = first.item;
        first = first.next;
        N--;
        if (isEmpty()) last = null;   // to avoid loitering
        return item;
    } // Возврат и удаление недавно добавленного элемента из очереди

    
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Item item : this)
            s.append(item + " ");
        return s.toString();
    } // Возвращает строковое представление очереди

    
    public Iterator<Item> iterator()  {
        return new ListIterator<Item>(first);  
    } // Возвращает итератор, который перебирает элементы в этой очереди в порядке поступления

    
    private class ListIterator<Item> implements Iterator<Item> {
        private Node<Item> current;                               // итератор не реализует удаление

        public ListIterator(Node<Item> first) {
            current = first;
        }

        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next; 
            return item;
        }
    }

}