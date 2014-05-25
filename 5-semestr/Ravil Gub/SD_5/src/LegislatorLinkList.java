import java.io.PrintWriter;

public class LegislatorLinkList {

    private Node head;

    private class Node{
        private Legislator item;
        private Node next;

        public Node(Legislator legislator, Node next){
            this.item = legislator;
            this.next = next;
        }
    }

    // Конструктор
    public LegislatorLinkList(){
        this.head = null;
    }

    // Метод вставки
    public void add(Legislator legislator){
        Node oldFirst = this.head;
        head = new Node(legislator ,oldFirst);
    }

    // Метод проверки на пустоту
    public boolean isEmpty(){
        return (this.head == null);
    }

    // Метод удаления головы
    public void deleteHead(){
        this.head = head.next;
    }

    // Метод удаляющий из списка заданный элемент
    public void delete(Legislator legislator){
        if(!contains(legislator))
            return;

        if(head.item.equals(legislator)){
            head = head.next;
        }
        else {
            for(Node node = head; node != null; node = node.next){
                if(node.next.item.equals(legislator)){
                    node.next = node.next.next;
                    return;
                }
            }
        }
    }

    // Метод проверки на включение
    public boolean contains(Legislator legislator){
        if(isEmpty())
            return false;

        Node node = this.head;

        while (node != null){
            if(node.item.equals(legislator)) {
                return true;
            }
            else{
                node = node.next;
            }
        }
        return false;
    }

    // Вывод списка
    public void printList(){
        for(Node node = this.head; node != null; node = node.next){
            System.out.println(node.item);
        }
    }

    // Test
    public static void main(String[] args) {
        LegislatorLinkList list = new LegislatorLinkList();     // Создание списка
        Legislator legislator = new Legislator("Name");

        list.add(legislator);
        list.add(new Legislator("Ben"));
        list.add(new Legislator("Ben1"));
        list.add(new Legislator("Ben2"));

        list.printList();

        System.out.println(list.isEmpty());
        System.out.println(list.contains(legislator));

        list.delete(legislator);

        list.printList();
    }
}
