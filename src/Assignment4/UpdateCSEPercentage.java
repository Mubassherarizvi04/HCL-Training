package Assignment4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateCSEPercentage {
	 public static void main(String[] args) {
	        try {
	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/studentdb",
	                    "root",
	                    "Rizvi@123"
	            );

	            Statement stmt = con.createStatement();

	            String updateQuery =
	                    "UPDATE Students SET percentage = percentage + (percentage * 0.05) " +
	                    "WHERE branch = 'CSE'";

	            int rows = stmt.executeUpdate(updateQuery);
	            System.out.println(rows + " record(s) updated");

	            con.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
