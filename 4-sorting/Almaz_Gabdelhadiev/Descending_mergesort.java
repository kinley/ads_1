/**
 * Created by Almaz on 16.05.2014.
 */
public class Descending_mergesort {
    public static void mergesort (int[] a) {
        mergesort(a, 0, a.length-1);
    }

    private static void mergesort (int[] a, int l, int r) {
        if ( l>=r ) return;
        int m = (l+r)/2;
        mergesort (a, l, m);
        mergesort (a, m+1, r);
        merge (a, l, m, r);
    }

    private static void merge (int[] a, int l, int m, int r) {
        if (m+1>r) return;
        int[] b = new int[a.length];
        for (int i=l; i!=m+1; i++) {
            b[i] = a[i];
        }
        for (int i=m+1; i!=r+1; i++) {
            b[i] = a[r+m+1-i];
        }
        int k=l; int j=r;
        for (int i=l; i!=r+1; i++) {
            if (b[k] <= b[j]) a[i] = b[k++]; else a[i] = b[j--];
        }
    }
}
