package List;

	import java.util.Scanner;
	public class Main
{
		private static Scanner sc;

		public static void main(String[] args) 
		{
			sc = new Scanner(System.in);
			List<String> node= new List();
			System.out.println("Введите строку. Последний символ должен быть точкой");
			String s= sc.nextLine();
			int i=0;
			int j=0;
			int k=0;
			String c="";
			while((s.charAt(i) !='.') && ((i+j+2)<=(s.length()+i)))
			{
				k=i;
				while((s.charAt(k)>='a') && (s.charAt(k)<='z') || (s.charAt(k)>='A') && (s.charAt(k)<='Z'))
				{
					c +=  s.charAt(k);
					j++;
					k=j;
				}
				if(c != "")
					node.putEnd(c);
				c = "";
				if((j!=i) && (s.charAt(i)!='.') && (i<s.length()))
				
					if(!((i+j)>=s.length()))
					i+=j; 	
					else break;
				else{ i++; }
				j=i;

				
			}
			System.out.println("Слова");
			node.printNode();
			System.out.println();
			System.out.println("Исходная строка");
			System.out.println(s);
}
}
