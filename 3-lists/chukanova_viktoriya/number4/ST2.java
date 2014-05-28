import spisok.Node;


public class ST<Key,Value>{
		
		private class Node{	// запись, с элементом, и ключом для ее поиска
		    private Node last;
		    private int T;
			}
		    public class Node {
		Node first=null;	//голова
	
	    private Node last;
        Node next;//указатель на следующий элемент
        Node prev;//указатель на предыдущий элемент

 // создание нового элемента
    public Node newElem(int data)
    {
      // Node  oldlast = last;
        Node Elem = new Node();    // выделяем память
        last.next = null;          // устанавливаем ссылки 
        last.prev = null;
        Item item;
        last.data = item;
        T++;
    }
    public int size() {
        return T;
    }

    public boolean isEmpty() {
        return first == null;
    }
    public static void main(String [] args){      
	    System.out.print("\nВвод элементов:");
	    do{                        // цикл формирования списка
	       end=AddElem(end);
	       if(end==null)      //  выход из цикла
	       break;
	       N--;           // счетчик введенных элементов
	    
	       {
		   if (first == null) return null; // список пуст, возвращаем null
	        else
	        {
	            Node result = ferst.prev;      // получаем голову списка
	            first.prev = result.prev;      // извлекаем ссылку на result из списка
	        }    
	    while(N > 0) // пока необходимо вводить элементы                      
	    System.out.print("\n\n\n Результат:");
	    System.out.println();            // вывод на печать сформированного списка 
	    System.out.print("\n\n\n Нет совпадений ");
	    }
	    }
	  
public class Elem {
	private Object next;
	private Object index;
	public void PoiskElem()
	    {	
	    Elem list;
	        Elem pel=list;
	        while(pel.next!=null)      //цикл сравнения элементов
	        {
	            while(pel.next!= null)
	                {
	                     pel =(Elem)pel.next;
	                     if(list.index == pel.index)   //если есть одинаковые элементы - выходим из цикла 
	                        {   
	                    	 System.out.print("\n\n Есть совпадение\n\n");
	                             wait (0);
	                        }
	                }
	            pel = (Elem)list.next;
	            list = (Elem)list.next;
	        }
	    }
}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	