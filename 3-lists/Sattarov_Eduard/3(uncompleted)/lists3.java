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
		String word = "";
		int i = 0;
		while(line.charAt(i) != '.'){
			if((line.charAt(i) >= 'A') && (line.charAt(i) <= 'z')){
				word = word + line.charAt(i);
			}
			else{
				if (word.length() != 0){ //если есть несколько идущих подряд не латинских, не считать за слово
					addend(word);
				}
				word = "";
			}
			i++;
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