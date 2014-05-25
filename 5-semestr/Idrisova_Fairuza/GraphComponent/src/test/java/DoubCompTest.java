import junit.framework.Assert;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class DoubCompTest {
    DoubComp comp1;
    DoubComp comp2;
    DoubComp comp3;
    @org.junit.Before
    public void setUp() throws Exception {

        Scanner sc1 = new Scanner(new File("src/input1.txt"));
        Scanner sc2 = new Scanner(new File("src/input2.txt"));
        Scanner sc3 = new Scanner(new File("src/input3.txt"));
        PrintWriter pw = new PrintWriter(new File("src/output.txt"));
        TextParser textParser1 = new TextParser(sc1, pw);                  //работа с файлами
        TextParser textParser2 = new TextParser(sc2, pw);
        TextParser textParser3 = new TextParser(sc3, pw);

        Graph G1 = new Graph(textParser1);                                //создаем граф
        Graph G2 = new Graph(textParser2);
        Graph G3 = new Graph(textParser3);
        comp1 = new DoubComp(G1);
        comp2 = new DoubComp(G2);
        comp3 = new DoubComp(G3);

    }

    @org.junit.Test
    public void testGetCountCom() throws Exception {
        int res1 = comp1.getCountCom();
        int res2 = comp2.getCountCom();
        int res3 = comp3.getCountCom();


        Assert.assertEquals(res1, 3);
        Assert.assertEquals(res2,5);
        Assert.assertEquals(res3,1);
    }
}
