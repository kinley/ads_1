import java.util.Scanner;

public class tesk_05 {
    public static double Log(int N){
        if((N == 0) || (N == 1))
            return Math.log(1);
        else
           return Math.log(N) + Log(N - 1);
    }

    public static void main(String[] args){
        System.out.print("Введите число N: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.print("Log(N!) = " + Log(N) + "\n");
    }
}
