
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Graph<Item> {
	    private final int Vertex; 
	    private int Edge; 

	    private List<Integer>[] Graph;
	    
	    

	    public Graph(int Vertex)      // Конструктор.
	    {
	        this.Vertex = Vertex;
	        Graph = new ArrayList[Vertex + 1];  

	        for (int i = 1; i <= Vertex; i++)  {      
	            Graph[i] = new ArrayList<Integer>();
	        }
	    }	
	    
	    
	    public int GetVertex() {	
	        return Vertex;
	    }
	    
	    public int GetEdge() {
	    	return Edge;
	    }
	   
	    
	    public List GetNeighbour(int v) {	// Список соседей указанной вершины
	        return Graph[v];
	    }

	    
	    public void addEdge(int v, int w) {	// Добавление ребра
	    	Graph[v].add(w);
	    	Graph[w].add(v);
	    }
	    
	    
	    public Graph(TextParser text) throws IOException {	// Читаем граф с файла. Ниже пример представления графа в файле. 
	        this(text.readInt());        
	        Edge = text.readInt();
	        
	        for (int i = 0; i < Edge; i++) {
	           int v = text.readInt();
	           int w = text.readInt();
	           addEdge(v, w);
	        }
	    }


	    public void PrintGraph(TextParser p) throws IOException {	// Распечатываем граф.
	    	if(Vertex==0) p.print("У графа отсутствуют вершины.");	// Если нет вершин.
	    	
	        for (int i = 1; i <= Vertex; i++){	
	            p.print(i+": ");
	                for(Iterator<Integer> j = Graph[i].iterator(); j.hasNext();) 
	                    p.print(j.next());
	            p.println();
	        }
	    }
	    	
}
/*  Граф во входном файле представлен следующим образом:
 * 	V - количество вершины
 * 	E - количество ребер
 * 	Далее идут E ребер:
 * 	v-w ребро, где v - начальная вершина ребра, w - конечная.
 * 
 * 	Пример входных данных:
 * 	3
 * 	3
 * 	1 2
 * 	1 3
 * 	2 3
 * 
 *  На выходе мы получим:
 *  V номеров вершин с указанием смежных с ними вершин.
 *  Двусвязные компоненты графа.
 *  
 *  Пример выходных данных:
 *  1: 2 3
 *  2: 1 3
 *  3: 1 2
 *  Компонента 1: 2-3 1-3 1-2
 * */

