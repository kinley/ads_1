import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextParser<Item> {
    Scanner sc;
    PrintWriter pw;

    public TextParser(Scanner sc, PrintWriter pw) {
        this.sc = sc;
        this.pw = pw;
    }


    public int readInt() {
        try {
            if (sc.hasNext()) {
                return (sc.nextInt());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return (-1);
    }


    public void println() throws IOException {
        pw.println();
    }

    public void println(Item st) throws IOException {
        pw.println(st);
    }

    public void print(Item st) throws IOException {
        pw.print(st + " ");
    }

}

