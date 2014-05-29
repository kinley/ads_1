public class Set<Key> {
	
	
	private class Node{
		Key key;
		int value;
		Node next;
		
		Node(Key key, int value, Node next ){
			this.key=key;
			this.value=value;
			this.next=next;
			
			}
		}
	
	
	private Node first=null;
	
	public Node getFirst(){
		return first;
	}
	
	public Key getKey(){
		if(!isEmpty()) return first.key;
		return null;
	}
	
	public void goHead(){
		if(!isEmpty()) first=first.next;
	}
	
	public int getVal(){
		if(!isEmpty()) return first.value;
		return -1;
	}
	
	public void add(Key key,int value){
		if(this.first==null){
			Node paste=new Node(key,value,null);
			first=paste;
		}
		else{
			Node step=first;
			while(step.next!=null) step=step.next;
			Node paste=new Node(key,value,null);
			step.next=paste;
		}
	}
	
	public void print(){
		Node writer=first;
		while(writer!=null){
			System.out.println(writer.value+" "+writer.key);
			writer=writer.next;
		}
	}
		
	public int get(Key key){
		Node finder=first;
		while(finder!=null){
			if(finder.key.equals(key)) {
				return finder.value;
			}
			else finder=finder.next;
		}
		return -1;
		}
	
	public boolean isEmpty(){
		return first==null;
	}
	
	public int Size(){
		int count=0;
		Node look=first;
		while(look!=null){
			count++;
			look=look.next;
		}
		return count;
	}
	
	public void delete(Key key){
		Node watch=first;
		if(first.key.equals(key)) {
			first.next=watch.next;
		}
		else{
			Node prev=first;
			while(watch!=null){
				if(watch.key.equals(key)){
					prev.next=watch.next;
					return;
				}
				prev=watch;
				watch=watch.next;
			}
		}
	}
		
	public boolean contains(Key key){
		Node finder=first;
		while(finder!=null){
			if(finder.key.equals(key)) {
				return true;
				}
			finder=finder.next;
		}
		return false;
	}
}

