import java.util.Iterator;

//��������������� �����, ������������ ������ �� ������� �������
public class List<Item> implements Iterable<Item> {

	public Node<Item> head;

	private class Node<Item> {
		Item data;
		Node next;
	}

	//����������� �� ���������
	public List() { }

	//����������� � ���������� ��������� �������� � ������ ������
	public List(Item a) {
		Node n = new Node();
		n.data = a;
		this.head = n;
	}

	//��������� �������� ������ ������
	public Item returnHead() {
		return this.head.data;
	}

	//������� � ������ ������
	public void firstInsert(Item a) {
		Node oldHead = this.head;
		Node newHead = new Node();
		newHead.data = a;
		this.head = newHead;
		head.next = oldHead;
	}

	//�������� �� ������ ������
	public void firstDelete() {
		this.head = head.next;
	}

	//������� � ����� ������
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

	//�������� � ����� ������
	public void lastDelete() {
		Node x = this.head;
		while (x.next != null)
			x = x.next;
		x = null;
	}

	//�������� �� ������� � ������ ���������
	public boolean isEmpty() {
		return this.head == null;
	}

	public Iterator<Item> iterator() {
		return new ListIterator();
	}

	//���������� ���������
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