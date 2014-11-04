package qSort;
import java.util.Scanner;
/*
 * представим наши болты и гайки в виде двух числовых массивов
 * болты меньше гаек
 * остортируем их, тем самым каждому болту будет сооветсвовать гайка
 */

import java.util.Random;

public class QSort {
	//наш алгоритм быстрой сортировки
	public static void QSort(int arr[], int left, int right){
		int lft = left;
		int rght = right;
		int mdl = arr[lft+(rght-lft)/2];
		
		while (lft<rght){
			while ((lft<right) && arr[lft]<mdl) lft++;
			while ((rght>left) && arr[rght]>mdl) rght--;
			
			if(lft<rght){
				int temp = arr[lft];
				arr[lft] = arr[rght];
				arr[rght] = temp;
			}
		}
		if(lft>left) QSort(arr, left, rght-1);
		if(rght<right) QSort(arr, lft+1, right);
	}
	
	public static void main(String[] args){
		
		int b[] = new int[5];
		System.out.println("Введите 5 болтов, в виде чисел");
		Scanner bN = new Scanner(System.in);
		for (int i=0; i<5; i++) b[i] = bN.nextInt();
		
		int g[] = new int[5];
		System.out.println("Введите 5 гаек, в виде чисел");
		Scanner gN = new Scanner(System.in);
		for (int i=0; i<5; i++) g[i] = gN.nextInt();
		
		System.out.println("Болты:");
		for(int i=0; i<5; i++) System.out.print(b[i]+" ");
		System.out.println();
		System.out.println("Гайки:");
		for(int i=0; i<5; i++) System.out.print(g[i]+" ");
		System.out.println();
		
		QSort(b,0,4);
		QSort(g,0,4);
		
		System.out.println("Болт, под ним соответствующая гайка");
		for(int i=0; i<b.length; i++) System.out.print(b[i]+" ");
		System.out.println();
		for(int i=0; i<g.length; i++) System.out.print(g[i]+" ");
	}

}
