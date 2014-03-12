package project1;

public class matrix {
	private int [] [] matrix1;
	
	public matrix() { // нулеваЯ матрица
		matrix1 = new int [2] [2];
	}
	
	
	public matrix(int[][] matrix1) { // заданнаЯ матрица
		this.matrix1 = new int[2][2];
		for (int i=0;i<2;i++) 
			for (int j=0;j<2;j++) {
				this.matrix1[i][j] = matrix1[i][j];
			}
	}
	
	private matrix(matrix X) {
		this(X.matrix1); 
	}
	
	public static matrix Random() { // рандомнаЯ матрица
		matrix X = new matrix();
		for (int i=0;i<2;i++) 
			for (int j=0;j<2;j++) {
				X.matrix1[i][j]=(int)(Math.random()*10);
			}
		return X;
	}
	
	public matrix Plus(matrix Y) { // сложение матриц
		matrix X = this;
		matrix Z = new matrix();
		for (int i=0;i<2;i++) 
			for (int j=0;j<2;j++) {
				Z.matrix1[i][j] = X.matrix1[i][j]+Y.matrix1[i][j];
			}
		return Z;
	}
	
	public matrix Minus(matrix Y) { // вычитание матриц
		matrix X = this;
		matrix Z = new matrix();
		for (int i=0;i<2;i++) 
			for (int j=0;j<2;j++) {
				Z.matrix1[i][j] = X.matrix1[i][j]-Y.matrix1[i][j];
			}
		return Z; 
	}
	
	public void MatrixDeterminan() { // определитель
		matrix X = this;
		int result = X.matrix1[0][0]*X.matrix1[1][1] - X.matrix1[0][1]*X.matrix1[1][0];	
		System.out.println(result);
	}
	
	public void ShowMatrix() { // вывод матрицы
       for (int i = 0; i < 2; i++) {
    	   for (int j = 0; j < 2; j++) 
                System.out.printf("%3d",matrix1[i][j]," ");
    	   System.out.println();
        }
	}
	
	public matrix Multiplication(matrix Y) { // умножение матриц
		matrix X = this;
		matrix Z = new matrix();
		for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    Z.matrix1[i][j] += (X.matrix1[i][k] * Y.matrix1[k][j]);
        return Z;
    	
    }
	
	public matrix Multiplication(int n) { // умножение на число
		matrix X = this;
		for (int i=0;i<2;i++) 
			for (int j=0;j<2;j++) {
				X.matrix1[i][j]*=n;
			}
		return X;
	}
	
	public static void main(String[] args) { // тест
		int [][] a = { {1,2}, {3,4} };
		matrix A = new matrix(a);
		A.ShowMatrix();
		System.out.println();
		
		matrix B = matrix.Random();
		B.ShowMatrix();
		System.out.println();
		
		A.MatrixDeterminan();
		System.out.println();
		
		A.Plus(B).ShowMatrix();
		System.out.println();
		
		A.Minus(B).ShowMatrix();
		System.out.println();
		
		A.Multiplication(B).ShowMatrix();
		System.out.println();
		
		A.Multiplication(3).ShowMatrix();
		System.out.println();
	}
	
}