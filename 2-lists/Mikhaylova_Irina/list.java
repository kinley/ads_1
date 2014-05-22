import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
import java.util.Set;

public class list {		// формула будет представляться списком
	
	private list first;		//голова списка
	private char Item;		//соотв значение и ссылка на след. элемент списка
	private list next;
	
	private Queue<Character> ArifmActions=new LinkedList <Character>();	//очередь, будет содержать в себе знаки арифм. операций. Потом мы просто пройдем по формуле, и расставим их
	
	public boolean checked=true;	//"рубильник", если первый шаг выполнится с ошибкой, сменится на FALSE
	
	public list(){		//конструкторы
		
		this.next=null;
	}
	
	public list(char Item){
		this.Item=Item;
		this.next=null;
	}
	
	public void push(char Item){	//добавление в список	
		list paste=new list(Item);
		list step=first;
		if(first==null){
			first=paste;
		}
		else {
			while(step.next!=null) step=step.next;
			step.next=paste;
			}
		}
	
	public void print_Item(){	//вывод списка
		list step=first;
		while(step!=null){
			System.out.print(step.Item);
			step=step.next;
		}
	}
	
	public void first_step(){	//первый шаг, считываем строку, арифм. знаки кидаем в очередь, проставляем скобки
		Scanner in=new Scanner(System.in);
		list item=this;
		Set logic=new HashSet();		//для сравнения, входил ли элемент во множество знаков арифм. операций		
		logic.add('+');
		logic.add('-');
		logic.add('/');
		logic.add('*');
		System.out.println("Enter formula");
		String stroka=in.nextLine();
		for(int i=0;i<stroka.length();i++)	//если символ входит во множество, то обделяем ее скбоками(скобочная запись)
			if(stroka.charAt(i)>='a'&& stroka.charAt(i)<='z'){
					item.push('(');
					item.push(stroka.charAt(i));
					item.push(')');
			}
			else if(logic.contains(stroka.charAt(i))){		//если это арифм. операция, то добавляем в очередь
							ArifmActions.add(stroka.charAt(i));
					}
			else{
				System.out.println("Wrong symbol detected!");	//вообще левый символ ввели, выводим ошибку и переводим на false
				checked=false;
				return;
			}
	}
	
	public void second_step(){	//второй шаг, проставляем из очереди знаки арифм. операций
			list letter=first.next;
			list prevLet=first;
			while(letter!=null){
				if(letter.Item =='('){		//если это открывающая скобка, то перед ней нужно вставить в список знак арифм. операций
						list paste=new list();
						paste.next=letter;
						paste.Item= (char) ArifmActions.poll();
						prevLet.next=paste;
						prevLet=letter;
						letter=letter.next;
				}
				else{					//идем дальше
					prevLet=letter;
					letter=letter.next;
			}
		}
	}
}
