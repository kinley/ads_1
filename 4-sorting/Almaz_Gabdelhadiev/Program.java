import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Almaz on 29.05.2014.
 */
public class Program {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("8Kints.txt"));
        int a[] = new int [8000];
        for (int i = 0; scanner.hasNext(); i++) {
            a[i] = scanner.nextInt();
        }
        int b[] = a;
        long before = System.nanoTime();
        MergeBU.sort(a);
        long after = System.nanoTime();
        System.out.println(after - before);
        long bef = System.nanoTime();
        Descending_mergesort.mergesort(a);
        long aft = System.nanoTime();
        System.out.print(aft - bef);

    }
}
