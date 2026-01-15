package Assignment4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class CreateAndInsertStudents {
	public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "Rizvi@123"
            );

            Statement stmt = con.createStatement();

            String createTable = "CREATE TABLE IF NOT EXISTS Students (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT," +
                    "name VARCHAR(50)," +
                    "branch VARCHAR(20)," +
                    "semester INT," +
                    "percentage DOUBLE," +
                    "year_of_passing INT)";

            stmt.executeUpdate(createTable);

            String insertData =
                    "INSERT INTO Students (name, branch, semester, percentage, year_of_passing) VALUES" +
                    "('Amit', 'CSE', 7, 78.5, 2025)," +
                    "('Neha', 'EC', 7, 72.0, 2025)," +
                    "('Rahul', 'Civil', 6, 65.0, 2024)";

            stmt.executeUpdate(insertData);

            System.out.println("Table created and records inserted successfully");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
	
}
