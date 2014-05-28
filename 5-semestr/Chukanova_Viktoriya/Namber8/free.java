package semestr2;

import javax.xml.soap.Node;
public class free {
	private static final Node Node = null;
		int d;
		private Node left;
		private Node right;
		
	
		// --------------------------
		
		public int main(){
		int b[] = {};
	    int n = 0;
			  System.out.print("Введите количество вершин -...\n"); 
			  System.out.print("Вводите ключи...\n");
		Node root = first(b[0]);
		for (int i = 1; i<n; i++)searchJnsert(root, b[i]);
		print_tree(root, false, 0);
		return 0;
		}
		
		//--------------------------------------
		
		// Формирование первого элемента дерева
		public Node first(int d)
		{
		Node pv =  Node;
		pv.ATTRIBUTE_NODE =(short)d;
		pv.left = 0;
		pv.right = 0;
		return pv;
		}

		//-----------------------------------
		
		// Поиск с включением
		//Packade:jvax.xml.soap;
		public  Node searchJnsert(Node root, int d)
		{
			//jvax.xml.soap.Node pv = root;
		Node pv = root, prev;
		boolean found = false;
		while (pv found)
		{
		prev = pv;
		if (d == pv.ATTRIBUTE_NODE) found = true;
		else if (d < pv.ATTRIBUTE_NODE) pv = pv.left;
		else pv.right;
		}
		if (found) return pv;
		
		// Создание нового узла;
		
		Node pnew = new Node;
		pnew.ATTRIBUTE_NODE = (short)d;
		pnew.left = 0;
		pnew.right = 0;
		if (d < prev.ATTRIBUTE_NODE)
		// Присоединение к левому поддереву предка;
		prev.left = pnew;
		else
		// Присоединение к правому поддереву предка;
		prev.right = pnew;
		return pnew;
		}
		// ---------------------------
		// Обход дерева
		void print_tree(javax.xml.soap.Node root, boolean p, int level)
		{
		if (p){
		print_tree(root.left, level + 1); // вывод левого поддерева
		for (int i = 0; i < level; i++);
		System.out.print(" ");
		System.out.print(root.ATTRIBUTE_NODE);
		char [] endl;
		System.out.print(endl); // вывод корня поддерева
		print_tree(root.right, level +1); // вывод правого поддерева
		}
		}
}
