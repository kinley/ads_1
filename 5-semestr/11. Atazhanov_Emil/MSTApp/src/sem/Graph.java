package sem;

public class Graph {
	private final int max_verts = 20;
	private Vertex vertexList[];//������ ������
	private int adjMat[][];		//������� ���������
	private int nVerts;			//������� ���������� ������
	private StackX theStack;
	
	public Graph()//�����������
	{
		vertexList = new Vertex[max_verts];//������� ���������
		adjMat = new int[max_verts][max_verts];
		nVerts = 0;
		for (int j = 0; j < max_verts; j++)		//������� ��������
			for (int k = 0; k < max_verts; k++)	//����������� ������
				adjMat[j][k] = 0;
		theStack = new StackX();
	}
	public void addVertex(char lab)//���������� �������
	{
		vertexList[nVerts++] = new Vertex(lab);
	}
	public void addEdge(int start, int end)//���������� �����
	{
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}
	public void displayVertex(int v)
	{
		System.out.print(vertexList[v].label);
	}
	public void mst()//���������� ������������ ��������� ������
	{
		vertexList[0].wasVisited = true;	//�������
		theStack.push(0);					//��������� � ����
		while(!theStack.isEmpty())			//���� ���� �� ��������
		{									//���������� �������� �� �����
			int currentVertex = theStack.peek();
											//��������� ���������� ������
			int v = getAdjUnvisitedVertex(currentVertex);
			if (v == -1)					//���� ������� ������ ���
				theStack.pop();				//������� ������� �� �����
			else							//����� ����������
			{
				vertexList[v].wasVisited = true;	//�������
				theStack.push(v);					//��������� � ����
				displayVertex(currentVertex);		//����� ����� �� currentVertex � v
				displayVertex(v);					
				System.out.print(" ");
			}
		}
		for (int j = 0; j < nVerts; j++)			//����� ������
			vertexList[j].wasVisited = false;
	}
	public int getAdjUnvisitedVertex(int v)	//����� ���������� ������������ �������, ������� �� ��������� � v
	{
		for (int j = 0; j < nVerts; j++)
			if(adjMat[v][j] == 1 && vertexList[j].wasVisited == false)
				return j;
		return -1;
	}
}
