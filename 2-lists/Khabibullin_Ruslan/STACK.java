//Тут стэк, содержащий список элементов, удовлетворяющих условию, заданному в классе main
public class STACK {
	private Symbol first;
	private int length;
	private class Symbol{
		char Item;
		Symbol next;
	}
	public void push(char Item){
		Symbol oldfirst=first;
		first=new Symbol();
		first.Item=Item;
		first.next=oldfirst;
		length++;
	}
	public char pop(){
		char Item=first.Item;
		first=first.next;
		length--;
		return Item;
	}
		
}

