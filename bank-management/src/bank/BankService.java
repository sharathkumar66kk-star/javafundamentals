package bank;
public class BankService {

    public void deposit(Account account, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposit successful");
    }

    public void withdraw(Account account, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
            return;
        }

        if (amount > account.getBalance()) {
            System.out.println("Insufficient balance");
            return;
        }

        account.setBalance(account.getBalance() - amount);
        System.out.println("Withdrawal successful");
    }

    public void displayAccount(Account account) {
        System.out.println("Account Number : " + account.getAccountNumber());
        System.out.println("Holder Name    : " + account.getHolderName());
        System.out.println("Balance        : " + account.getBalance());
    }
}
