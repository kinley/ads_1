import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class List {
	
		private String word;	//составляющая нашего листа(список слов)
		private List next;
		private List head;
			
		public List(){		//пустой конструктор
				this.next=null;
			}
			
		public List(String word)	//не пустой конструктор)
			{
				this.word=word;
				this.next=null;
			}
	
		public void add(String word){	//добавление в список нового слова
			List insert=new List(word);
			if(head==null){
				head=insert;
			}
			else{
				List step=head;
				while(step.next!=null) step=step.next;
				step.next=insert;
			}
		}
		
		public void print(){	//полный вывод списка слов
			List writer=head;
			while(writer!=null){
				System.out.println(writer.word);
				writer=writer.next;
			}
		}
		
		public void get_string() throws FileNotFoundException{	//чтение из файла и добавление в список
			List reader=this;
			Scanner in=new Scanner(new File("text.txt"));	//файл находится в папке с проектом и наз. text.txt
			while(in.hasNext()){
				reader.add(in.nextLine());
			}
		}
		
		public void z_exception(){	//убираем из списка слова, где встречается на первой позиций буква 'z' или 'Z'
			List reader=head;
			List prev=head;
			while(reader!=null){
				if(reader.word.charAt(0)=='z' || reader.word.charAt(0)=='Z'){
					if(reader==head){
						head=head.next;
						prev=head;
					}
					else{
						prev.next=reader.next;
					}
					reader=reader.next;
				}
				else{
					if(reader!=head) prev=reader;
					reader=reader.next;
				}
			}
		}
	}
