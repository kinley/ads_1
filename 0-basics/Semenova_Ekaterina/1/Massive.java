package Семенова_Екатерина;
//1_zadanie
public class Massive {
 
	public static void main(String[] args) {
		int m = 9;
		int s = 9;
		for(int i = 0; i < m; i++) {
			System.out.print(i + " ");
			}
			System.out.println();
 
		int[][] mass = new int[m][s];
		for (int i = 1; i < m; i++) {
			System.out.print(i + " ");
			for (int j = 1; j < s; j++) {
				{
				mass[i][j] = (int) (Math.random()*2);
			if ((mass[i][j]==0)){
				System.out.print("* ");
				}
			else
			System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}