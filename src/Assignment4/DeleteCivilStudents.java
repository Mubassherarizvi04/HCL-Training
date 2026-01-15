package Assignment4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteCivilStudents {

	public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "Rizvi@123"
            );

            Statement stmt = con.createStatement();

            String deleteQuery =
                    "DELETE FROM Students WHERE year_of_passing = 2024 AND branch = 'Civil'";

            int rows = stmt.executeUpdate(deleteQuery);
            System.out.println(rows + " record(s) deleted");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
