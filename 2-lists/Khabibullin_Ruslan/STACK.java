public class STACK 
{
	private Symbol first;
	private class Symbol{
		char Item;
		Symbol next;
	}
	
	public void push(char Item){		//пушим в наш стэк( пушим в конец, так удобнее проверять:))
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
	
	public void changing(){	//поверяем на вхождения строки 03I203I, если она есть( и есть именно 03I203I), то выводим 3.Иначе кроме тройки, будут элементы, неудовлетворяющие этой подтсроке
		Symbol step=first;	// этой переменной мы будем "идти" по стэку (или листу, судя по моим методам уже)
		Symbol prev=first;	//а эта будет содержать в себе тройку
		int index=0;	//в переменной polynome содерж. "идеальное" выражение. эта переменная для выстреливания чаров по индексу из строки и сравнения этих значений с элементами листа
		String checker="";	//сюда записывается строка, считываемая из листа
		String polynome="03I203I";	// к чему должна стремиться любая строка :)
		while(step!=null){
			if(step.Item==polynome.charAt(index)){		//если элемент листа == элементу идеального выражения 				
								checker=checker+step.Item;	//прибавляем к нашей "сравнялке"
								if(checker.equals(polynome)){	//если наша "сравнялка" равна идеальному
											prev.Item='3';	//наша троечка!
											prev.next=step.next;	//тут мы идем сразу на след.(если правильно, то в конец уже по факту)
											checker="";	//обнулили сравнялку для новых достижений
											index=0; //и индекс тоже. вдруг еще встретится "идеальное" выражение
											}
								index++;	//если они пока не равны, то идем к концу выражения, прибавив 1 к индексу
				}
			else{ 
				index=0;	//встретили вообще что то левое...индекс обнуляем
				checker="";	//строку соотв. тоже
			}
			step=step.next; //идем дальше по листу
		}
	}
	
	public boolean check(){	//проверка, явл. ли преобразованный лист правильным
		if(first.next==null && first.Item=='3'){
			return true;
		}
		else return false;
	}
	
	public void print_Item(){	//вывод(обычный, без отстреливания из стека)
		Symbol step=first;
		while(step!=null){
			System.out.print(step.Item);
			step=step.next;
		}
	}
	
	public char pop(){		//просто отстреливаем наш стэк
		char Item=first.Item;
		first=first.next;
		return Item;
	}
}

