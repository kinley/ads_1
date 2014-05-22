package Atazhanov_Emil;

import java.util.Scanner;

public class number1{
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	int N = in.nextInt();
	int M = in.nextInt();
int[][] massive =new int [N][M];
int i=0,j=0;
	for(i=0;i<N;i++){
	for (j=0;j<M;j++){
	massive[i][j]=(int)(Math.random()*2);
	if (massive[i][j]==1)
	System.out.print("*"+" ");
	else
	System.out.print(" ");
	}
	System.out.println();
	}
}  
}

