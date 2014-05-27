/**
 * Created by Almaz on 25.05.2014.
 */
public class DLL<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public DLL(){
        setHead(null);
        setTail(null);
        this.size++;
    }

    public DLL(T data){
        Node<T> node = new Node();
        node.setData(data);
        setHead(node);
        setTail(node);
        this.size++;
    }

    public void insertBeginning(T data){
        Node<T> node = new Node<T>(data);
        if (isEmpty()){
            setHead(node);
            setTail(node);
        }
        else {
            node.setNext(head);
            head.setPrev(node);
            setHead(node);
        }
        this.size++;
    }

    public void insertEnd(T data){
        Node<T> node = new Node<T>(data);
        if (isEmpty()){
            setHead(node);
            setTail(node);
        }
        else{
            node.setPrev(tail);
            tail.setNext(node);
            setTail(node);
        }
        this.size++;
    }

    public void insertIndex(T data, int index){
        Node<T> node = new Node<T>(data);
        if(index == 0){
            insertBeginning(data);
        }
        else if (index == size){
            insertEnd(data);
        }
        else {
            Node<T> temp = getHead();
            int i = 0;
            while ((temp.getNext() != null) || (i < index - 1)) {
                temp = temp.getNext();
                i++;
            }
            if (i == index) {
                node.setNext(temp.getNext());
                temp.getNext().setPrev(node);
                temp.setNext(node);
                node.setPrev(temp);
                this.size++;
            }
            else {
                System.err.println("Appeal to a nonexistent element!");
            }
        }
    }

    public void removeBeginning(){
        if (isEmpty()){
            throw new RuntimeException("Trying to delete a node from an empty list!");
        }
        else if (this.size == 1){
            setHead(null);
            setTail(null);
        }
        else {
            setHead(head.getNext());
            head.setPrev(null);
        }
        this.size--;
    }

    public void removeEnd(){
        if (isEmpty()){
            throw new RuntimeException("Trying to delete a node from an empty list!");
        }
        else if (this.size == 1){
            setHead(null);
            setTail(null);
        }
        else {
            setTail(tail.getPrev());
            tail.setNext(null);
        }
        this.size--;
    }

    public void removeIndex(int index){
        if (isEmpty()){
            throw new RuntimeException("Trying to delete a node from an empty list!");
        }
        else if (index == this.size){
            removeEnd();
        }
        else if(index == 0){
            removeBeginning();
        }
        else {
            int i = 0;
            Node<T> temp = this.head;
            while ((temp.getNext() != null)||(i != index - 1)){
                i++;
                temp = temp.getNext();
            }
            if (i == index - 1){
                temp.setNext(temp.getNext().getNext());
                temp.getNext().getNext().setNext(temp);
                this.size--;
            }
            else {
                throw new RuntimeException("Appeal to a nonexistent element!");
            }
        }
    }

    public T getBeginningData(){
        if (isEmpty()){
            throw new RuntimeException("Appeal to a nonexistent element!");
        }
        else {
            return head.getData();
        }
    }

    public T getEndData(){
        if (isEmpty()){
            throw new RuntimeException("Appeal to a nonexistent element!");
        }
        else {
            return tail.getData();
        }
    }

    public T getIndexData(int index){
        if (isEmpty()){
            throw new RuntimeException("Appeal to a nonexistent element!");
        }
        else if(this.size == 1){
            return getBeginningData();
        }
        else if(index == this.size){
            return getEndData();
        }
        else {
            Node<T> temp = head;
            int i = 0;
            while ((index != i)||(temp.getNext() != null)){
                i++;
                temp = temp.getNext();
            }
            if (index == i){
                return temp.getData();
            }
            else {
                throw new RuntimeException("Appeal to a nonexistent element!");
            }
        }
    }

    public void setIndexData(T data, int index){
        if (isEmpty()){
            throw new RuntimeException("Appeal to a nonexistent element!");
        }
        else if (index == this.size){
            tail.setData(data);
        }
        else if (index == 1){
            head.setData(data);
        }
        else {
            int i = 0;
            Node<T> temp = getHead();
            while ((i != index)||(temp.getNext() != null)){
                i++;
                temp = temp.getNext();
            }
            if(i == index){
                temp.setData(data);
            }
            else {
                throw new RuntimeException("Appeal to a nonexistent element!");
            }
        }
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }
}
