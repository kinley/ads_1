package Bracket;

public class Stack {

	private class Node {
		char data;
		Node next;
	}

	private Node top;

	public void push(char item) {
		Node node = new Node();
		node.data = item;
		node.next = top;
		top = node;
	}

	public char pop() {
		Node node = top;
		top = node.next;
		return node.data;
		
	}
	
	public boolean isEmpty() {
		return this.top == null;
	}
	
}