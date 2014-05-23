package Lists_3.Exercise_9;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Josephus {

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.println("Введите N");
        int N = sc.nextInt();
        System.out.println("Введите M");
        int M = sc.nextInt();

        // Заполняем очередь
        for(int i = 0; i < N; i++){
            queue.enqueue(i);
        }

        // Основной цикл
        while (!queue.isEmpty()){
            if(count == M - 1){
                System.out.print(queue.dequeue() + " ");
                count = 0;
            }
            else {
                queue.enqueue(queue.dequeue());
                count++;
            }
        }

    }
}
