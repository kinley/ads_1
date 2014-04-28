public class STACK 
{
	private Symbol first;
	private class Symbol{
		char Item;
		Symbol next;
	}
	
	public void push(char Item){		//������ ����� � ��� ����(����� � �����, ��� �����:))
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
	
	public boolean check(){	//�������� �� �������, ���� ���� �������� 03I203I, �� ��� ���������� ��������� � �������� �� �� ���
		Symbol step=first;
		String checker="";
		for(step=first;step!=null;step=step.next){
			checker=checker+step.Item;
			if(checker.equals("03I203I") && step.next==null) checker="3";
		}
		System.out.println(checker);
		if(checker.equals("3")) return true;
		else return false;		//��� �� �������� �������� ���������, ���� �������� ���-�� ������
	}
	
	public char pop(){		//������ ������������ ���� ����
		char Item=first.Item;
		first=first.next;
		return Item;
	}
}

