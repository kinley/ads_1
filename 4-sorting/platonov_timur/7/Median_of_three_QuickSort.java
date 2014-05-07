import java.util.Arrays;

public class Median_of_three_QuickSort {

    private static void Swap(int[] array, int i, int j) {
        int buff = array[i];
        array[i] = array[j];
        array[j] = buff;
    }

    // поиск медианы среди первого, среднего и последнего
    // элементов массива
    private static int MedianOfThree(int[] array, int start, int end) {
        if (array[(start + end) / 2] >= array[start] && array[(start + end) / 2] <= array[end]) {
            return (start + end) / 2;
        }
        else if (array[start] >= array[(start + end) / 2] && array[start] <= array[end]) {
            return start;
        }
        else {
            return end;
        }
    }

    public static void QSortMedianOfThree(int[] v, int left, int right) {
        if (left >= right)
            return;

        Swap(v, left, MedianOfThree(v, left, right)); // правка - за опорный берём медиану

        int last = left;

        for (int i = left + 1; i <= right; i++) {
            if (v[i] < v[left]) {
                Swap(v, ++last, i);
            }
        }

        Swap(v, left, last);
        QSortMedianOfThree(v, left, last - 1);
        QSortMedianOfThree(v, last + 1, right);
    }

    public static void QSort(int[] v, int left, int right) {
        // Реализация быстрой сортировки из классики -
        // K&R ANSI C
        if (left >= right)
            return;

        Swap(v, left, (left+right)/2);

        int last = left;

        for (int i = left + 1; i <= right; i++) {
            if (v[i] < v[left]) {
                Swap(v, ++last, i);
            }
        }

        Swap(v, left, last);
        QSort(v, left, last - 1);
        QSort(v, last + 1, right);
    }

    public static void main(String[] args) {
		// URL to download: https://github.com/tpltn/java_by_anv/blob/master/1Mints.zip
        In in = new In("C:\\<PATH>\\1Mints.txt");
        int[] a = in.readAllInts();
        int[] b = a;
        int[] c = a;

        long t = System.currentTimeMillis();
        QSort(a, 0, a.length - 1);
        long t2 = System.currentTimeMillis();
        System.out.println("QSort: " + (t2-t) + "ms");

        long t3 = System.currentTimeMillis();
        QSortMedianOfThree(b, 0, b.length - 1);
        long t4 = System.currentTimeMillis();
        System.out.println("QSortMedianOfThree: " + (t4-t3) + "ms");

        long t5 = System.currentTimeMillis();
        Arrays.sort(c);
        long t6 = System.currentTimeMillis();
        System.out.println("Arrays.sort(): " + (t6-t5) + "ms");
    }
}
