package mini_project1;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class FileHandler {

	public static void saveAccount(BankAccount account) {
        try {
            BufferedWriter bw =
                new BufferedWriter(new FileWriter("data/accounts.txt", true));

            bw.write(account.getAccountNumber() + "," +
                     account.getAccountHolder() + "," +
                     account.getBalance());
            bw.newLine();
            bw.close();

        } catch (Exception e) {
            System.out.println("File Error");
        }
    }
}
