package miniProject2;
import java.util.Scanner;
public class EmployeeApp {

	public static void main(String[] args) {

        if (!Login.authenticate()) {
            System.out.println("Invalid Login");
            return;
        }

        EmployeeService service = new EmployeeService();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("""
            1. Add Employee
            2. Display All Employees
            3. Search Employee by ID
            4. Update Employee Salary
            5. Delete Employee
            6. Display Sorted Employees
            7. Display Departments
            8. Exit
            """);

            choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1 -> service.addEmployee(
                            new Employee(sc.nextInt(), sc.next(),
                                    sc.nextDouble(), sc.next()));
                    case 2 -> service.displayAll();
                    case 3 -> System.out.println(service.searchById(sc.nextInt()));
                    case 4 -> service.updateSalary(sc.nextInt(), sc.nextDouble());
                    case 5 -> service.deleteEmployee(sc.nextInt());
                    case 6 -> service.displaySorted();
                    case 7 -> service.displayDepartments();
                }
            } catch (InvalidEmployeeException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 8);
        sc.close();
    }
}
