package List;

public class List {

    private Node head = null;      //начало списка

    private class Node{         //подкласс узла

        private int exp;

        public void setExp(int exp){

            this.exp = exp;
        }

        public int getExp(){

            return this.exp;
        }

        int factor;

        public void setFactor(int factor){

            this.factor = factor;
        }

        public int getFactor(){

            return this.factor;
        }

        Node next;

        public void setNext(Node next){

            this.next = next;
        }

        public Node getNext(){

            return this.next;
        }

        Node(int exp, int factor, Node next){

            this.exp = exp;
            this.factor = factor;
            this.next = next;
        }
    }

    private void rewriteHead(int exp,int factor){ //добавление узла в начало списка

        Node in = new Node(exp,factor,this.head);
        this.head= in;
    }

    private void pasteBetween(int exp,int factor, Node prev, Node next){

        Node in = new Node(exp,factor,next);
        prev.setNext(in);
    }

    public void initialList(int exp, int factor){

        if (head == null || (exp < head.getExp() && factor != 0))       //если голова пуста, то добавление туда
            rewriteHead(exp,factor);

        else{                   //иначе проходимся по списку и осуществляем сортированную вставку

            Node prev = head;
            Node current = head.getNext();
            while (current != null){
                if (prev.getExp() < exp && current.getExp() > exp) {
                    pasteBetween(exp, factor, prev, current);
                    return;
                }
                if (exp == current.getExp() && factor != 0) {
                    current.setFactor(factor + current.getFactor());
                    return;
                }
                prev = prev.getNext();
                current = current.getNext();
            }
            if (factor != 0)
                pasteBetween(exp,factor,prev,null);     //прошли по списку, если ничего не вставилось, значит нужно добавить в конец
        }
    }

    public void printList(){
        Node printer = head;
        while (printer != null){
            if (printer.getNext() != null)
                System.out.print(printer.getFactor() + "x" + printer.getExp() + "+");
            else
                System.out.print(printer.getFactor() + "x" + printer.getExp());
            printer = printer.getNext();
        }
    }
}
