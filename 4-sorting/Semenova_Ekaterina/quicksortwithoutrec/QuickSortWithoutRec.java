package quicksortwithoutrec;
import java.util.*;
public class QuickSortWithoutRec
{
    private static Scanner in;

	public static void WriteList(int x[], int n)
    {
        int i;
        System.out.println(" ");
        for(i=0;i<n;i++)
            System.out.print("\t"+x[i]+ " ");
        System.out.println(" ");
    }

    public static int Sorting(int x[], int lb, int ub )
    {
        int a, little, temp, bigger,pj;
        a=x[lb];
        bigger=ub;
        little=lb;
        while(little<bigger)
        {
            while(x[little]<=a && little<bigger)
                little=little+1;       
            while(x[bigger]>a)
            	bigger=bigger-1;         

            if(little<bigger)
            {
                temp=x[little]; 
                x[little]=x[bigger];
                x[bigger]=temp;
            }
        }
        x[lb]=x[bigger];
        x[bigger]=a;
        pj=bigger;
        return (pj);
    }

   public static void Quick(int[] a, int lb, int ub)
    {
        Stack<Integer> S = new Stack<Integer>();
        S.push(lb);
        S.push(ub);
        while (!S.empty())
        {
            ub = (Integer)S.pop();
            lb = (Integer)S.pop();
            if (ub <= lb) continue;
            int i = Sorting(a, lb, ub);
            if (i-lb > ub-i)
            {
                S.push(lb);
                S.push(i-1);
            }
            S.push(i+1);
            S.push(ub);
            if (ub-i >= i-lb)
            {
                S.push(lb);
                S.push(i-1);
            }
        }
    }

    public static void main(String args[ ])
    {
        int i;
        System.out.println("Сколько чисел введете?");
        in = new Scanner(System.in);
        int n = in.nextInt();
        int x[]=new int[n];
        
        System.out.println("Введите числа");
        for(i=0;i<n;i++)
            x[i] = in.nextInt();
        Quick(x,0,n-1);
        System.out.println("\nОтсортированные элементы :");
        for(i=0;i<n;i++)
            System.out.print(x[i] + "  ");
    }
}