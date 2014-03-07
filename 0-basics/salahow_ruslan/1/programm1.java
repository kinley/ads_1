package project1;

public class programm1 {
	public static void main(String[] args) {
		 int n=5,m=7; // размерность
		 int [][] massive=new int[n][m];
		 int i=0,j=0;
		 System.out.print(" ");
		 for (i=1;i<=m;++i)
			 System.out.print(" "+i);
		 	 System.out.println();
		 for(i=0;i<n;i++) {
			System.out.print(i+1+" ");
		 for(j=0;j<m;j++){
			 massive[i][j]=(int)(Math.random()*2);
			  if (massive[i][j]==1) 
				System.out.print("*"+" ");
			  else 
				System.out.print("  ");
		 }
		 System.out.println();
		}
	}

}
