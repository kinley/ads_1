import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) throws IOException {

		 // Пример работы на среднем графе.
	        Scanner sc = new Scanner(new File("input.txt"));
	        PrintWriter pw = new PrintWriter(new File("output.txt"));
	        TextParser textParser = new TextParser(sc, pw);                  

	        Graph G = new Graph(textParser);                                
	        G.PrintGraph(textParser);

	        DoubleComponent сomponent1 = new DoubleComponent(G,textParser);
	        сomponent1.FindComponent();
	      //  

	      // Граф, не имеющий вершин.
	        Scanner sc1 = new Scanner(new File("inputNoVex.txt"));
	        PrintWriter pw1 = new PrintWriter(new File("outputNoVex.txt"));
	        TextParser textParser1 = new TextParser(sc1, pw1);                  

	        Graph G1 = new Graph(textParser1);                                
	        G1.PrintGraph(textParser1);

	        DoubleComponent сomponent2 = new DoubleComponent(G1,textParser1);
	        сomponent2.FindComponent();	        
	      //
	        
		  // Граф, имеющий 5 изолированных вершин.
	        Scanner sc2 = new Scanner(new File("inputIsolatedVex.txt"));
	        PrintWriter pw2 = new PrintWriter(new File("outputIsolatedVex.txt"));
	        TextParser textParser2 = new TextParser(sc2, pw2);                  

	        Graph G2 = new Graph(textParser2);                                
	        G2.PrintGraph(textParser2);

	        DoubleComponent сomponent3 = new DoubleComponent(G2,textParser2);
	        сomponent3.FindComponent();	        
	      //
	        
		  // Граф с большим количеством вершин.
	        Scanner sc3 = new Scanner(new File("inputBigG.txt"));
	        PrintWriter pw3 = new PrintWriter(new File("outputBigG.txt"));
	        TextParser textParser3 = new TextParser(sc3, pw3);                  

	        Graph G3 = new Graph(textParser3);                                
	        G3.PrintGraph(textParser3);

	        DoubleComponent сomponent4 = new DoubleComponent(G3,textParser3);
	        сomponent4.FindComponent();	        
	      //  
	        
	        pw.close();
	        sc.close();
	        pw1.close();
	        sc1.close();
	        pw2.close();
	        sc2.close();
	        pw3.close();
	        sc3.close();
	    }
}

