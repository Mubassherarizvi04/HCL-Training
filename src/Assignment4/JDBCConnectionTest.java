package Assignment4;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnectionTest {
	
	 public static void main(String[] args) {
		 
		 String url = "jdbc:mysql://localhost:3306/studentdb";
	        String user = "root";
	        String password = "Rizvi@123";

	        try {
	            Connection con = DriverManager.getConnection(url, user, password);

	            if (con != null) {
	                System.out.println("Connection Successful");
	            }

	            con.close();

	        } catch (Exception e) {
	            System.out.println("Unable to connect");
	            e.printStackTrace();
	        }
	    }
}
