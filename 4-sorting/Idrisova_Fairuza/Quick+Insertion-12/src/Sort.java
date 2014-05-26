
public abstract class Sort {

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable[] a) {
        StdDraw.clear();
        double x = 0.35;
        for (int i = 0; i < a.length; i++) {
          //  System.out.print(a[i] + " ");
            StdDraw.line(x,0.1,x, (Double) a[i]);
            x+=0.01;
        }
       // System.out.println();
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) return false;
        }
        return true;
    }
}
