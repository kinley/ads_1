package quicksortwithoutrec;
import java.util.*;
public class QuickSortWithoutRec
{
    private static Scanner in;

	public static void Display(int x[], int n)
    {
        int i;
        System.out.println(" ");
        for(i=0;i<n;i++)
            System.out.print("\t"+x[i]+ " ");
        System.out.println(" ");
    }

    public static int Partition(int x[], int lb, int ub )
    {
        int a, down, temp, up,pj;
        a=x[lb];
        up=ub;
        down=lb;
        while(down<up)
        {
            while(x[down]<=a && down<up)
                down=down+1;       
            while(x[up]>a)
                up=up-1;         

            if(down<up)
            {
                temp=x[down]; 
                x[down]=x[up];
                x[up]=temp;
            }
        }
        x[lb]=x[up];
        x[up]=a;
        pj=up;
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
            int i = Partition(a, lb, ub);
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
        int i,n=10;
        int x[]=new int[10];
        in = new Scanner(System.in);
        System.out.println("Введите 10 чисел");
        for(i=0;i<n;i++)
            x[i] = in.nextInt();
        Quick(x,0,n-1);
        System.out.println("\nОтсортированные элементы :");
        for(i=0;i<n;i++)
            System.out.print(x[i] + "  ");
    }
}