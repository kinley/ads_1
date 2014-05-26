

import java.util.Scanner;


public class Spisok {
	public Node head,last,w;
	public Node position;
	public Node x,n,p,o_bracket,c_bracket;
	
	public static void main(String[] args){
		Spisok sp=new Spisok();
		sp.init();
		sp.print();

	}
	public void init(){
		Node u=null;
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		Node x=new Node();
		x.next=null;
		x.prev=null;
		x.value=s.charAt(0);
		head=x;
		w=head;
		for(int i=1;i<s.length();i++){
			x.next=new Node();
			x=x.next;
			x.next=null;
			x.value=s.charAt(i);
			x.prev=w;
			w=x;
			last=x;
		}
	}
	
	public void print(){
		Node root=head;
		while(root!=null){
			System.out.print(root.value);
			root=root.next;
		}
	}

}

class Node{
	Node next;
	Node prev;
	char value;
	public Node(){
		this.next=next;
		this.prev=prev;
		this.value=value;
	}
}