package mini_Project3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class DisplayStudents {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root",
					"Rizvi@123");

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM student");

			System.out.println("ID | Name");
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " | " + rs.getString("name"));
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
