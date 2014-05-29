package Bracket;

import java.util.Scanner;

public class SequenceOfBracket {
	private static Scanner input;

	public static boolean RightSequence(String input) {
		Stack seq = new Stack();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			switch (ch) {

			case '(':
			case '[':
			case '{':
				seq.push(ch);
				break;

			case ')':
			case ']':
			case '}':
				 if( !seq.isEmpty() )
			{
					 char chx = seq.pop();
					 if((ch=='}' && chx!='{') ||
						(ch==']' && chx!='[') ||
						(ch==')' && chx!='(') )
						 System.out.println("Error: "+ch+" at "+i); 
			}
				 else
					 System.out.println("Error: "+ch+" at "+i);
				break;
				default:
					break;
				}
		}

		if (!seq.isEmpty())
			 System.out.println("Error: missing right delimiter");
		if (seq.isEmpty())
			return true;
		return false; 
		
	}

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Enter some sequence of brackets: ");
		String seq = input.nextLine();
		System.out.print(RightSequence(seq));
	}

}