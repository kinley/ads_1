// реализация двухуровневого списка пропусков
public class SkipList {

	public Node head; // голова списка
	private int size; // количество элементов в списке
	private final int skipSize = 3; // количество элементов между пропусками

	private class Node {
		String data;  // значение в узле
		Node skip; // ссылка по верхнему уровню
		Node next; // ссылка по нижнему уровню
	}

	// true, если в списке есть значащие элементы
	public boolean isEmpty() {
		return size == 0;
	}

	// количество значащих элементов в списке
	public int getSize() {
		return this.size;
	}

	// есть ли в списке элемент s
	public boolean member(String s) {
		if (this.isEmpty())
			return false;
		Node pointer = this.head;
		if (pointer.data.equals(s))
			return true;
		while ((pointer.skip != null)
				&& (comparision(pointer.skip.data, s)) != 1) { // пока следующий
			// элемент не больше
			// искомого и существует
			pointer = pointer.skip;
		}
		for (int i = 0; i <= skipSize; i++) {
			if (pointer == null)
				return false;
			else if (pointer.data.equals(s))
				return true;
			pointer = pointer.next;
		}
		return false;
	}

	// вставка в список с сохранением структуры пропусков
	public void insert(String s) {
		if (!this.member(s)) {
			if (this.isEmpty())
				this.head.data = s;
			else {
				Node pointer = this.head;
				while (pointer.skip != null
						&& comparision(pointer.skip.data, s) != 1) {
					// пока следующий
					// элемент не больше
					// искомого и существует
					pointer = pointer.skip;
				}
				Node correctSkip = pointer;// с этого элемента начинаем
											// исправление связей для пропусков
				while (pointer.next != null
						&& comparision(pointer.next.data, s) != 1) {
					// пока следующий элемент не больше искомого и существует
					pointer = pointer.next;
				}

				// вставка в список
				Node insertNode = new Node();
				insertNode.data = s;
				if (comparision(pointer.data, s) != 1) {// если не нужно вставлять перед головой
					insertNode.next = pointer.next;
					pointer.next = insertNode;
				} else {
					insertNode.next = this.head;
					this.head = insertNode;
					correctSkip = this.head;
					}

				// исправление связей
				correct(correctSkip);
			}
			this.size++;
		}
	}

	// удаление из списка с сохранением структуры пропусков
	public void delete(String s) {
		if (this.member(s)) {
			Node correctSkip;
			if ( comparision(this.head.data, s) != 0) {
			Node pointer = this.head;
			while (pointer.skip != null
					&& comparision(pointer.skip.data, s) != 1) {
				// пока следующий
				// элемент не больше
				// искомого и существует
				pointer = pointer.skip;
			}
			correctSkip = pointer;// с этого элемента начинаем
										// исправление связей для пропусков
			while ( !(pointer.next.data.equals(s) ) ) {
				// пока следующий элемент не равен искомому
				pointer = pointer.next;
			}

			pointer.next = pointer.next.next; // удаление из списка
		}
			else {
				this.head = this.head.next;
				correctSkip = this.head;
			}
			//исправление связей
			correct(correctSkip);
			this.size--;
		}
	}

	// исправление связей для пропуска
	public void correct(Node node) {
		Node pointer = node.next;
		int i = 1;
		while (pointer != null) {
			if (i % skipSize == 0) {
				node.skip = pointer;
				node = pointer;
			} else {
				pointer.skip = null;
			}
			pointer = pointer.next;
			i++;
		}
	}

	// сравнивает между собой две строки произвольной длины
	public static int comparision(String a, String b) {
		int minLength;
		if (a.length() < b.length())
			minLength = a.length();
		else
			minLength = b.length();
		int i = 0;
		char c1 = 0;
		char c2 = 0;
		while ((c1 == c2) && (i < minLength)) {
			c1 = a.charAt(i);
			c2 = b.charAt(i);
			i++;
		}
		if (c1 > c2)
			return 1;
		if (c1 < c2)
			return -1;
		if ((c1 == c2) && (a.length() > b.length()))
			return 1;
		if ((c1 == c2) && (a.length() < b.length()))
			return -1;
		return 0;
	}

	//конструктор, инициализирует голову пустым элементом
	public SkipList() {
		this.head = new Node();
	}

	//тестовый метод вывода элементов, связанных на нижнем уровне
	public void output() {
		Node pointer = this.head;
		while (pointer != null) {
			if (pointer.skip != null)
				System.out.print("+");
			System.out.println(pointer.data);
			pointer = pointer.next;
		}
	}
	
	//тестовый метод вывода элементов, связанных на высшем уровне
	public void outputSkip() {
		Node pointer = this.head;
		while (pointer != null) {
			System.out.println(pointer.data);
			pointer = pointer.skip;
		}
	}

}