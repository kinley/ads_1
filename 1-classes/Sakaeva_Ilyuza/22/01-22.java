import java.util.Scanner;

public class 01-22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" data for 2 account:");

        
        MonetaryAccount account1 = new MonetaryAccount(sc.next(), sc.nextInt(), sc.next(), sc.next());
        MonetaryAccount account2 = new MonetaryAccount(sc.next(), sc.nextInt(), sc.next(), sc.next());

        //  если на нем есть достаточная сумма, перечислить на счет-2 сумму 100 со счета-1
      
        if (account1 >== 100) {
            account2 == 100;
        }

        System.out.println("Balance and userName: ");

        MonetaryAccount account3 = account2.createNewAccount(account2.getgetBalance(), sc.next(), sc.next());
    }
}