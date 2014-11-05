
public class Digit {

    private Node head = null;   //первый элемент списка( число записано наоборот - для сложения)
    private Node last = null;  //последний элемент списка(удобно осуществлять вставку в конец, и для вывода наоборот)
    private int length = 0;     //длина числа в двоичном представлении

    private class Node {    //класс узла. узел - разряд числа

        private int digit;

        public void setDigit(int input) {
            digit = input;
        }

        public int getDigit() {
            return digit;
        }

        private Node next;

        public void setNext(Node link) {
            next = link;
        }

        public Node getNext() {
            return next;
        }

        private Node prev;

        public void setPrev(Node input) {
            prev = input;
        }

        public Node getPrev() {
            return prev;
        }

        Node(int input, Node next, Node prev) {

            digit = input;
            this.next = next;
            this.prev = prev;
        }
    }

    public int getLength(){
        return length;
    }

    public Node getHead() {return head; }

    public void toBinaryForm(int input) {    //превращаем 10-ичное число в двоичное, попутно запоминая его длину

        if (input < 2) {            //это число делить не надо
            Node in = new Node(input,null,null);
            head = in;
            last = head;
            length++;
        } else {    //переводим, путем деления
            while (input >= 2) {
                Node in = new Node(input % 2, null, null);
                length++;
                if (head == null) {
                    head = in;
                    last = head;
                } else {
                    last.setNext(in);
                    in.setPrev(last);
                    last = in;
                }
                input = input / 2;
            }
            Node in = new Node(input % 2, null, last);  //один разряд всегда остается за циклом
            last.setNext(in);
            last = in;
            length++;
        }
    }

    public void printBinaryDigit()  //выводим его(с конца - так как число сохранено перевернутым. для вывода)
    {
        Node printer = last;
        while (printer != null){
            System.out.print(printer.getDigit());
            printer = printer.getPrev();
        }
    }

    public void getSum(Digit digit2){   //считаем два числа - результат - измененное первое число

        int length = 0;
        if (getLength() < digit2.getLength())
            length = getLength();
        else
            length = digit2.getLength();

        Node sum = head;
        Node sum2 = digit2.getHead();
        for (int i = 0; i < length; i++){
            sum.setDigit(sum.getDigit() + sum2.getDigit());
            if (sum.getDigit() == 2)
                sum.setDigit(0);
            sum = sum.getNext();
            sum2 = sum2.getNext();
        }
        if (sum2 != null)           //второе число оказалось больше, значит переписываем что осталось в первое число
            while (sum2 != null){
                Node paste = new Node(sum2.getDigit(), null, last);
                last.setNext(paste);
                last = last.getNext();
                this.length++;
                sum2 = sum2.getNext();
        }
    }
}
