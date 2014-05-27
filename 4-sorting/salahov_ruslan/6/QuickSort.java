/**
 * Created by ruslansalahov on 27.05.14.
 */
public class QuickSort {    // Основной метод
    public static void QSort(Comparable[] a) {
        StdRandom.shuffle(a);
        QuickSort.MaxInRight(a);    // Ставит максимальный элемент в массиве в конец, для того, чтобы убрать проверку на правую границу
        QSort(a, 0, a.length - 1);
    }

    public static void MaxInRight(Comparable[] a) {
        Comparable max=0;
        Comparable swap;
        int maxIn=0;

        for (int i=0;i<a.length;i++)
            if (Sort.less(max,a[i]) == true) {  // Находим максимальный элемент.
                max = a[i];
                maxIn = i;
            }

        Sort.exch(a,maxIn,a.length-1);  // Меняет местами.
    }

    public static void QSort(Comparable[] a, int low, int high) {
        if(high<=low)
            return;
        int j = partition(a,low,high);
        QSort(a,low,j-1);
        QSort(a,j+1,high);
    }

    public static int partition(Comparable[] a, int low, int high) {
        int i = low;
        int j = high+1;

        Comparable v=a[low];
        while (true) {
            while (Sort.less(a[++i],v));  // Здесь были проверки границ.
            while (Sort.less(v,a[--j]));

            if (i>=j) break;
            Sort.exch(a,i,j);
        }

        Sort.exch(a,low,j);
        return j;
    }
}
