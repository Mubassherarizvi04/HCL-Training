package mini_project1;

public class CurrentAccount extends BankAccount {

	public CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful");
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawal Successful (Overdraft Allowed)");
    }
}
