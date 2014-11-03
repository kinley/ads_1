package n3;

import java.util.Scanner;

public class List
{
	private String data;
	private List next;
	private List prev;
	private List head;
	
	public List()//конструктор
	{
		this.next=null;
		this.prev=null;
	}
	public List(String wordtolist)//конструктор с инициализацией слова
	{
		this.data = wordtolist;
		this.next = null;
		this.prev = null;
	}
	public void AddNode(String wordtolist)//добавление узла в конец
	{
		List newWord = new List(wordtolist);
		if(head == null)
		{
			head = newWord;
		}
		else
		{
			List step = head;
			while(step.next != null)
			{
				step = step.next;
			}
			step.next = newWord;
			step.next.prev = step;
		}
	}
	public void DelNode(List q) //удаление указанного узла
	{
		if((q.next == null)&&(q.prev != null))
		{
			q = q.prev;
			q.next = null;
		}
		if((q.next != null)&&(q.prev == null))
		{
			q = q.next;
			q.prev = null;
			head = q;
		}
		if((q.next != null)&&(q.prev != null))
		{
			q.prev.next = q.next;
			q.next.prev = q.prev;
			q = q.prev;
		}
	}
	public void PrintList()//вывод списка
	{
		List pr = head;
		while (pr != null)
		{
			System.out.print(pr.data+" ");
			pr = pr.next;
		}
	}
	public void InputText()//ввод символов, составление слов
	{
		System.out.println("Введите символы, конец ввода '.': ");
		Scanner sc = new Scanner(System.in);
		char input = 0;
		String wordtolist = "";
		while(input != '.')
		{
			input = sc.next().charAt(0);
			if(Character.isLetter(input) == true)
			{
				wordtolist += input;
			}
			else
			{
				if(wordtolist != "")
				{
					this.AddNode(wordtolist);
				}
				wordtolist = "";
			}
		}
	}
	public void DelReverses()//нахождение указателей на обратные слова
	{                        //удаление обратных слов
		List i = head;
		List j = head;
		while (i != null)
		{
			String reverse = new StringBuffer(i.data).reverse().toString();
			while (j != null)
			{
				if (reverse.equals(j.data) == true)
				{
					DelNode(i);
					DelNode(j);
				}
				j = j.next;
			}
			i = i.next;
		}
	}
}
