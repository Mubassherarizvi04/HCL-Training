package assignment2;

		interface BankOperations {
		    void deposit(double amount);
		    void withdraw(double amount) throws InsufficientBalanceException;
		    void checkBalance();
		}

		interface CustomerOperations {
		    void showCustomerDetails();
		}

		class InsufficientBalanceException extends Exception {
		    public InsufficientBalanceException(String message) {
		        super(message);
		    }
		}

		class BankAccount implements BankOperations, CustomerOperations {

		    private int accountNumber;
		    private String customerName;
		    private double balance;

		    public BankAccount(int accountNumber, String customerName, double balance) {
		        this.accountNumber = accountNumber;
		        this.customerName = customerName;
		        this.balance = balance;
		    }

		    public void deposit(double amount) {
		        if (amount <= 0) {
		            System.out.println("Deposit amount must be positive.");
		            return;
		        }
		        balance += amount;
		        System.out.println("Deposited: ₹" + amount);
		    }

		    public void withdraw(double amount) throws InsufficientBalanceException {
		        if (amount <= 0) {
		            System.out.println("Withdrawal amount must be positive.");
		            return;
		        }
		        if (amount > balance) {
		            throw new InsufficientBalanceException("Insufficient balance!");
		        }
		        balance -= amount;
		        System.out.println("Withdrawn: ₹" + amount);
		    }

		    public void checkBalance() {
		        System.out.println("Current Balance: ₹" + balance);
		    }

		    public void showCustomerDetails() {
		        System.out.println("Account Number: " + accountNumber);
		        System.out.println("Customer Name: " + customerName);
		    }
		}
		
		public class BankApplication {

		    public static void main(String[] args) {

		        BankAccount account = new BankAccount(101, "Mubasshera", 5000);

		        account.showCustomerDetails();
		        account.checkBalance();

		        account.deposit(2000);

		        try {
		            account.withdraw(9000);
		        } catch (InsufficientBalanceException e) {
		            System.out.println("Error: " + e.getMessage());
		        }

		        try {
		            account.withdraw(3000); 
		        } catch (InsufficientBalanceException e) {
		            System.out.println("Error: " + e.getMessage());
		        }

		        account.checkBalance();
		    }
		
	}
