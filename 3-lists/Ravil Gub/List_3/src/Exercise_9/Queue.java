package Lists_3.Exercise_9;

public class Queue <Item> {

    private Node first;     // Сылка на самый старый узел
    private Node last;      // Ссылка на самый свежий узел
    private int N;          // Количество элементов в очереди

    // Класс узла
    private class Node{

        private Item item;       // Данные
        private Node next;      // Указатель на следующий

        // Конструктор
        public Node(Item item, Node next){
            this.item = item;
            this.next = next;
        }
    }

    // Метод проверки на пустоту
    public boolean isEmpty(){
        return (this.first == null);
    }

    // Размер списка
    public int size(){
        return N;
    }

    // Добавление элемента в конец списка
    public void enqueue(Item item){
        Node oldLast = last;
        last = new Node(item, null);

        if(isEmpty())
            first = last;
        else
            oldLast.next = last;

        N++;
    }

    // удаление элемента ищ начала списка
    public Item dequeue(){
        Item item = first.item;
        first = first.next;

        if(isEmpty())
            last = null;

        N--;
        return item;
    }
}
