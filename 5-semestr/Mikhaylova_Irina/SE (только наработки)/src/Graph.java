
public class Graph {
	private final int V; //количество вершин
	private int E; //количество ребер
	private Bag<Integer>[] adj; //списки смежных вершин
	
	public Graph(int V) {
		this.V = V;
		this.E = 0;
		adj = (Bag<Integer>[]) new Bag[V]; //создание массива списков
		for (int v = 0; v < V; v++)        //вначале все списки
			adj[v] = new Bag<Integer>();   // создаются пустыми
		}
	
	public Graph (In in) {
		this(in.readInt()); //чтение V и создание графа .
		int E = in.readInt();
		for (int i = 0; i < E; i++) { // добавление ребра
			int v = in.readInt(); //чтение вершины
			int w = in.readInt(); //чтение другой вершины,
			addEdge(v,w); //и добавление соединяющих их ребера. 
		}
	}
	public int V() { 
		return V; 
	}
	
	public int E() {
		return E; 
	}
	
	public void addEdge(int v, int w) {
		adj[v].add(w);
		adj[w].add(v);
		E++;
	}
	
	public Iterable<Integer> adg(int v){
		return adj[v];
	}
	
	}
