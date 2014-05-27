// Класс, реализующий дерево. 
public class Tree <Key extends Comparable<Key>, Value> {
	private Node root; // корень дерева
	
	private class Node {
		private Node left, right; // ссылки на поддеревья
		private Key key ;         // ключ
		private Value val;        // связанные значения
		private int N; 			  // количество узлов в поддержке с этим корнем
		
		public Node(Key key, Value val, int N) {
	    	this.key = key;
	    	this.val = val;
	    	this.N = N;
			}
		}
	
	public int size() {
		return size(root);
	}
	
	private int size(Node x) {
		if (x==null) return 0;
		else return x.N;
	}
	
	public Value get(Key key){
		return get(root, key);
	}
	
	private Value get(Node x, Key key) {
		// возвращает значение, связанное с ключом в поддереве с корнем х
		// возвращает null, если ключ в поддереве с корнем х отсутствует
		if (x==null) return null;
		int cmp = key.compareTo(x.key);
		if (cmp<0) return get(x.left, key);
		else if (cmp>0) return get(x.right, key);
		else return x.val;
	}
	
	
	public void put (Key key, Value val){
		root = put(root, key, val); //поиск ключа. Если найден, изменяет значение. Если нет - увеличивается дерево.
	}
	
	private Node put(Node x, Key key, Value val) {
		//если ключ key присутствует в поддереве с корнем х,
		// его значение заменяется на val.
		//иначе в поддерево добавляется новый узел с ключем key и значением val.
		if (x==null) return new Node (key, val,1);
		int cmp = key.compareTo(x.key);
		if (cmp<0) x.left = put(x.left, key, val);
		else if (cmp>0) x.right = put(x.right, key, val);
		else x.val=val;
		x.N = size(x.left) + size(x.right) +1;
		return x;
		}
	
	}

	
	