public class List<Item> {
// Попробуем собрать список
// Нумерация в списке человеческая - с 1, потому что нулевым идет фантомный элемент
// Создаем головной (= фантомный) элемент

private class NodeL {
// Содержимое текущего элемента списка
    private Item element;
// Cледующий элемент списка
    private NodeL next;
// Вывод содержимого текущего элемента
    public Item getElement() {return element;}
// Установка содержимого для текущего элемента списка
    public void setElement(Item e){ element = e;}
// Получение указателя на следующий элемент списка
    public NodeL getNext() {return next;}
// Установка следующего элемента списка
    public void setNext(NodeL n) {next = n;}
}



	private NodeL headElement = new NodeL();
	private int size;

// Метод добавления элемента в список	
	public void setElement(Item element)
	{
		NodeL nodeNow = headElement;
		//пролистаем список до последнего элемента
		while (nodeNow.getNext() != null)
		{
			nodeNow = nodeNow.getNext();
		}
		//поставим после последнего элемента новый
		NodeL node = new NodeL();
		node.setElement(element);
		nodeNow.setNext(node);
		node.setNext(null);
		//сообщим, что изменили размер списка
		this.size++;
	}
// Метод получения элемента из списка	
	public Item getElement(int numb)
	{
		NodeL nodeNow = new NodeL();
		nodeNow = headElement;
		for (int i = 0; i<numb; i++) nodeNow = nodeNow.getNext();
		return nodeNow.getElement(); //компилятор почему-то считает, что возвращается не
			//просто Item, а Object. Хотя Node честно подаёт Item...
		
	}
// Удалить элемент с номером (человеческим!)
	public void del(int numb)
	{
		NodeL nodeNow = new NodeL();
		nodeNow = headElement;
		for (int i = 0; i<numb-1; i++) nodeNow = nodeNow.getNext();
		NodeL prevNode = nodeNow.getNext();
		nodeNow.setNext(prevNode.getNext());
	}
// Узнать размер списка
	public int size() { return this.size; }
// А не пуст ли он?
	public boolean isEmpty() 
	{
		if (0 == size) {return true;} else {return false;}
	}
	
	public void List(){
		NodeL headElement = new NodeL();
		int size = 0;
	}
	
	
}
