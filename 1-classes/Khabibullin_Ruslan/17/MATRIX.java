//Отдельный класс MATRIX с методами
public class MATRIX {
	public int[][] matrica=new int[2][2];
	public MATRIX(){
		matrica=new int[2][2];
	}
	public MATRIX(int[][] matrica){
		this.matrica=new int[2][2];
		for(int i=0;i<2;i++)
			for(int j=0;j<2;j++) this.matrica[i][j]=matrica[i][j];
	}
	public MATRIX create(){	//Создаем рандомную матрицу 2х2
		MATRIX A=new MATRIX(); 
		for(int i=0;i<2;i++)
			for(int j=0;j<2;j++) A.matrica[i][j]=(int)(Math.random()*10);
		return A;
	}
	public MATRIX summa(MATRIX B){	//Суммируем матрицы
		MATRIX A=this;
		MATRIX C=new MATRIX();
		for(int i=0;i<2;i++)
			for(int j=0;j<2;j++) C.matrica[i][j]=A.matrica[i][j]+B.matrica[i][j];
		return C;
	}
	public MATRIX raznost(MATRIX B){	//Метод вычитания элементов матрицы
		MATRIX A=this;
		MATRIX C=new MATRIX();
		for(int i=0;i<2;i++)
			for(int j=0;j<2;j++) C.matrica[i][j]=A.matrica[i][j]=B.matrica[i][j];
		return C;
	}
	public MATRIX multiplication(MATRIX B){	//Умножение матриц друг на друга
		MATRIX A=this;
		MATRIX C=new MATRIX();
		for(int i=0;i<2;i++)
			for(int j=0;j<2;j++)
				for(int t=0;t<2;t++)
					C.matrica[i][j]+=A.matrica[i][t]*B.matrica[t][j];
		return C;
	}
	public MATRIX skalar(int n){	//умножение матрицы на скаляр
		MATRIX A=this;
		MATRIX C=new MATRIX();
		for(int i=0;i<2;i++)
			for(int j=0;j<2;j++) C.matrica[i][j]=A.matrica[i][j]*n;
		return C;
	}
	public void Determinant(){	//метод нахождения определителя и сразу же его вывод внутри метода
		MATRIX A=this;
		double rez=A.matrica[0][0]*A.matrica[1][1]-A.matrica[0][1]*A.matrica[1][0];
		System.out.println(rez);
	}
	public void Show(){		// Просто показываем матрицу
		for(int i=0;i<2;i++)
			for(int j=0;j<2;j++){
									System.out.print(matrica[i][j]+" ");
									if(j==1) System.out.println();
			}
			}
	}	