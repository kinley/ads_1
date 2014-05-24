
import java.util.Iterator;
import java.util.Stack;
import java.io.IOException;

public class DoubleComponent {
	
    int[] Num; 			  // Порядок вершин по поиску в глубину.
    int[] low; 			  // Минимальная смежная вершина.
    
    int Counter; 		  // Счетчик вершин на поиске. 
    
    Stack<Edge> stack;    // Стэк, который хранит ребра   
    
    Graph G;	
    
    int VertexNumber; 	  // Количество вершин.
    int k; 				  // Количество двусвязных компонент.
    TextParser textParser; 
    
    
    public DoubleComponent(Graph G,TextParser textParser) {
        this.G = G;
        stack = new Stack();
        VertexNumber = G.GetVertex() + 1;	//+1 дабы не считать с 0. Паскалевские привычки
        Num = new int[VertexNumber];
        low = new int[VertexNumber];
        Counter = 0;
        this.textParser = textParser;
    }
    
    
    
    public class Edge { 			// Подкласс ребро.
    	private int v;	
    	private int w;	
    	
    	public  Edge(int v,int w) { // Конструктор.
    		this.v=v;
    		this.w=w;
    	}
    	
    	public Edge() { 			// Пустой конструктор.
    		
    	}
    	
    	public  void print(TextParser textParser) throws IOException {  	// Распечатка ребер
    		Edge e= this;
    		textParser.print(e.v+"-"+e.w);
    	}
    }
    	
    

   public void FindComponent() throws IOException { 	// Нахождение компонент.
	   
	   	if (G.GetEdge() == 0){		// Если количество ребер = 0
	   		textParser.println();
	   		textParser.print("Двусвязные компоненты отсутствуют.");
	   		return;
	   		}
	   			
	   
	    for(int i=1;i<VertexNumber;i++) {	// Перебор всех вершин
	    	if (Num[i]==0) 					// Если Веришна не была посещена
	    	Counter = 0;		 			// Сбрасываем счетчик
	    	Dfs(i,0);	 					// Поиск в глубину
	    	 }	
   }


    public void Dfs(int v, int p) throws IOException { 

        Counter++;	
        Num[v]=Counter; // Нумеруем вершину
        low[v] = Num[v];	// Минимальной смежной вершиной на данный момент считам саму вершину
        int w;
        for (Iterator<Integer> j = G.GetNeighbour(v).iterator(); j.hasNext(); )	// Идем по всем смежным вершинам
        {
            w = j.next();
 
            if (Num[w]==0)  {	// Если не была посещена.
            		Edge a = new Edge(v,w);
                    stack.push(a);						// Кладем ребро в стэк
                    Dfs(w,v);							// Вызываем метод "Поиска в глубину" рекурсивно для сына вершины
                    low[v]=Math.min(low[v], low[w]);	// Пересчитываем минимум Вершины v.
            
                    if (low[w]>=Num[v])	// если выполняется, то найдена компонента
                    {
                    	k++;			// Увеличиваем счетчик компонент
                    	textParser.print("Компонента "+k+": ");	
                    	Edge i = new Edge();
                    
                    	do {	// Пока не дойдем до ребра v-w, выталкиваем все ребра из стэка.
                    		i = stack.pop();
                    		i.print(textParser);
                	}	while(i!=a);
                    	
                    	textParser.println();	
                    }
            }
            
            else if ((w!=p) && (Num[w]<Num[v])) { // Если вершина не родитель v и имеет меньший номер	(Хорда с предком).
            	Edge a = new Edge(v,w);	// Добавляем ребро в стэк
                stack.push(a);
                low[v]=Math.min(Num[w],low[v]);	// Пересчитываем минимум.
            }
        }
    }

}
