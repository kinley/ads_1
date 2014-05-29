package edik;

class item{
	int data;
	item next;
	item prev;
	item list = null;
	
	item(int data){
		this.data = data;
	}
	
	void addend(int data){
		item addition = new item(data);
		if (list == null){
			list = addition;
		}
		else{
			item lastNode = list;
			while (lastNode.next != null)
				lastNode = lastNode.next;
			lastNode.next = addition;
			addition.prev = lastNode;
		}
	}
	
	void addstart(int data){
		item addition = new item(data);
		if (list == null){
			list = addition;
		}
		else{
			addition.next = list;
			list.prev = addition;
			list = addition;
		}
	}
	
	void addafterthat(item node, int data){
		item addition = new item(data);
		item next = node.next;
		node.next = addition;
		addition.next = next;
		addition.prev = node;
		if (next != null)
			next.prev = addition;
	}
	
	void addbeforethat(item node, int data){
		item addition = new item(data);
		item prev = node.prev;
		if (prev != null)
			prev.next = addition;
		else
			list = addition;
		addition.next = node;	
		addition.prev = prev;
		node.prev = addition;
	}
}