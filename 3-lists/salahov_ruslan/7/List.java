package project2;

public class List {

	Item list = null;
	
	class Item { // Класс узла.
		char value;
		Item next;
		Item prev;
	
		Item(char value) {
			this.value=value;
		}
	}
	
	public void InList(char value) { // Вставка в начало.
		Item In = new Item(value);
		
			if (list==null) {
				list = In; 
			}
			else {
				In.next = list;
				list.prev = In;
				list = In;
			}
	}

	public void InEndOfList(char value) { // Вставка в конец.
		Item In = new Item(value);
		
			if (list == null) {
			list = In;
			}
			else {
			Item lastNode = list;
			while (lastNode.next !=null)
				lastNode = lastNode.next;
			lastNode.next = In;
			In.prev = lastNode;
		}
	}
	
	public char FirstOutput() { // Вывод первого элемента
		Item out = list;
		list = list.next;
		return out.value;
	}
	
	public char LastOutput() { // Вывод последнего элемента
		
		
		Item lastNode = list;
		Item Out;
		
		if(lastNode.next == null) { // Если нет следующего, то процедура эквивалентная выводу первого.
			Item out = list;
			list = list.next;
			return out.value;
		}
		
		while (lastNode.next !=null)
			lastNode = lastNode.next;
		Out = lastNode;
		lastNode = lastNode.prev;
		lastNode.next = null;
		return Out.value;
	}	
}
