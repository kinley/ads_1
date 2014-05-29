package sem;

public class Graph {
	private final int max_verts = 20;
	private Vertex vertexList[];//список вершин
	private int adjMat[][];		//матрица смежности
	private int nVerts;			//текущее количество вершин
	private StackX theStack;
	
	public Graph()//конструктор
	{
		vertexList = new Vertex[max_verts];//матрица смежности
		adjMat = new int[max_verts][max_verts];
		nVerts = 0;
		for (int j = 0; j < max_verts; j++)		//матрица сежности
			for (int k = 0; k < max_verts; k++)	//заполнятеся нулями
				adjMat[j][k] = 0;
		theStack = new StackX();
	}
	public void addVertex(char lab)//добавление вершины
	{
		vertexList[nVerts++] = new Vertex(lab);
	}
	public void addEdge(int start, int end)//добавление ребра
	{
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}
	public void displayVertex(int v)
	{
		System.out.print(vertexList[v].label);
	}
	public void mst()//построение минимального остовного дерева
	{
		vertexList[0].wasVisited = true;	//пометка
		theStack.push(0);					//занесение в стек
		while(!theStack.isEmpty())			//пока стек не опустеет
		{									//извлечение элемента из стека
			int currentVertex = theStack.peek();
											//получение следующего соседа
			int v = getAdjUnvisitedVertex(currentVertex);
			if (v == -1)					//если соседей больше нет
				theStack.pop();				//извлечь элемент из стека
			else							//сосед существует
			{
				vertexList[v].wasVisited = true;	//пометка
				theStack.push(v);					//занесение в стек
				displayVertex(currentVertex);		//вывод ребра от currentVertex к v
				displayVertex(v);					
				System.out.print(" ");
			}
		}
		for (int j = 0; j < nVerts; j++)			//сброс флагов
			vertexList[j].wasVisited = false;
	}
	public int getAdjUnvisitedVertex(int v)	//метож возвращает непосещенную вершину, смежную по отношению к v
	{
		for (int j = 0; j < nVerts; j++)
			if(adjMat[v][j] == 1 && vertexList[j].wasVisited == false)
				return j;
		return -1;
	}
}
