package just;


import java.util.Scanner;


public class just {
	public static Node head,last,w;
	public static Node position;
	public static Node x,n,p;
	public static int z;
	
	public static void main(String[] args){
		just sp= new just();
		sp.init();
		sp.machine();
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
	
	
	public void machine(){
		just sp=new just();
		Node root=head;
		while(root!=null){
			 if(root.value=='*'){
				 if(root.next!=null)if(root.next.value=='�'){
					 if(root.next.next!=null)if(root.next.next.value=='�'){
						 if(root.next.next.next!=null)if(root.next.next.next.value=='�'){
							 if(root.next.next.next.next!=null)if(root.next.next.next.next.value=='�'){
								 root.next.value='�';
								 root.next.next.value='�';
								 root.next.next.next.value='�';
								 root.next.next.next.next.value='*';
								 sp.remove1(root);
							 }
						 }
					 }
				 }
			 }
			 if(root.value=='*'){
				 if(root.next!=null)if(root.next.value=='�'){
					 if(root.next.next!=null)if(root.next.next.value=='�'){
						if(root.next.next.next==null){
							sp.remove1(root.next.next);
							sp.remove1(root.next);
						}
					 }
				 }
			}
			 if(root.value=='*'){
				 if(root.next!=null)if(root.next.value=='�'){
					 if(root.next.next!=null)if(root.next.next.value=='�'){
						if(root.next.next.next!=null)if(root.next.next.next.value!='�'){
							sp.remove1(root.next.next);
							sp.remove1(root.next);
						}
					 }
				 }
			}
			 if(root.value=='*'){
				 if(root.next!=null)if(root.next.value=='�'){
					 if(root.next.next!=null)if(root.next.next.value=='�'){
						if(root.next.next.next!=null)if(root.next.next.next.value=='�')
						if(root.next.next.next.next==null){
							sp.remove1(root.next.next);
							sp.remove1(root.next);
						}
					 }
				 }
			}
			 
			 if(root.value=='*'){
				 if(root.next!=null)if(root.next.value=='�'){
					 root.value='�';
					 root.next.value='�';
					 sp.add(root.next, '�');
					 sp.add(root.next.next, '�');
					 sp.add(root.next.next.next, '*');
				 }
			}
			 
			 if(root.value=='*'){
				 if(root.next!=null)if(root.next.value=='�'){
					 root.value='�';
					 root.next.value='�';
					 sp.add(root.next, '�');
					 sp.add(root.next.next, '*');
				 }
			}
			 
			 if(root.value=='*'){
				 if(root.next!=null)if(root.next.value=='�'){
					 if(root.next.next==null){
						 root.value='�';
						 root.next.value='�';
						 sp.add(root.next, '�');
						 sp.add(root.next.next, '�');
						 sp.add(root.next.next.next, '*');
					 }
				 }
			}
			 if(root.value=='*'){
				 if(root.next!=null)if(root.next.value=='�'){
					 if(root.next.next!=null)if(root.next.next.value!='�'){
						 root.value='�';
						 root.next.value='�';
						 sp.add(root.next, '�');
						 sp.add(root.next.next, '�');
						 sp.add(root.next.next.next, '*');
					 }
				 }
			}
			 
			 if(root.value=='*'){
				 if(root.next!=null)if(root.next.value=='�'){
					 root.value='.';
					 sp.remove1(root.next);
					 break;
				 }
			}
			 
			 if(root.value=='*'){
				 if(root.next!=null)if(root.next.value!='�')if(root.next.value!='�')
				 if(root.next.value!='�')if(root.next.value!='�'){
					 root.value=' ';
					 sp.add(root, '�');
				 }
			}
			 if(root.value=='*'){
				 if(root.next==null){
					 root.value=' ';
					 sp.add(root, '�');
				 }
			}
			 
			 if(root.value==' '){
				 root.value='*';}
			 
			 root=root.next;
		}
	}
	
	public void add(Node root,char c){
		if(root==null){
			Node p=last;
			Node element=new Node();
			element.prev=last;
			element.next=null;
			element.value=c;
			last=element;
			
		}
		n=root.next;
		Node element=new Node();
		root.next=element;
		element.prev=root;
		element.next=n;
		element.value=c;
	}
	
	
	public void remove1(Node p){
		if(p==head){
			Node n=p.next;
			head=n;
			head.prev=null;
		}else{
		if(p==last){
		Node n=p.prev;
		last=n;
		last.next=null;
		}else{
			Node n=p.prev;
			Node l=p.next;
			n.next=l;
			l.prev=n;
		}
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