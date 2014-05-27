/**
 * Created by ruslansalahov on 27.05.14.
 */
public class main {
    public static void main(String[] args) {
        Integer [] a  = new Integer[10];

        for(int i=0;i<10;i++) {
            a[i] = StdRandom.uniform(100); // запоняем массив рандомом до N, в нашем случае 100
        }

        Sort.show(a); // Массив до сортировки
        System.out.println(Sort.isSorted(a));

        QuickSort.QSort(a);

        Sort.show(a);   // Массив после сортировки
        System.out.println(Sort.isSorted(a));

    }
}

