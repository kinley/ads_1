import java.util.Scanner;

public class RunnerClass {
    public static void main(String[] args) {
        Tuna tuna = new Tuna();
        Scanner scanner = new Scanner(System.in);
        char command = scanner.nextLine().charAt(0); // HACK

        while (command != 'E') {
            String s = scanner.nextLine();

            if (command == 'F') {
                tuna.favour(s);
            }
            else if (command == 'U') {
                tuna.unfavour(s);
            }
            else if (command == '?') {
                tuna.report(s);
            }
            else {
                System.out.println("Unknown command!");
            }

            command = scanner.nextLine().charAt(0);
        }
    }
}
