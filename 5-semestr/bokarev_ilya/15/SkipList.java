// ���������� �������������� ������ ���������
public class SkipList {

	public Node head; // ������ ������
	private int size; // ���������� ��������� � ������
	private final int skipSize = 3; // ���������� ��������� ����� ����������

	private class Node {
		String data;  // �������� � ����
		Node skip; // ������ �� �������� ������
		Node next; // ������ �� ������� ������
	}

	// true, ���� � ������ ���� �������� ��������
	public boolean isEmpty() {
		return size == 0;
	}

	// ���������� �������� ��������� � ������
	public int getSize() {
		return this.size;
	}

	// ���� �� � ������ ������� s
	public boolean member(String s) {
		if (this.isEmpty())
			return false;
		Node pointer = this.head;
		if (pointer.data.equals(s))
			return true;
		while ((pointer.skip != null)
				&& (comparision(pointer.skip.data, s)) != 1) { // ���� ���������
			// ������� �� ������
			// �������� � ����������
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

	// ������� � ������ � ����������� ��������� ���������
	public void insert(String s) {
		if (!this.member(s)) {
			if (this.isEmpty())
				this.head.data = s;
			else {
				Node pointer = this.head;
				while (pointer.skip != null
						&& comparision(pointer.skip.data, s) != 1) {
					// ���� ���������
					// ������� �� ������
					// �������� � ����������
					pointer = pointer.skip;
				}
				Node correctSkip = pointer;// � ����� �������� ��������
											// ����������� ������ ��� ���������
				while (pointer.next != null
						&& comparision(pointer.next.data, s) != 1) {
					// ���� ��������� ������� �� ������ �������� � ����������
					pointer = pointer.next;
				}

				// ������� � ������
				Node insertNode = new Node();
				insertNode.data = s;
				if (comparision(pointer.data, s) != 1) {// ���� �� ����� ��������� ����� �������
					insertNode.next = pointer.next;
					pointer.next = insertNode;
				} else {
					insertNode.next = this.head;
					this.head = insertNode;
					correctSkip = this.head;
					}

				// ����������� ������
				correct(correctSkip);
			}
			this.size++;
		}
	}

	// �������� �� ������ � ����������� ��������� ���������
	public void delete(String s) {
		if (this.member(s)) {
			Node correctSkip;
			if ( comparision(this.head.data, s) != 0) {
			Node pointer = this.head;
			while (pointer.skip != null
					&& comparision(pointer.skip.data, s) != 1) {
				// ���� ���������
				// ������� �� ������
				// �������� � ����������
				pointer = pointer.skip;
			}
			correctSkip = pointer;// � ����� �������� ��������
										// ����������� ������ ��� ���������
			while ( !(pointer.next.data.equals(s) ) ) {
				// ���� ��������� ������� �� ����� ��������
				pointer = pointer.next;
			}

			pointer.next = pointer.next.next; // �������� �� ������
		}
			else {
				this.head = this.head.next;
				correctSkip = this.head;
			}
			//����������� ������
			correct(correctSkip);
			this.size--;
		}
	}

	// ����������� ������ ��� ��������
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

	// ���������� ����� ����� ��� ������ ������������ �����
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

	//�����������, �������������� ������ ������ ���������
	public SkipList() {
		this.head = new Node();
	}

	//�������� ����� ������ ���������, ��������� �� ������ ������
	public void output() {
		Node pointer = this.head;
		while (pointer != null) {
			if (pointer.skip != null)
				System.out.print("+");
			System.out.println(pointer.data);
			pointer = pointer.next;
		}
	}
	
	//�������� ����� ������ ���������, ��������� �� ������ ������
	public void outputSkip() {
		Node pointer = this.head;
		while (pointer != null) {
			System.out.println(pointer.data);
			pointer = pointer.skip;
		}
	}

}