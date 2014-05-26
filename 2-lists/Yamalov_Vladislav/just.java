package just;



import java.util.Scanner;


public class just {
	public static Node head,last,w;
	public static Node position;
	public static Node x,n,p,o_bracket,c_bracket,o_bracket1,c_bracket1;
	public static int z;
	
	public static void main(String[] args){
		just sp= new just();
		sp.init();
		sp.count();
		for(int i=0;i<z;i++){
		sp.machine();}
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
	
	public void count(){
		Node root=head;
		z=0;
		while (root!=null){
			p=root.prev;
			n=root.next;
			if(root.value=='+'||root.value=='-'||root.value=='*'||root.value=='/'
					&&p.value==')'&&n.value=='('){
				z++;			
			}
		root=root.next;
		}
	}
	public void machine(){
		Node root=head; int bracket=0;
		 
		while (root!=null){
			p=root.prev;
			n=root.next;
			if(root.value=='+'||root.value=='-'||root.value=='*'||root.value=='/'){
					if(p.value==')'&&n.value=='('){
				position=root;
				break;
				
			}}
		root=root.next;
		}
		root=position;
		while(root!=null){
			if(root.value=='('){bracket++; if(bracket==1){o_bracket1=root;}}
			if(root.value==')'){bracket--; if(bracket==0){c_bracket1=root;break;}}
			root=root.next;
		}
		c_bracket1.value=position.value;
		root=position;
		bracket=0;
		while(root!=null){
			if(root.value==')'){bracket++; if(bracket==1){c_bracket=root;}}
			if(root.value=='('){bracket--; if(bracket==0){o_bracket=root;break;}}
			root=root.prev;
			}
		just sp=new just();
		sp.remove1(o_bracket);
		sp.remove1(c_bracket);
		sp.remove1(position);
		sp.remove1(o_bracket1);
	}
	
	
	public void remove1(Node p){
		Node n=p.prev;
		Node l=p.next;
		n.next=l;
		l.prev=n;
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