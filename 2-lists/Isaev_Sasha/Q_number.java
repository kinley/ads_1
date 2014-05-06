package Q_number;
import java.util.Scanner;
public class Q_number {
	char Item_two;
	int Item_normal;
	Q_number next;
	Q_number prev;
	Q_number  head;
		
	//создание списка
	public void put(char Item_two,int Item_normal) {
		Q_number newval = new Q_number();
		newval.Item_two = Item_two;
		newval.Item_normal = Item_normal;
		newval.next = head;
		newval.prev=null;
		if(head!=null) head.prev=newval;
			head = newval;
		}

	public void sum_q(Q_number first,Q_number second){
		Q_number number_q3=this;
		Q_number step=first.head;
		int degree=0;;
		Q_number secondStep=second.head;
		while(step.next!=null)step=step.next;
		while(secondStep.next!=null) secondStep=secondStep.next;
		while(step!=null){
			if((step.Item_two=='0')&&(secondStep.Item_two=='0')){
				number_q3.put('0',degree);
				degree++;
				step=step.prev;
				secondStep=secondStep.prev;
			}
			else if((step.Item_two=='1')&&(secondStep.Item_two=='0')){
					number_q3.put('1',degree);
					degree++;
					step=step.prev;
					secondStep=secondStep.prev;
				}
				else if((step.Item_two=='0')&&(secondStep.Item_two=='1')){
						number_q3.put('1',degree);
						degree++;
						step=step.prev;
						secondStep=secondStep.prev;
					}	
				    else {
				    	number_q3.put('0',degree);
						degree++;
						step=step.prev;
						secondStep=secondStep.prev;
						while(step!=null){
							if((step.Item_two=='0')&&(secondStep.Item_two=='0')){
								number_q3.put('1',degree);
								degree++;
								step=step.prev;
								secondStep=secondStep.prev;
							}
							else if((step.Item_two=='1')&&(secondStep.Item_two=='0')){
									number_q3.put('0',degree);
									degree++;
									step=step.prev;
									secondStep=secondStep.prev;
								}
								else if((step.Item_two=='0')&&(secondStep.Item_two=='1')){
										number_q3.put('0',degree);
										degree++;
										step=step.prev;
										secondStep=secondStep.prev;
									}	
								    else {
								    	number_q3.put('1',degree);
										degree++;
										step=step.prev;
										secondStep=secondStep.prev;
						}
				    }
				    number_q3.put('1',degree);
				    }
		}
	}
	
	//вывод списка
	public void print() {
		Q_number temp=head;
		temp=head;
		while (temp!=null){
		       System.out.println(temp.Item_two +" "+temp.Item_normal  );
		       temp=temp.next;
		 }
	}		
		
	// определение размера
	public int size(){
		Q_number y;
		y=head;
		int a=0;
		while(y!=null){
				 a++;
				 y=y.next;
		}
			return a;
	}
		
	public static void main(String[] args){
	Q_number number_q1=new Q_number();
	Q_number number_q2=new Q_number();
	Q_number number_q3=new Q_number();
	Scanner in = new Scanner(System.in);
	System.out.println("Enter first number");//Вводим первое число
	int number=in.nextInt();
	//перевод в двоичную систему счисления
	String r="";
	while (number!=0){
		if (number%2 == 0){
			number=number/2;
				r+="0";
		}
		else {
			if(number%2!=0){
				number=number/2;
					r+="1";
			}
		}
	}
	int max=0;
	for(int i=0;i<r.length();i++){
		number_q1.put(r.charAt(i), max);
		max=max+1;
	}
	
	System.out.println("Enter second number");//Вводим второе число
	int number2=in.nextInt();
	//перевод в двоичную систему счисления
	String r2="";
	while (number2!=0){
		if (number2%2 == 0){
			number2=number2/2;
				r2+="0";
		}
		else {
			if(number2%2!=0){
				number2=number2/2;
					r2+="1";
			}
		}
	}
	int max2=0;
	for(int i=0;i<r2.length();i++){
		number_q2.put(r2.charAt(i),max2);
		max2=max2+1;
	}

	number_q1.size(); 
	number_q2.size();  
	if (number_q1.size()>number_q2.size()){
		while(number_q2.size()<number_q1.size()){
			number_q2.put('0',number_q2.size());
		}
	}
	else {
		while(number_q1.size()<number_q2.size()){
			number_q1.put('0',number_q1.size());
			
		}
	}
	number_q1.print();
	System.out.println();
	number_q2.print();
	System.out.println();
	number_q3.sum_q(number_q1,number_q2);
	number_q3.print();
	}
}