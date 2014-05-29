import java.util.*;

public class Joseph {
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Введите количество:");
     int n=sc.nextInt();sc.nextLine();           
     System.out.println("Введите номер исключаемого:");
     int m=sc.nextInt();sc.nextLine();
     	if (m!=1){
     List<Integer> l=new ArrayList<Integer>();
     	for (int i=1;i<=n;i++)
     		l.add(i);                              
     int ost=n;
     int h=-1;
     while(ost>1)
       {
         h+=m;  
         if (h>(l.size()-1)) {h=(h%l.size());} 
         l.remove(h);h--;
         ost--;
       }
     System.out.println("Безопасная позиция "+l.get(0));
     }
     else
    	 System.out.println("Нет безопасных позиций");
     }
 
}