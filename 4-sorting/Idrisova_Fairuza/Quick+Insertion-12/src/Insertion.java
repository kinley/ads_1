
//Вставки
public class Insertion extends Sort
{
    public static void sort(Comparable[] a){
        int N=a.length;
        for (int i = 1; i < N; i++) {
            //вставка a[i] между a[i-1] a[i-2]
            for (int j = i; j > 0 && less(a[j],a[j-1]); j--)
                exch(a,j,j-1);
                show(a);
        }
    }

    public static void sort(Comparable[] a,int lo,int hi){
        for (int i = lo; i < hi+1; i++) {
            //вставка a[i] между a[i-1] a[i-2]
            for (int j = i; j > 0 && less(a[j],a[j-1]); j--)
                exch(a,j,j-1);
        }
        show(a);
    }


}
