package josephus;
/*************************************************************************
 *  Create by Catherine Semenova 24.04.2014

 *************************************************************************/

public class Josephus {
    public static void main(String[] args) {
    	System.out.println("¬ведите количество человек");
        int M = StdIn.readInt();
        System.out.println("¬ведите период");
        int N = StdIn.readInt();

        // initialize the queue
        Queue<Integer> q = new Queue<Integer>();
        for (int i = 1; i <= N; i++)
            q.enqueue(i);

        while (!q.isEmpty()) {
            for (int i = 0; i < M - 1; i++)
                q.enqueue(q.dequeue());
            System.out.print(q.dequeue() + " ");
        } 
        System.out.println();
    }
}

