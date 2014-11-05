
public class HeapFloydSort {

    private static int count;

    public static int sort(Comparable[] a) {
        count = 0;

        buildHeap(a);
        int length = a.length - 1;
        while (length > 0) {
            exch(a, 0, length);
            sink(a, length, 0);
            length--;
        }
        return count;
    }

    private static void buildHeap(Comparable[] a) {
        for (int i = a.length / 2; i >= 0; i--) {
            sink(a, a.length, i);
        }
    }

    private static void sink(Comparable[] a, int length, int i) {
        int l = left(i);
        int r = right(i);
        int largest = i;
        if (l < length && less(a, i, l)) {
            largest = l;
        }
        if (r < length && less(a, largest, r)) {
            largest = r;
        }
        if (i != largest) {
            exch(a, i, largest);
            sink(a, length, largest);
        }
    }

    private static int right(int i) {
        return 2 * i + 1;
    }

    private static int left(int i) {
        return 2 * i + 2;
    }

    private static void exch(Object[] pq, int i, int j) {
        Object swap = pq[i];
        pq[i] = pq[j];
        pq[j] = swap;
    }

    private static boolean less(Comparable[] pq, int i, int j) {
        count++;
        return pq[i].compareTo(pq[j]) < 0;
    }

}


