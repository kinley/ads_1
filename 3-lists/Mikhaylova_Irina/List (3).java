package omm;

public class List {
	Item list = null;

	class Item {
		char value;
		Item next;
		Item prev; \\вот оно, главное отличие двусвязного и односвязного

		Item(char value) {
		this.value=value;
		}
		}

	public void InList(char value) {
		Item In = new Item(value);

		if (list==null) {
			list = In; }
		else {
			In.next = list;
			list.prev = In;
			list = In;}
	}

	public void InEndOfList(char value) { 
		Item In = new Item(value);

		if (list == null) {
			list = In; }
		else {
			Item lastNode = list;
			while (lastNode.next !=null)
				lastNode = lastNode.next;
				lastNode.next = In;
				In.prev = lastNode;}
	}

	public char FirstOutput() {
		Item out = list;
		list = list.next;
		return out.value;
	}

	public char LastOutput() {
		Item lastNode = list;
		Item Out;
		while (lastNode.next !=null)
			lastNode = lastNode.next;
			Out = lastNode;
			lastNode = lastNode.prev;
			lastNode.next = null;
			return Out.value;}
}