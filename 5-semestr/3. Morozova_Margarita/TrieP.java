import java.lang.String;
import java.util.List;
import java.util.ArrayList;

public class TrieP
// Класс, реализующий нагруженное дерево.
{
	private int N = 0; // Количество слов, помещенных в дерево
	private static int CheckN = 0; // Переменная для проверки, 
									// все ли слова дерева были пройдены при обходе.
									// Проверка пока одноразовая.


	private char mark; // Метка - буква, соответствующая каждому узлу дерева
	private List<TrieP> myLinks; // Каждой метке соответствует список следующих за ней меток
	private boolean myIsWord; // Последняя буква каждого слова помечается флажком,
		// сообщающим, что пройденный путь действительно является словом.

	public char getMark() {return mark;} // Получение коренной метки дерева/поддерева

	public boolean nextsListContainsMark(char m) { // Проверка: есть ли среди следующих меток конкретная?
		
		for (int i = 1; i<=myLinks.size(); i++) //мб здесь надо поменять индексы
		{
			TrieP tt = myLinks.get(i);
			if (tt.getMark() == m) return true;
			
		}
		
		return false;
		
	}


  // Создание нового префиксного поддерева от символа    
	public TrieP(char m)
	{
		char mark = m; // Задаем поддереву корневую метку
		myLinks = new ArrayList<TrieP>(); // Bыделяем просранство для списка последователей
		myIsWord = false;	// Помечаем, что словом не является
	
	}

  // Добавление слова
	public void addString(String s)
	{
		System.out.println("hhh");
		TrieP t = this;
		int length = s.length();
		for(int i=0; i < length; i++)
		{
			char ourChar = s.charAt(i); // В цикле создаем нужные метки и спускаемся вниз
			if (!t.nextsListContainsMark(ourChar))
			{
				TrieP tt = new TrieP(ourChar);
				t.myLinks.add(tt);
			} 
			t = myLinks.get(ourChar); // Спускаемся на уровень ниже на нужную метку
		}
	t.myIsWord = true; // Последнюю метку слова меняем: теперь нам известно, что путь к ней - слово
	N++; // Сообщаем, что слов стало больше
	}

 //Проверка, содержится ли слово в дереве
	public boolean isWord(String s)
	{
		TrieP t = this;
		int length = s.length();
		for(int i=0; i < length; i++) // Аналогично спускаемся для проверки, есть ли слово
										// в дереве
		{
			char ourChar = s.charAt(i);
			if (!t.nextsListContainsMark(ourChar))
			{
				return false;
			}
			else t = myLinks.get(ourChar); // Спускаемся на уровень ниже на нужную метку
		}
		
		return (t.myIsWord); // s - слово <=> до него можно дойти и оно помечено как слово
	}

	public void remove(String s)
	// Удаление слова. Слово просто помечается как несуществующее
	{
		TrieP t = this;
		if (t.isWord(s)) // Если слово было словом
		{
			int length = s.length();
			for(int i=0; i < length; i++) // Спускаемся до его последней буквы 
			{
				char ourChar = s.charAt(i);
				if (t.nextsListContainsMark(ourChar))
				{
				t = myLinks.get(ourChar); // Спускаемся на уровень ниже на нужную метку
				}
			}
			t.myIsWord = false; // Последнюю метку слова меняем: 
								// теперь нам известно, что путь к ней - не слово
			N--;
		}
	}
	
	public void print()
	// Вывод всех слов дерева
	{
		if (!this.isEmpty())
		{
			String s = this.getFirstWord();
			System.out.println(s);
			for (int i = 1; i<N; i++)
			{
				s = this.getNextWord(s);
				System.out.println(s);
			}
		}
		else System.out.println("Слов нет");
	}
	public String getFirstWord()
	// Функция для вызова первого слова из дерева
	{
		String word = new String();

		TrieP t = this; // как бы так передать его по ссылке?

		for (char i = 'a'; i<='z'; i++)
		{
			if (t.nextsListContainsMark(i))
			{
				word+=i;
				if (this.isWord(word))
				{
					CheckN=1;
					return word; 
				}
				else
				{
					if (!t.myLinks.isEmpty()) t = t.myLinks.get(i);
					else
					{
						t = this;
						for (int j =0; j<(word.length()-1); j++)
						{
							t = t.myLinks.get(word.charAt(j));
						}
					}
				}
			
			}
		}
			
		
		
		CheckN=1;
		return word;
	}

	public String getNextWord(String s)
	// Функция для вызова слова, следующего за принятым в аргументе
	{
		String word = new String();

		CheckN++;		
		return word;
	}
	public boolean isEmpty() 
	// Обычная проверка дерева на пустоту
	{
		return (N==0);
	}
	public boolean isChecked() 
	// Проверка, все ли ветки пройдены при обходе
	{
		return (CheckN==N);
	}
}
