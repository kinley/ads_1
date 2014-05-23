import java.util.StringTokenizer;

public class Worker {

    public static void main(String[] args) {
        Tuna tuna = new Tuna(100);
        In in = new In("input.txt");
        String s = "";
        char a;

        while (in.hasNextLine()){
            s = in.readLine();
            a = s.charAt(0);
            Legislator legislator = new Legislator(s.substring(2, s.length()));

            if(a == 'F'){
                tuna.favor(legislator);
            }
            else if(a == 'U'){
                tuna.unfavor(legislator);
            }
        }

        tuna.printGoodGuys();

        System.out.println();

        tuna.printBadGuys();

    }

}
