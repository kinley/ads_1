import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) throws IOException {

		 // В комплекте 4 файла для тестов: обычный граф, граф с большим числом вершин и ребер, файл с нулем и граф без ребер.
		 // cоответственно input.txt, inputNoVex.txt, inputIsolatedVex.txt, inputBigG.txt 
	        Scanner sc = new Scanner(new File("input.txt"));
	        PrintWriter pw = new PrintWriter(new File("output.txt"));
	        TextParser textParser = new TextParser(sc, pw);                  

	        Graph G = new Graph(textParser);                                
	        G.PrintGraph(textParser);

	        DoubleComponent сomponent1 = new DoubleComponent(G,textParser);
	        сomponent1.FindComponent();
	      //  

	     
	        
	        pw.close();
	        sc.close();
	    }
}

