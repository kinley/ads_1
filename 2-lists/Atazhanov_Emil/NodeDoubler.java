import java.util.*;

    public class NodeDoubler <Item> {       //реализация списка в виде стека
        private Node top;
        private Node last;
        private int N;


             private class Node{
                 Item data;
                 Node next;
                 Node prev;

               }

            public boolean isEmpty(){ return N==0; }

            public int size(){ return N;}


            public void pushNodeStack(Item item){  //добавление элемента в шапку
                    Node old = top;
                    top = new Node();
                    top.data = item;
                    top.next = old;
                    N++;
            }

            public Item popNodeStack(){
                  Item item = top.data;
                  top = top.next;
                  N--;
                  return item;
            }

            public void Show(){                           //  вывод списка
                for (Node i = top; i!=null; i=i.next){
                    System.out.print(i.data + " ");
                }

            }


            public static void main (String[] args){
                NodeDoubler <String> s = new NodeDoubler<String>();
                NodeDoubler <String> UnEven = new NodeDoubler<String>();
                NodeDoubler <String> Even = new NodeDoubler<String>();

               /* Scanner sc = new Scanner(System.in);
                System.out.println("Write list");
                String sample = sc.nextLine();              //читаем как строку, делим слова по пробелам и записываем в массив строк
                String [] stt = sample.split(" ");

                for(String st: stt){*/
                while (!StdIn.isEmpty())
                {
                    String st = StdIn.readString();
                    s.pushNodeStack(st);                    //переход массива в лист.
                }


                for(int j = s.size();j> 0; j-- ){                           //разделяем список на два по четности позиций элементов
                    if (j%2==0) UnEven.pushNodeStack(s.popNodeStack());
                    else Even.pushNodeStack(s.popNodeStack());
                }

                System.out.println("Uneven");
                Even.Show();
                System.out.println();
                System.out.println("Even");
                UnEven.Show();
            }


}


