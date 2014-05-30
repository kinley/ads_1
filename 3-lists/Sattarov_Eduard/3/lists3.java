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
	
	void initlist(String line){ //разбивает строку на слова и записывает их в список
		String word = "";
		for(int i = 0; i < line.length(); i++){
			if((line.charAt(i) >= 'A') && (line.charAt(i) <= 'z')){
				word = word + line.charAt(i);
			}
			else{
				if (word.length() != 0){ //если есть несколько идущих подряд не латинских, не считать за слово
					addend(word);
				}
				word = "";
			}
		}
	}
	
	void prohod(){ //строим противоположные слова
		listelement n = head;
		while(n != null){
			String reverse = "";
			for(int m = n.data.length() - 1; m >= 0; m--)
				reverse = reverse + n.data.charAt(m);
			System.out.println(reverse);
			delreverse(reverse);
			n = n.next;
		}
	}
	void delreverse(String word){ //противоположное слово сравниваем со всеми и удаляем пары одинаковых
		if ((head == null)||(head == tail)){
			return;
		}
		if (head.data == word){
			head = head.next;
			return;
		}
		listelement z = head;
		while(z.next != null){
			if(z.next.data == word){
				if(tail == z.next){
					tail = z;
				}
			}
			z.next = z.next.next;
			return;
		}
		z = z.next;
	}
}

public class lists3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		list a = new list();
		System.out.println("Enter a string, end of input is <<.>>");
		a.initlist(sc.nextLine());
		//a.prohod();
		a.printlist();
	}
}