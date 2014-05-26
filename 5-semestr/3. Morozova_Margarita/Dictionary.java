public class Dictionary {
	// Класс, отделяющий основную программу от реализации хранилища данных.
	// По заданию должен содержать методы "добавить-удалить-проверка на принадлежность",
	//	по необходимости дополнен возможностями перебирать слова (и проверять, все ли слова
	//	перебраны), выводить их, проверять хранилище на пустоту. 

	TrieP trie;
	
	public void Dictionary() 
	{
		TrieP trie = new TrieP(' ');
	}
	
	public void add(String s) {
		trie.addString(s);
	}
	
	public void remove(String s) {
		trie.remove(s);
	}
	
	public boolean inDictionary(String s) {
		return trie.isWord(s);
	}


	public void print()
	{
		trie.print();
	}
	public String getFirstWord()
	// Получение первого слова
	{
		return trie.getFirstWord();
	}
	
	public String getNextWord(String s)
	// Получение слова, следующего за переданным
	{
		return trie.getNextWord(s);
	}
	public boolean isEmpty()
	{
		return trie.isEmpty();
	}
	public boolean isChecked()
	// Проверка: все ли элементы словаря были перебраны?
	{
		return trie.isChecked();
	}
}
