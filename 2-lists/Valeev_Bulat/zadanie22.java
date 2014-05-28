package class_18;
import java.util.*;
import java.io.File;
import java.io.IOException;

    public class zadanie22 <Item> {       //список релизован в виде стека
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


            public void push(Item item){  //добавление в верхушку
                    Node old = top;
                    top = new Node();
                    top.data = item;
                    top.next = old;
                    N++;
            }
            public void search(){
            	for (Node i = top; i!=null; i=i.next){
                    //System.out.print(i.data + " ");
                    String k = (String) i.data;
                    
                    if(k.charAt(0)=='z'){
                    	Node old = top;
                        top = new Node();
                        Item item=(Item) ";";
                        top.data = item;
                        top.next = i;
                        top.prev = i.next;
                    //System.out.print(k.charAt(0) + " ");
                    }
                }
            }

            public Item pop(){
                  Item item = top.data;
                  top = top.next;
                  N--;
                  return item;
            }

            public void writer(){                           //  демонстрация списка
                for (Node i = top; i!=null; i=i.next){
                    System.out.print(i.data + " ");
                    //System.out.print(i.next + " ");
                    //System.out.print(i.prev + " ");
                }

            }


            public static void main (String[] args) throws IOException  {    
            	zadanie22 <String> s = new zadanie22<String>();
            	zadanie22 <String> UnEven = new zadanie22<String>();
            	zadanie22 <String> Even = new zadanie22<String>();
            	final Scanner r = new Scanner(new File("input.txt"));
        		while (r.hasNext()) {
                    String k = r.next();
                    s.push(k);
        		}  



                s.search();
                System.out.println("List");
            }


}


