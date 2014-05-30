package edik;

import java.util.Scanner;

class listelement{
	listelement next;
	String data;
}

class list{
	private listelement head;
	private listelement tail;
	
	void addend(String data){
		listelement n = new listelement();
		n.data = data;
		if(tail == null){
			head = n;
			tail = n;
		}
		else{
			tail.next = n;
			tail = n;
		}
	}
	void printlist(){
		listelement i = head;
		while (i != null){
			System.out.print(i.data + " ");
			i = i.next;
		}
	}
	
	void init(String line){
		int i = 1;
		char c;
		String word = "";
		while(line.charAt(i) != '.'){
			c = line.charAt(i);
			if((c != ' ') && (c != '.')){
				word = word + c;
			}
			else{
				addend(word);
				word = "";
			}
		}
	}
}

public class lists3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		list a = new list();
		System.out.println("Enter a string, end of input is <<.>>");
		//a.addend(sc.nextLine());
		a.init(sc.nextLine());
		a.printlist();
	}
}