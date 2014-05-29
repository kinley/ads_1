package List;

public class List<T> {
	private T Item;
	private List prev;
	private List next;
	private List head;
	
	public List(){
		this.next=null;
		this.prev=null;
	}
	
	public List(T Item){
		List<T> paste=new List();
		paste.Item=Item;
		this.head=paste;
		
	}
	
	
	public void putEnd(T Item){		//������� � �����
		List<T> element=new List();
		element.Item=Item;
		List<T> step=head;
		if(head==null){
			element.next=head;
			element.prev=null;
			head=element;
		}
		else{			//���� �� ����, ���� � ����� � ��������
			while(step.next!=null) step=step.next;
			step.next=element;
			element.prev=step;
			element.next=null;
			step=step.next;
		}
	}
	
	public void putHead(T Item)
	{	//������� � ������
		List<T> element=new List();
		element.Item=Item;
		element.next=head;
		element.prev=null;
		if(head!=null) head.prev=element;
		head=element;
	}
	

	public void deleteLast(){	//�������� ����������
		List<T> element=head;
		List<T> step=head;
		while(element.next!=null){
			step=element;						
			element=element.next;
		}
		step.next=null;
	}
	
	public T printToIndex(int i){		//������� �������� � ������ i
		List<T> element=head;
		int counter=0;
		while(element!=null)
		{
			counter++;
			if(i==counter)
			{
			return element.Item;
			}
			else element=element.next;
		}
		return null;
	}
	
	
	public void printNode(){		//������� ������
		List<T> step=head;
		while(step!=null){
			System.out.print(step.Item+" ");
			step=step.next;
		}
	}
	
	public int Size(){	//������� ������ ������
		List<T> step=head;
		int counter=0;
		while(step!=null){
			counter++;
			step=step.next;
		}
	return counter;	
	}

}
