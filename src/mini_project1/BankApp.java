package mini_project1;
import java.util.Scanner;
public class BankApp {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account;

        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Select Account Type: ");
        int type = sc.nextInt();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        // Runtime Polymorphism
        if (type == 1)
            account = new SavingsAccount(accNo, name, balance);
        else
            account = new CurrentAccount(accNo, name, balance);

        int choice;
        do {
            System.out.println("\n1.Deposit\n2.Withdraw\n3.Check Balance\n4.Display Details\n5.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Amount: ");
                    account.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Amount: ");
                    account.withdraw(sc.nextDouble());
                    break;
                case 3:
                    new BankOperations().checkBalance(account);
                    break;
                case 4:
                    account.displayDetails();
                    break;
            }
        } while (choice != 5);

        FileHandler.saveAccount(account);
        System.out.println("Account Data Saved");
        sc.close();
    }
}
