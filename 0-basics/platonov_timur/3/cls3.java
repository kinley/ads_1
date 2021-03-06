// TASK 0.3
// форматированный вывод

public class cls3 {
    public static void PrintTable() throws IOException {
        final Scanner sc = new Scanner(new File("input.txt"));
        while (sc.hasNext()) {
            String s = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();

            // для слишком больших строк вывод не будет красивым
            System.out.printf("%60s, %9d, %9d, %13.3f\n", s, a, b, (double)a/b);
        }
    }

    // ##### MAIN #####
    public static void main(String[] args) throws IOException {
        PrintTable();
    }
}
