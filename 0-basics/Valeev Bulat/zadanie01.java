package class_18;

class zadanie01 {
 public static void main (String[] args){
  int x = 10;
  int y = 10;
  
  int[][] a=new int[x][y];
  
  for (int i=0;i < a.length;i++){
    for (int j=0;j < a[i].length;j++){
      a[i][j]=(int)(Math.random()*2);
      }
     }
for (int i=0;i <= x;i++)
{
System.out.print(i+" ");
}
System.out.println();
 for (int i=0;i < a.length;i++,System.out.println()){
	 System.out.print ((i+1)+" ") ;
	 for (int j=0;j < a[i].length;j++){
     	if ( a[i][j] == 0 ) {
     		
     	System.out.print (' '+" ") ;
     	} 
     	else 
     		System.out.print('*'+" ") ;
     }
 }
     System.out.println(); }}


