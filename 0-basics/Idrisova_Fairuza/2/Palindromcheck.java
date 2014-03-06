
import java.util.*;
public class Palindromcheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter possible palindrome");
		String s = sc.nextLine();
		boolean bo = true;
		
		 for(int i=0; i < (s.length()/2); i++){
			 if (s.charAt(i) != s.charAt(s.length() - i -1)) {bo = false;}
			 }
    if (bo  == true) {System.out.print("Palindrom");}
    else  {System.out.print("Not_Palindrom");
    	  }
		
	}

}
