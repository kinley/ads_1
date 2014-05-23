package Sort_4.Exercise_23;

import java.util.Scanner;

public class Solution {

    // Метод заполняющий очередь с приоритетом
    private static void inserter(int n, MaxPQ<Integer> pq){
        for (int i = 0; i < n; i++){
            pq.insert((int) (Math.random() * 10000000));
        }
    }

    private static void deleter(int n, MaxPQ<Integer> pq){
        for (int i = 0; i < n; i++){
            pq.delMax();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер очереди");
        int size = sc.nextInt();
        MaxPQ<Integer>pq = new  MaxPQ<Integer>(size);
        System.out.println("Введите число повторений");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++){
            Stopwatch a = new Stopwatch();
            inserter(size, pq);
            deleter(size / 2, pq);
            inserter(size / 2, pq);
            deleter(size, pq);
            System.out.println(a.elapsedTime());
        }
    }
}
