import java.util.*;

//вывод двухмерного булевского массива в виде знаков '*' на true и ' ' на false
public class Task1 {

	public static void main(String[] args) {
		final int a = 20;
		final int b = 20;
		boolean[][] mass = new boolean[a][b];
		Random rmd = new Random();
		for (int i = 0; i < a; i++) {
			System.out.println();
			for (int j = 0; j < b; j++) {
				mass[i][j] = rmd.nextBoolean();
				if (mass[i][j])
					System.out.print("*");
				else
					System.out.print(" ");
			}
		}
	}

}
