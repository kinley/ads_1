package sem;

public class Vertex {
	public char label;//метка (например, 'A')
	public boolean wasVisited;
	
	public Vertex(char lab)//конструктор
	{
		label = lab;
		wasVisited = false;
	}

}
