//Моя ЧЕТВЕРТАЯ ПОПЫТКА осознать задачу
// Множество представлено деревом, первоначально инициализируется в список, оттуда переписывается в дерево поиска
// в дереве ищется минимальный. Удаление же реализовано как удаления значений, но сохранения ссылок на след. элемент дерева

import java.util.Scanner;
public class Test {
	 public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
		 int count;
		 Set<Integer> array=new Set<Integer>();
		 Tree<Integer> graph=new Tree<Integer>();
		 int key;
		 int val;
		 System.out.println("Enter count of digits in set");
		 count=in.nextInt();
		 for(int i=0;i<count;i++){
			 System.out.println("Enter Key");
			 key=in.nextInt();
			 System.out.println("Enter Value");
			 val=in.nextInt();
			 array.add(key, val);
		 }
		 graph.setToTree(array);
		 System.out.println(graph.getMin());
		 graph.printDFS();
		
		}
}
