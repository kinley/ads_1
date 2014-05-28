package Maxlist;
import java.util.Scanner;
public class Maxlist {
	
	int value;
	Maxlist next;
	Maxlist  head;
	int max;
	
	//�������� ������
	public void add_head(int value){
		Maxlist newval = new Maxlist();
		newval.value= value;
		newval.next = head;
		head=newval;
		}
	//����� ������������� �������� � ������
	public void SearchMax(){
		Maxlist step=head;
	    int max=step.value;
	    while(step!=null){
	        if(step.value>this.max){
	            this.max=step.value;
	            step=step.next;
	        }
	        else step=step.next;
	    }
	}
	//����� ������
	public void Print(){
		Maxlist step=head;
		while(step!=null){
			System.out.print(step.value+" ");
			step=step.next;
		}
	}
	//����������� �������������
	public int get_max(){
	        return this.max;
	    }

	
	
	//��� ����������� �������, ������� ��������� ��������.(��, � ���������, ��� ������ Exception)
	public void recursive_max(Maxlist node){
		if (head==null){
			System.out.println("list is empty") ;
		}
		if (node.value>max){
			 max=node.value;
		}
		recursive_max(node.next);
		
	}
	
	
	public static void main(String[] args){
	    Scanner in = new Scanner(System.in);

	     int value;
	     Maxlist list=new Maxlist();
	    
	     //Enter count;
	    System.out.println("Enter number");
	    int n=in.nextInt();
	    for(int i=0;i<n;i++){
	    	 System.out.println("Enter value");  
	    	value=in.nextInt();
	        list.add_head(value);
	    }
	    list.Print();
	    System.out.println();
	    list.SearchMax();
	    System.out.println("Maximum "+list.get_max());

//	    int max2=list.value; //���������� ���������� ��� ����������� �������
//	    if (list==null){
//	    	System.out.println("list is empty") ;
//	    }
//	    else{
//	    	list.recursive_max(list);
//	    }
//	
	
	
	}






}
