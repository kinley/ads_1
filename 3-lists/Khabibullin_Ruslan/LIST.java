public class LIST<T> {
	
	private T Item;
	private LIST prev;
	private LIST next;
	private LIST head;
	
	public LIST(){
		this.next=null;
		this.prev=null;
	}
	
	public LIST(T Item){
		this.Item=Item;
		this.next=null;
		this.prev=null;
	}
	
	
	public void putEnd(T Item){		//Вставка в список
		LIST<T> element=new LIST<>(Item);
		LIST<T> step=head;
		if(head==null){
			element.next=head;
			element.prev=null;
			head=element;
		}
		else{			//если не пуст, то идем в конец, и добавляем
			while(step.next!=null) step=step.next;
			step.next=element;
			element.prev=step;
			element.next=null;
			step=step.next;
		}
	}
	
	public void putHead(T Item){	//вставка элемента в голову
		LIST<T> element=new LIST(Item);
		element.next=head;
		element.prev=null;
		if(head!=null) head.prev=element;
		head=element;
	}
	
	public void deleteFirst(){	//удаление первого элемента
		head=head.next;
		head.prev=null;
	}
	
	public void deleteLast(){	//удаление последнего элемента
		LIST<T> element=head;
		LIST<T> step=head;
		while(element.next!=null){
			step=element;						
			element=element.next;
		}
		step.next=null;
	}
	
	public T printToIndex(int i){		//вывод i-того элемента записи
		LIST<T> element=head;
		int counter=0;
		while(element!=null){
								counter++;
								if(i==counter){
									return element.Item;
								}
								else element=element.next;
		}
		return null;
	}
	
	public void deleteToIndex(int i){		//Удаление i-того элемента записи
		LIST<T> element=head;
		LIST<T> step=head;
		int counter=0;
		while(element!=null){
								counter++;
								if(counter==i){
									if(element==head){
										head=head.next;
									}
									else {
										step.next=element.next;
									}
									break;
								}
								else{
									step=element;
									element=element.next;
								}
		}
	}
	
	public void pasteToIndex(T c,int i){		//Вставка в i-ое место записи
		LIST<T> element=head;
		LIST<T> step=head;
		LIST<T> paster=new LIST(c);
		int counter=0;
		while(element!=null){
			counter++;
			if(counter==i){
				if(i==1){
					paster.next=head;
					paster.prev=null;
					head.prev=paster;
					head=paster;
				}
				else{
					step.next=paster;
					element.prev=paster;
					paster.prev=step;
					paster.next=element;
				}
					break;
			}
			else{
				step=element;
				element=element.next;
			}
		}
	}
	
	public void printNode(){		//просто вывод всей записи
		LIST<T> step=head;
		while(step!=null){
			System.out.print(step.Item+" ");
			step=step.next;
		}
	}
	
	public int Size(){	//вывод размера списка
		LIST<T> step=head;
		int counter=0;
		while(step!=null){
			counter++;
			step=step.next;
		}
	return counter;	
	}
}

