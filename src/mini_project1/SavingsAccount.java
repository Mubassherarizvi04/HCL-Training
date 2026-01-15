package mini_project1;

public class SavingsAccount extends BankAccount {

	 public SavingsAccount(int accNo, String name, double balance) {
	        super(accNo, name, balance);
	    }

	    @Override
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposit Successful");
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawal Successful");
	        } else {
	            System.out.println("Insufficient Balance");
	        }
	    }
}
