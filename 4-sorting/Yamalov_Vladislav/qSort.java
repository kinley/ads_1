package huy;

import java.util.Scanner;

public class qSort {
	public static int n;
	public static int [] m;
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=new int[n];
		for(int i=0;i<n;i++){
			m[i]=sc.nextInt();
		}
		qSort sp=new qSort();
		sp.qSort(m, 0, n-1);
		sp.print();
	}
	public static void qSort(int[] array, int l, int r) {
        int i = l;
        int j = r;
        int x = array[l + (r - l)/2];
        while (i <= j) {
            while (array[i] < x) {
                i++;
            }
            while (array[j] > x) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (l<j){
            qSort(array, l, j);
        }
        if(i<r){
            qSort(array, i, r);
        }
    }
	public static void print(){
		for(int i=0;i<n;i++){
			System.out.print(m[i]);
		}
	}
}