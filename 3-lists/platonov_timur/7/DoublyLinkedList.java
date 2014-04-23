public class DoublyLinkedList<T> {
    private T data;
    private DoublyLinkedList next;
    private DoublyLinkedList prev;
    private DoublyLinkedList head;
    private DoublyLinkedList tail;

    public DoublyLinkedList() {
        this.next = null;
        this.prev = null;
    }

    public DoublyLinkedList(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public void insertBeginning(T data) {
        DoublyLinkedList<T> node = new DoublyLinkedList<>(data);
        if (head == null) {
            head = tail = node;
        }
        else {
            node.setNext(head);
            head.setPrev(node);
            head = node;
        }
    }

    public void insertEnd(T data) {
        DoublyLinkedList<T> node = new DoublyLinkedList<>(data);
        if (tail == null) {
            tail = head = node;
        }
        else {
            node.setPrev(tail);
            tail.setNext(node);
            tail = node;
        }
    }

    public void removeBeginning() {
        if (head == null) {
            throw new RuntimeException("Trying to delete a node from an empty list!");
        }
        // there is only 1 element, so tail must be destroyed
        else if (head.getNext() == null) {
            head = tail = null;
        }
        // there are more than 1 elements
        else {
            head = head.getNext();
            head.setPrev(null);
        }
    }

    public void removeEnd() {
        if (tail == null) {
            throw new RuntimeException("Trying to delete a node from an empty list!");
        }
        else if (tail.getPrev() == null) {
            head = tail = null;
        }
        else {
            tail = tail.getPrev();
            tail.setNext(null);
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("DoublyLinkedList is empty!");
        }
        else {
            for (DoublyLinkedList tmp = head; tmp != null; tmp = tmp.getNext()) {
                System.out.println(tmp.getData());
            }
        }
    }

    // Getters & Setters
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DoublyLinkedList getNext() {
        return next;
    }

    public void setNext(DoublyLinkedList next) {
        this.next = next;
    }

    public DoublyLinkedList getPrev() {
        return prev;
    }

    public void setPrev(DoublyLinkedList prev) {
        this.prev = prev;
    }

    // main
    public static void main(String[] args) {
        try {
            DoublyLinkedList<Integer> a = new DoublyLinkedList<>();
            a.insertEnd(8);
            a.insertBeginning(5);
            a.insertEnd(45);
            a.insertBeginning(12);
            // 12 5 8 45
            // a.print();

            a.removeBeginning();
            a.removeBeginning();
            a.removeBeginning();
            a.removeBeginning();
            a.removeEnd();

            a.print();
        }
        catch (RuntimeException e) {
           System.out.println(e.getLocalizedMessage());
        }


    }

}
