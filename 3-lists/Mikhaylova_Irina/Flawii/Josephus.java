import java.util.Scanner;

public class Josephus {
	    public static void main(String[] args) {
	    	//���� ������
	    	Scanner sc = new Scanner (System.in);
	    	System.out.println ("Enter N (number of people at all)");
	    	int N = sc.nextInt();
	    	System.out.println("Enter M (order of exclusion)");
	        int M = sc.nextInt();
	        
	        //������� ������� � ������ �������������� ����������
	        Queue<Integer> que = new Queue<Integer>();
	        for (int i = 0; i < N; i+=1){
	        	que.enqueue(i);
	        }
	        
	        // �������� ����, � ������� ���������� ������� � ������� ���������� ������
	        System.out.println("The process of exclusion: ");
	        while (!que.isEmpty()) {
	            for (int i = 1; i < M; i+=1) {
	            	que.enqueue(que.dequeue());
	            }	
	                System.out.print(que.dequeue() + " ");
	        }
	    }   
}