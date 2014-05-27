
public class List <Item> {

	private int N;
    private Node first;

    private class Node{
        private Item item;
        private Node next;

        public Node(Item item, Node next){
            this.item = item;
            this.next = next;
        }
    }

    public void addFirst(Item data){
        Node oldFirst = this.first;
        first = new Node(data,oldFirst);
        N++;
    }

    public void addLast(Item data){
        Node newItem = new Node(data,null);

        if(this.first == null){
            first = newItem;
        }

        else{
            Node tmp = this.first;

            while (tmp.next != null)
                tmp = tmp.next;

            tmp.next = newItem;
        }
    }

    public boolean isEmpty(){
        return (this.first == null);
    }

    public int getN(){
        Node x = this.first;

        while(x != null){
            x = x.next;
            this.N++;
        }
        return N;
    }

    public void removeFirst(){
        this.first = first.next;
        this.N--; 
    }   
    public static void main(String[] args) {
    	List <Integer> Aww = new List <Integer> ();
    	Aww.addFirst(1);
    	Aww.addLast(3);
    	System.out.println(Aww);
    }
}
