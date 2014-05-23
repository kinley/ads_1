package programm;

public class program {
	public static void main(String[] args) {
		 int x=6;
         int y=6;
		 int [][] massive=new int[x][y];
		 int i=0;
         int j=0;
		 System.out.print(" ");
		 for (i=1;i<=y;++i)
			 System.out.print(" "+i);
		 	 System.out.println();
		 for(i=0;i<x;i++) {
			System.out.print(i+1+" ");
		 for(j=0;j<y;j++){
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
