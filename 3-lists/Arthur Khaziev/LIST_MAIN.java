import java.util.Scanner;
public class LIST_MAIN {
	public static void main(String[] args) {
		LIST<Integer> node= new LIST();
		node.putHead(13);	//вставка в голову числа(работаем с int)
		node.putEnd(133);	//вставка в конец
		node.putHead(25);	//переписали голову(повторно добавили)
		node.putEnd(50);	
		node.printNode();	//вывод
		System.out.println();
		node.deleteFirst();	//удаляем первый элемент(голова переписывается)
		node.deleteLast();	//удаляем последний элемент
		node.printNode();
		System.out.println();
		node.deleteToIndex(1);	//проверка удаления по индексу
		node.printNode();
		System.out.println();
		System.out.println(node.printToIndex(1));	//вывод по индексу
		node.pasteToIndex(334, 1);	//вставка элемента по индексу
		node.printNode();
		System.out.println();
		System.out.println(node.Size());	//количество элементов
	}
}
