import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by acer on 26.05.14.
 */
public class MainSort {

    public static double time(Double[] a){
        Stopwatch timer = new Stopwatch();
        Quick.sort(a);
        return timer.elapsedTime();
    }

    public static double timeRandomInput(int N, int T){
        //T - количество массивов длины N
        double total=0.0;
        Double[] a = new Double[N];

        for (int t = 0; t < T ; t++) {
            //один из экспериментов
            for (int i = 0; i < N; i++)
                a[i]=StdRandom.uniform();
            total+=time(a);
        }
        return total;
    }

    public static void main(String[] args) {
        int N=5;
        int T=10;
        StdDraw.setCanvasSize();
        Queue<Double> listTime = new LinkedList<Double>();

        for (int i = 0; i < 20; i+=5) {
            listTime.add(timeRandomInput(N + i*3, 1));     //T - количество массивов длины N
        }
        StdDraw.setPenColor(Color.GREEN);
        StdDraw.setPenRadius(0.02);
        StdDraw.text(0.2,1,"Результаты тестов:");
        double x = 0.1;
        while (!listTime.isEmpty()){
        StdDraw.text(x,0.9, String.valueOf(listTime.poll()));
            x+=0.15;
        }

    }
}
