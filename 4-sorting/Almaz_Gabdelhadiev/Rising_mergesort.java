/**
 * Created by Almaz on 16.05.2014.
 */
public class Rising_mergesort {
    private int maxN;

    public Rising_mergesort(){}
    public Rising_mergesort(int maxN){
        this.maxN = maxN;
    }
    void mergeSort(int a[], int l, int r) //сортировка восходящая.
    {
        for(int m = l; m <=r-l; m=2*m)
            for(int i = l; i<=r-m; i+=2*m)
                merge(a, i, i+m-l, Math.min(i+2*m-l, r));
    }

    void merge(int a[], int l, int m, int r) //слияние - метод абстрактный обменный
    {
        int i,j;
        int aux [] = new int[maxN];
        for(i = m+1; i > l; i--)
            aux[i-l]=a[i-l];
        for(j = m; j < r; j++)
            aux[r+m-j] = a[j+l];
        for(int k = l; k <=r; k++)
            if(aux[j] < aux[i])
                a[k] = aux[j--];
            else
                a[k] = aux[i++];
    }
}
