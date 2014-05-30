package class11;

public class main {
	private static final double PI = Math.PI;//константа для задания угла

	public static void main(String[] args)
	{
		PolarTriangle A = new PolarTriangle(4, PI/3, 2, (2*PI)/3, 3, PI/4);
		A.Show();
		A.Length();
		A.Angle();
		A.Square();
		A.Turn(A, (2*PI/3));
		A.Shift(A, 4);
		
	}

}
