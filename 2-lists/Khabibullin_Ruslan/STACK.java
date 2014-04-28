public class STACK 
{
	private Symbol first;
	private class Symbol{
		char Item;
		Symbol next;
	}
	
	public void push(char Item){		//просто пушим в наш стэк(пушим в конец, это важно:))
		Symbol paste=new Symbol();
		paste.Item=Item;
		Symbol step=first;
		if(first==null){
			paste.next=null;
			first=paste;
		}
		else {
			while(step.next!=null) step=step.next;
			step.next=paste;
			paste.next=null;
			}
		}
	
	public boolean check(){	//проверям на условие, если стэк содержит 03I203I, то это правильное выражение и заменяем ее на три
		Symbol step=first;
		String checker="";
		for(step=first;step!=null;step=step.next){
			checker=checker+step.Item;
			if(checker.equals("03I203I") && step.next==null) checker="3";
		}
		System.out.println(checker);
		if(checker.equals("3")) return true;
		else return false;		//оно не содержит искомого выражение, либо содержит что-то помимо
	}
	
	public char pop(){		//просто отстреливаем весь стек
		char Item=first.Item;
		first=first.next;
		return Item;
	}
}

