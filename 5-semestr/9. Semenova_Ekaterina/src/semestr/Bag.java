package semestr;
import java.util.Iterator;
import java.util.NoSuchElementException;
//Класс, помогающий в реализации кучи. Из группы классов "Инструменты".

public class Bag<Item> implements Iterable<Item> {
    private int N;               // количество элементов
    private Node<Item> first;    // первый элемент

    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    /**
     * Инициализация пустого bag
     */
    public Bag() {
        first = null;
        N = 0;
    }

    /**
     * Bag пуст?
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Возвращает количество элементов
     */
    public int size() {
        return N;
    }

    /**
     * Добавление элементов
     */
    public void add(Item item) {
        Node<Item> oldfirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldfirst;
        N++;
    }


    /**
     *Возвращает итератор, который перебирает элементы в bag в произвольном порядке.
     */
    public Iterator<Item> iterator()  {
        return new ListIterator<Item>(first);  
    }

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