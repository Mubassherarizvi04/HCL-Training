package mini_project1;

public class BankAccount {

	
	private int accountNumber;
    private String accountHolder;
    protected double balance;

    // Constructor
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Encapsulation (getters)
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Abstraction (abstract methods)
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    // Concrete method
    public void displayDetails() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}
