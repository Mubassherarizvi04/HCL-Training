package assignment1;

class Bank {
    private double balance = 0;

    void deposit(double amt) {
        balance += amt;
        System.out.println("Amount Deposited");
    }

    void withdraw(double amt) {
        if (amt > balance)
            throw new ArithmeticException("Insufficient Balance");
        balance -= amt;
        System.out.println("Withdrawal Successful");
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class BankManagement {

    public static void main(String[] args) {
        Bank b = new Bank();

        try {
            b.deposit(5000);
            b.withdraw(2000);
            b.showBalance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
