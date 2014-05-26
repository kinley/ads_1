package files;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
import java.util.Set;

public class list {		// формула представляется списком
	
	private list first;			//голова списка
	private char Item;			//соотв. значение и ссылка на след. элемент списка
	private list next;
	//очередь, будет содержать в себе знаки арифм. операций, потом мы пройдем по формуле и расставим их
	private Queue<Character> ArifmActions=new LinkedList <Character>();	
	//переключатель, если первый шаг выполнится с ошибкой, сменится на FALSE
	public boolean checked=true;	
	//конструкторы
	public list()
	{		
		this.next=null;
	}
	public list(char Item)
	{
		this.Item=Item;
		this.next=null;
	}
	//добавление в список
	public void push(char Item)
		{	
		list paste=new list(Item);
		list step=first;
		if(first==null)
		{
			first=paste;
		}
		else
			{
			while(step.next!=null) step=step.next;
			step.next=paste;
			}
		}
	//вывод списка
	public void print_Item()
	{	
		list step=first;
		while(step!=null)
		{
			System.out.print(step.Item);
			step=step.next;
		}
	}
	//первый шаг, считываем строку, арифм. знаки кидаем в очередь, проставляем скобки
	public void first_step()
	{	
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
			if(stroka.charAt(i)>='a'&& stroka.charAt(i)<='z')
			{
					item.push('(');
					item.push(stroka.charAt(i));
					item.push(')');
			}
				//если это арифм. операция, то добавляем в очередь
			else if(logic.contains(stroka.charAt(i)))
					{		
							ArifmActions.add(stroka.charAt(i));
					}
			else
				// ввели другой символ, выводим ошибку и переводим на false
			{
				System.out.println("Wrong symbol detected!");	
				checked=false;
				return;
			}
	}
	//второй шаг, проставляем из очереди знаки арифм. операций
	public void second_step()
	{	
			list letter=first.next;
			list prevLet=first;
			while(letter!=null)
			{
				//если это открывающая скобка, то перед ней нужно вставить в список знак арифм. операций
				if(letter.Item =='(')
				{		
						list paste=new list();
						paste.next=letter;
						paste.Item= (char) ArifmActions.poll();
						prevLet.next=paste;
						prevLet=letter;
						letter=letter.next;
				}
				//идем дальше
				else
				{		
					prevLet=letter;
					letter=letter.next;
				}
			}
	}

	public static void main(String[] args)
	{
		list item=new list();	//переменная класса
		item.first_step();		//считали строку, и проставили скобочки
		//если в строке не обнаружено элементов, не входящих во множества, то идем дальше
		if(item.checked==true)
		{		
						item.second_step();	//если первый шаг прошел успешно, переходим ко второму, и проставляем знаки арифм. операций
						item.print_Item();	//выводи преобразованную формулу
		}
	}
}
		
