import java.util.Scanner;
 
public class Palindrom {
    public static void main(String[] args) {
    	    String stroka=new String(); Boolean sw=true;
    	    Scanner sc = new Scanner(System.in);
            System.out.print("¬ведите слово (буквы должны быть одного регистра): ");
            if(sc.hasNextLine()) { 
              stroka= sc.nextLine();
            };
            int length = stroka.length();
            if (length==0) sw=false;   //пуста€ строка Ч не палиндром
            for (int i = 0; i<length/2; i++) {
                if (stroka.charAt(i)!=stroka.charAt(length - i - 1))
                    sw = false;
            }
            if (sw) System.out.println("—лово - палиндром");
            else System.out.println("—лово - не палиндром");
    }
}   
