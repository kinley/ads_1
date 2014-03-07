
public class QUESTION_1 {

	public static void main(String[] args) {
		int i=0,j=0,m=10,n=10;
		int [][] mas=new int[m][n];
		for(i=0;i<m;i++)				//Инициализируем массив
			for(j=0;j<n;j++) mas[i][j]=(int)(Math.random()*2);
		System.out.print(" ");
		for(j=0;j<n;j++)System.out.print(" "+j);
		System.out.println();
		for(i=0;i<m;i++){ 
			System.out.print(i+" ");
			for(j=0;j<n;j++) if(mas[i][j]==1){
											System.out.print("* ");
											if(j==n-1) System.out.println();
				}
				else{
					System.out.print("  ");
					if(j==n-1) System.out.println();
				};
		};
	};
}
