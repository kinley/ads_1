import java.util.Scanner;
public class LIST_MAIN {
	public static void main(String[] args) {
		LIST<Integer> node= new LIST();
		node.putHead(13);
		node.putEnd(133);
		node.putHead(25);
		node.putEnd(50);
		node.printNode();
		System.out.println();
		node.deleteFirst();
		node.deleteLast();
		node.printNode();
		System.out.println();
		node.deleteToIndex(1);
		node.printNode();
		System.out.println();
		System.out.println(node.printToIndex(1));
		node.pasteToIndex(334, 1);
		node.printNode();
		System.out.println();
		System.out.println(node.Size());
	}
}
