// TASK 0.5
// вычисление ln(N!)

public class cls5 {
    public static long Fact(int n) {
        switch (n) {
            case 0: case 1:
                return 1;

            default:
                return n*Fact(n - 1);
        }
    }

    public static double GetLogNFact(int n) {
        return Math.log(Fact(n));
    }

    // ##### MAIN #####
    public static void main(String[] args) {
        System.out.print(GetLogNFact(12));
    }

}