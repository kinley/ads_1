import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class STACK_MAIN 
{
public static void main(String[] args) 
{
		Scanner in = new Scanner(System.in);
		STACK st=new STACK();
		String tmp="";
		Set logic=new HashSet();		//множество арифм. операций, для проверки в дальнейшем
		logic.add('+');
		logic.add('-');
		logic.add('/');
		logic.add('*');
		System.out.println("Enter string");	//ввели нашу строку
		String stroka=in.nextLine();
		for(int i=0;i<stroka.length();i++){	//заполняем стэк
					if(logic.contains(stroka.charAt(i))) {		//тут проверям на вход во множество арифм. операций
						st.push('2');
					}
					else if(stroka.charAt(i)>='a'&& stroka.charAt(i)<='z'){	//тут на заданные переменный в выражений
						st.push('3');
					}
					else if(stroka.charAt(i)=='(') {	//начало выражения, как правило
						st.push('0');
					}
					else if(stroka.charAt(i)==')'){				//ну уже понятно
						st.push('I');
					}
					else{ 		//оно содержит что-то помимо нужного, поэтому сразу ERROR и break
								tmp="ERROR";
								break;
						}
					}
					if(!tmp.equals("ERROR")){	//если "загон" в стэк произошел без ошибки то выполняем проверку на "заменяемость" на три, и выводим
						st.changing();		//производим "преобразование" стэка по условию
						System.out.println(st.check());		//проверка преобразованного выражение, вывод true-выражение правильное, false-соотв непр.
						st.print_Item();	//вывод(не pop, обычный вывод)
					}
					else System.out.println(tmp);		//произошла ошибка, поэтому так и выведем
					}
		}