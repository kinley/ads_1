
import java.lang.*;
class AISD01 {
 public static void main (String[] args){
  int[][] a=new int[5][5];
  int max,min; 
  for (int i=0;i < a.length;i++){
    for (int j=0;j < a[i].length;j++){
      a[i][j]=(int)(Math.random()*2);
      }
     }
for (int i=0;i < a.length;i++,System.out.println()){
for (int j=0;j < a[i].length;j++)
{
System.out.print(a[i][j]+" ");
}}
 for (int i=0;i < a.length;i++,System.out.println())
	 for (int j=0;j < a[i].length;j++){
     	if ( a[i][j] == 0 ) {
     		
     	System.out.print (' ') ;
     	} 
     	else 
     		System.out.print('*') ;
     }
     System.out.println(); }}


