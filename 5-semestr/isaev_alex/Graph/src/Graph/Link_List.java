package Graph;
public class Link_List {

    private Node first;
    private class Node{

        int key;
        int val;
        Node next;
        

        public Node(int key, int val, Node x){
            this.key=key;
            this.val=val;
            this.next=next;
        }
    }

     public Link_List() {
        first=null;
    }

    public void put(int key, int val){		//вставка ключа и значения в список
        Node head=first;
        Node newVar=new Node(key,val,first);
        newVar.val=val;
        newVar.key=key;
        newVar.next=head;
        head=newVar;
    }

    public int get(int key){		//возврат ключа
        for(Node x=first;x!=null;x=x.next){
            if(x.key==key) return x.val;
        }
        return -1 ;

    }

    public void delete(int key){	//удаление ключа
        Node deleter=first;
        for(Node x=first;x!=null;x=x.next){
            if(x.key==key)		//идем по записи и ищем ключ, потом удаляем(вторая голова является prev-ом переменной x)
            {
                if(x==first){
                    first=x.next;
                }
                else{
                    deleter.next=x.next;
                }
                break;
            }
            else deleter=x;
        }
    }

    public boolean contains(int key){		//проверка, содержится ли данный ключ в листе
        for(Node x=first;x!=null;x=x.next){
            if(x.key==key) return true;
        }
        return false;
    }

    public boolean isEmpty(){	//проверка на пустоту
        if(first==null){
            return true;
        }
        else return false;
    }

    public int Size(){
        int Size=0;
        for(Node x=first;x!=null;x=x.next) Size++;
        return Size;
    }

    public Tree createTree(){
        Tree Put_Tree=new Tree();
        Node x=first;
        for(x=first;x!=null;x=x.next){
            Put_Tree.add_Tree(x.val,x.key);
            }
        return Put_Tree;



}
}