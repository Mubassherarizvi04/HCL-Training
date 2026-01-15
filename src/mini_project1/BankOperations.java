package mini_project1;

public class BankOperations {

	public void checkBalance(BankAccount account) {
        System.out.println("Balance: " + account.getBalance());
    }

    public void checkBalance(BankAccount account, String currency) {
        System.out.println("Balance: " + account.getBalance() + " " + currency);
    }
}
