/**
 * Created by ruslansalahov on 27.05.14.
 */
public class Sort { // Шаблон для сортировки ( Седжвик)

    public static boolean less (Comparable v,Comparable w) { // Проверка минимальный элемент

        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) { // Поменять местами
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static boolean isSorted(Comparable[] a) {  // Проверка массива на отсортированность.
        for(int i=1;i<a.length;i++)
            if (less(a[i],a[i-1]))
                return false;
        return true;
    }

    public static void show(Comparable[] a) {   // Распечатать массив.
        for (int i=0;i<a.length;i++)
            StdOut.print(a[i] + " ");
        StdOut.println();
    }

}
