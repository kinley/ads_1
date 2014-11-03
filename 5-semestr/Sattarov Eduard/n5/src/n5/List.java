package n5;

public class List
{
	private String data;
	private List next;
	private List skip;//указатель на узел, стоящий за пропусками
	private final int skipsize = 3;//будем пропускать 3 узла
	private List head;
	
	public List()
	{
		this.next = null;
		this.skip = null;
	}
	
	public List(String legislator)//конструктор с инициализацией имени
	{
		this.data = legislator;
		this.next = null;
		this.skip = null;
	}
	
	public void SetSkipLinks(List q)//установка указателей с пропусками
	{
		if(q != null)//если данный указатель смотрит на узел
		{
			List step = q;//создаем новый указатель
			step = step.next;//сразу переходим на следующий
			int i = 1;
			while(step != null)//пока новый указатель смотрит на узел
			{
				if(i % skipsize == 0)//если остаток деления равен 0
				{
					q.skip = step;//мы прошли 3 узла
					              //нужно поставить указатель с пропуском сюда
					q = step;//перемещаем старый указатель на новый
				}
				step = step.next;//следующий
				i++;
			}
		}
	}
	
	public void InsertMember(String legislator)//добавление в список имени
	{
		if(IsMember(legislator) == false)//если такого еще нет
		{
			List newleg = new List(legislator);//создаем узел
			if(head == null)//если список пуст
			{
				head = newleg;//ставим главой новый узел
			}
			else//если список не пуст
			{
				List step = head;//ставим указатель на начало
				while((step.skip != null)&&(IsAMoreThanB(step.skip.data, legislator) == false))
				{                    //если указатель с пропусками смотрит на узел
					step = step.skip;//и узел за пропуском меньше нужного слова
				}                    //переходим по ссылке с пропуском
				List finalskip = step;//ссылки с пропусками закончились или содержат слова бОльшие
				                      //оставляем указатель, что это нужный нам пропуск
				while((step.next != null)&&(IsAMoreThanB(step.next.data, legislator) == false))
				{                    //переходим вправо с шагом 1
					step = step.next;//пока не найдем нужную позицию
				}
				if(IsAMoreThanB(step.data, legislator) == true)
				{                    //если нужно вставить новый узел в начало
					newleg = head;
					head = newleg;   //новый узел теперь начало
					finalskip = head;//отсюда начинать ставить ссылки с пропусками
				}
				else//если нужно вставить узел не в начало
				{
					newleg.next = step.next;//следущее для узла - следующее для указателя
					step.next = newleg;//соединяем прошлую часть с узлом
				}
				SetSkipLinks(finalskip);//переставляем ссылки с пропусками
			}
		}
	}
	
	public boolean IsMember(String legislator)//есть ли имя в списке
	{
		if(head == null)//если список пуст
		{
			return false;
		}
		else//если не пуст
		{
			List step = head;//указатель ставим на начало
			if(step.data.equals(legislator))//если имена одинаковые
			{
				return true;
			}
			while((step.skip != null)&&(IsAMoreThanB(step.skip.data, legislator) == false))
			{                    //если указатель с пропусками смотрит на узел
				step = step.skip;//и узел за пропуском меньше нужного слова
			}                    //переходим по ссылке с пропуском
			for(int i = 0; i < skipsize; i++)//ссылки с пропусками закончились или содержат слова бОльшие
			{                                //3 раза делаем шаг 1
				if(step == null)//если пришли в конец списка
				{
					return false;
				}
				else//если не в конце списка
				{
					if(step.data.equals(legislator))//сверяем слова
					{
						step = step.next;
					}
				}
			}
		}
		return false;
	}
	
	public void DeleteMember(String legislator)//удаление из списка имени
	{
		if(IsMember(legislator) == true)//если имя есть в списке
		{
			List finalskip;
			if(IsAMoreThanB(head.data, legislator) == false)//если нужно удалить из начала
			{
				head = head.next;//переносим начало вперед
				finalskip = head;//ссылки с пропусками переопределять отсюда
			}
			else//если удаляем не из начала
			{
				List step = head;//указатель ставим на начало
				while((step.skip != null)&&(IsAMoreThanB(step.skip.data, legislator) == false))
				{                    //если указатель с пропусками смотрит на узел
					step = step.skip;//и узел за пропуском меньше нужного слова
				}                    //переходим по ссылке с пропуском
				finalskip = step;//ссылки с пропусками закончились или содержат слова бОльшие
				                 //оставляем указатель, что это нужный нам пропуск
				while(step.next.data.equals(legislator) == false)
				{   //пока следующее слово не то, что нам нужно
					step = step.next;//идем с шагом 1
				}
				if(step.next.next == null)//если нужный элемент - последний
				{
					step.next = null;//снимаем ссылку с него
				}
				else//если нужный элемент в середине
				{
					step.next = step.next.next;//снимаем ссылки со следующего
				}
			}
			SetSkipLinks(finalskip);//переставить ссылки с пропусками
		}
	}
	
	public boolean IsAMoreThanB(String a, String b)//является ли строка А "больше" Б
	{
		int vshorter;//какое из слов короче
		if(a.length() < b.length())//сравнивание длин строк
		{
			vshorter = a.length();
		}
		else
		{
			vshorter = b.length();
		}
		int i = 0;
		char ac = 0;
		char bc = 0;
		while((ac == bc)&&(i < vshorter))//пока буквы равны нулю или одно из слов не закончилось
		{
			ac = a.charAt(i);
			bc = b.charAt(i);
			i++;
		}
		if(ac == bc)
		{
			if(a.length() > b.length())//если все буквы равны, но 1 из слов длиннее
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else//если буквы не равны
		{
			if(ac > bc)//смотрим, чья буква "меньше"
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
}
