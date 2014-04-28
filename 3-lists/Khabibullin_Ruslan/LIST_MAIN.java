import java.util.Scanner;
public class LIST_MAIN {
	public static void main(String[] args) {
		LIST<Integer> node= new LIST();
		node.putHead(13);		//тут просто демонстрация методов клаасса на придуманных мною числах...ничего более)
		node.putEnd(133);	//вставка в конец
		node.putHead(25);		//в начало соотв.
		node.putEnd(50);
		node.printNode();	//вывод
		System.out.println();		//это...перевод на след. строку. Просто..и по еврейски
		node.deleteFirst();	//удаление первого элемента списка
		node.deleteLast();		//последнего
		node.printNode();	//вывод нашего инвалида
		System.out.println();		//еще один мой перевод на след. строку
		node.deleteToIndex(1);		//удаление элемента по его индексу
		node.printNode();		//вывод результата
		System.out.println();
		System.out.println(node.printToIndex(1));		//вывод по индексу
		node.pasteToIndex(334, 1);	//вставка элемента 334(цыфра) на первое место
		node.printNode();
		System.out.println();
		System.out.println(node.Size());	//вывод размера нашего листа
	}
}
