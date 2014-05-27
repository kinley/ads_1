import java.util.Scanner;

public class Driver {
	
	 private static void inserter(int n, PQ<Integer> pq){		// инициализация очереди с приоритетами
		 for(int i=0;i<n;i++){
			 pq.insert((int) Math.random() *1000000);
			 }
	 }
	 
	 private static void extract(int n,PQ<Integer> pq){		// метод извлечения из очереди
		 for (int i = 0; i < n; i++){
	            pq.delMax();
		 }
	}
	 
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Введите размер очереди");
	        int size = in.nextInt();
	        PQ<Integer>pq = new  PQ<Integer>(size);
	        int count=0;
	        inserter(size, pq);	//инициализировали перед стартом)
	        double startTime = System.currentTimeMillis();	//начали отсчет
	        while((System.currentTimeMillis()-startTime) / 1000<1){	//пока не прошла секунда делаем
	        	extract(size, pq);	//извлекаем все из очереди
	        	count++;	//извлекли и посчитали
	            inserter(size, pq);	//заполнили
	           }
	        System.out.println("Число извлечений = "+count);
	    }
	}
