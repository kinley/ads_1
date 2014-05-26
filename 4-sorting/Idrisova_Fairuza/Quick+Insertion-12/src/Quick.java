
public class Quick extends Sort{
    public static void sort(Comparable[] a)
    {
        StdRandom.shuffle(a);
        sort(a,0,a.length-1);
    }

    private static void sort(Comparable[] a, int lo, int hi)
    {
        if (hi<=lo+10)
        {
            Insertion.sort(a,lo,hi);
            return;
        }
        int j = partition(a,lo,hi);
        show(a);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }

    private static int partition(Comparable[] a, int lo, int hi)
    {   //разбиваем на a[lo..i-1] a[i] a[i+1..hi]
        int i = lo, j=hi+1; //просматриваемые,левый и правый индексы
        Comparable v = a[lo];
        while (true)
        {   //просмотр справа и слева, проверка на завершение, обмен
            while (less(a[++i],v)) if (i==hi) break;
            while (less(v,a[--j])) if (j==lo) break;
            if (i>=j) break;
            exch(a,i,j);
            show(a);
        }
        exch(a,lo,j); //перемещение v = a[j] на нужное место
        show(a);
        return j;
    }
}
