import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception{
        Random random = new Random();

        // Для N = 1 000
        Integer[] array = new Integer[1000];
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        int countHeap = HeapSort.sort(array);
        int countFloyd = HeapFloydSort.sort(array);

        System.out.println("Стандартная реализация " + countHeap + ". Методом Флойда " + countFloyd );


        // Для N = 1 000 000
        Integer[] array1 = new Integer[1000000];
        for(int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt();
        }

        int countHeap1 = HeapSort.sort(array1);
        int countFloyd1 = HeapFloydSort.sort(array1);

        System.out.println("Стандартная реализация " + countHeap1 + ". Методом Флойда " + countFloyd1 );


        // Для N = 100 000 000 000
        Integer[] array2 = new Integer[100000000];
        for(int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt();
        }

        int countHeap2 = HeapSort.sort(array2);
        int countFloyd2 = HeapFloydSort.sort(array2);

        System.out.println("Стандартная реализация " + countHeap2 + ". Методом Флойда " + countFloyd2 );


    }
}
