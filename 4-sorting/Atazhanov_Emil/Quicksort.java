import java.util.Random;

public class QuickSort {
    public static int Lenght = 30;
    private static int[] array = new int[Lenght];
    private static Random generator = new Random();

    public static void initArray() {
        for (int i=0; i<Lenght; i++) {
            array[i] = generator.nextInt(100);
        }
    }

    public static void printArray() {
        for (int i=0; i<Lenght-1; i++) {
            System.out.print(array[i] + “, ”);
        }
        System.out.println(array[Lenght-1]);
    }

    public static void quickSort() {
        int startIndex = 0;
        int endIndex = Lenght - 1;
        doSort(startIndex, endIndex);
    }

    private static void doSort(int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j–;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(start, cur);
        doSort(cur+1, end);
    }

    public static void main(String[] args) {
        initArray();
        printArray();
        quickSort();
        printArray();
    }
}