package bank;

public class Main {

    public static void main (String[] args) {

        Account account = new Account(101, "Sharath", 5000.0);
        BankService service = new BankService();

        service.displayAccount(account);
        System.out.println();

        service.deposit(account, 2000);
        service.displayAccount(account);
        System.out.println();

        service.withdraw(account, 1500);
        service.displayAccount(account);
        System.out.println();

        service.withdraw(account, 10000);
    }
}
