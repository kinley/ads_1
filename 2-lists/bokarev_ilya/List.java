import java.util.Iterator;

//вспомогательный класс, организующий работу со связным списком
public class List<Item> implements Iterable<Item> {

	public Node<Item> head;

	private class Node<Item> {
		Item data;
		Node next;
	}

	//конструктор по умолчанию
	public List() { }

	//конструктор с занесением заданного значения в голову списка
	public List(Item a) {
		Node n = new Node();
		n.data = a;
		this.head = n;
	}

	//получение значения головы списка
	public Item returnHead() {
		return this.head.data;
	}

	//вставка в начало списка
	public void firstInsert(Item a) {
		Node oldHead = this.head;
		Node newHead = new Node();
		newHead.data = a;
		this.head = newHead;
		head.next = oldHead;
	}

	//удаление из начала списка
	public void firstDelete() {
		this.head = head.next;
	}

	//вставка в конец списка
	public void lastInsert(Item a) {
		if (this.isEmpty())
			this.firstInsert(a);
		else {
			Node insert = new Node();
			insert.data = a;
			Node x = this.head;
			while (x.next != null)
				x = x.next;
			x.next = insert;
		}
	}

	//удаление с конца списка
	public void lastDelete() {
		Node x = this.head;
		while (x.next != null)
			x = x.next;
		x = null;
	}

	//проверка на наличие в списке элементов
	public boolean isEmpty() {
		return this.head == null;
	}

	public Iterator<Item> iterator() {
		return new ListIterator();
	}

	//реализация итератора
	private class ListIterator implements Iterator<Item> {

		private Node pointer = head;

		public boolean hasNext() {
			return pointer != null;
		}

		public void remove() { }

		public Item next() {
			Item item = (Item) pointer.data;
			pointer = pointer.next;
			return item;
		}
	}
	
}