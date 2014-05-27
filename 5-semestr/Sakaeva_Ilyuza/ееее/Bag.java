package 05;
import java.util.Iterator;
import java.util.NoSuchElementException;
                   //Класс, из группы классов "Инструменты".

public class Bag<Item> implements Iterable<Item> {
    private int N;               // количество элементов
    private Node<Item> first;    // первый элемент

    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    
    public Bag() {
        first = null;
        N = 0;
    } // Инициализация пустого bag

    
    public boolean isEmpty() {
        return first == null;
    }

    
    public int size() {
        return N;
    } // Возвращает количество элементов

    
    public void add(Item item) {
        Node<Item> oldfirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldfirst;
        N++;
    }  // Добавление элементов


    
    public Iterator<Item> iterator()  {
        return new ListIterator<Item>(first);  
    } // Возвращает итератор, который перебирает элементы в bag в произвольном порядке

    private class ListIterator<Item> implements Iterator<Item> {
        private Node<Item> current;

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