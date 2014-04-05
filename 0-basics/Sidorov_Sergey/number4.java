package test;

import java.util.Scanner;

public class number4 {	
	public static void main (String[] args){
	Scanner in = new Scanner(System.in);
	System.out.print("p: ");
	int p = in.nextInt();
	System.out.print("q: ");
	int q = in.nextInt();
	int k=0;
	if (p>q){
				while (q!=0)
				{	k=p%q;
					p=q;
					q=k;
				}
			System.out.print("мнд: "+p);
			}
	else{
		while (p!=0)
			{	k=q%p;
				q=p;
				p=k;
			}	
		System.out.print("мнд: "+q);
		}
											}

					}

