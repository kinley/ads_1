import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class STACK_MAIN {

public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		STACK st=new STACK();
		String tmp="";
		Set logic=new HashSet();
		logic.add('+');
		logic.add('-');
		logic.add('/');
		logic.add('*');
		System.out.println("Enter string");
		String stroka=in.nextLine();
		for(int i=0;i<stroka.length();i++){
					if(logic.contains(stroka.charAt(i))) {
						st.push('2');
					}
					else if(stroka.charAt(i)>='a'&& stroka.charAt(i)<='z'){
						st.push('3');
					}
					else if(stroka.charAt(i)=='(') {
						st.push('0');
					}
					else if(stroka.charAt(i)==')'){				
						st.push('1');
					}
					else	{ 
							tmp="ERROR";
							break;
						}
					}
					if(!tmp.equals("ERROR")){
							for(int i=0;i<stroka.length();i++) System.out.print(st.pop());
					}
					else System.out.println(tmp);
					}
		}