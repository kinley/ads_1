public class Palindrom {
	
	static String s = "шалаш";
	
	public static boolean isPolyndrom(String s) {
		boolean flag = false;
		for (int i = s.length(), j = i; j>0; j--) {
			if ((s.charAt(i-j)) == (s.charAt(j-1))) flag = true; 
			else flag = false;}
			return flag;
	}
	
	public static void main(String [] args) {
		if (isPolyndrom(s)) {System.out.println(s + " is polindrom");} 
		else {System.out.println(s + " is not polindrom");}
	}
}
