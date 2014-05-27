/**
 * Created by ruslansalahov on 27.05.14.
 */
public class main {
    public static void main(String[] args) {
        QueueRing<Integer> A = new QueueRing<Integer>();

        A.enqueue(2);
        A.enqueue(3);
        A.enqueue(5);

        A.Print();
        System.out.println(A.getSize());
        System.out.println();

        System.out.println(A.dequeue());
        System.out.println(A.dequeue());
        System.out.println(A.dequeue());

        A.Print();
    }
}
