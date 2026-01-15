package assignment2;
import java.util.*;
import java.util.regex.Pattern;

interface EmployeeOperations {
    void addEmployee(Employee e);
    void displayEmployees();
    void searchEmployee(int empId);
    void removeEmployee(int empId);
}

// Employee class
class Employee {
    int empId;
    String name;
    String email;

    Employee(int empId, String name, String email) {
        this.empId = empId;
        this.name = name;
        this.email = email;
    }
}

// Implementation class using Map collections
class EmployeeManager implements EmployeeOperations {

    // HashMap supports null key and null value
    HashMap<Integer, Employee> hashMap = new HashMap<>();

    // Hashtable does NOT support null key/value
    Hashtable<Integer, Employee> hashTable = new Hashtable<>();

    // TreeMap does NOT support null key
    TreeMap<Integer, Employee> treeMap = new TreeMap<>();

    // Add employee
    public void addEmployee(Employee e) {
        hashMap.put(e.empId, e);
        hashTable.put(e.empId, e);
        treeMap.put(e.empId, e);
        System.out.println("Employee added successfully.");
    }

    // Display employees
    public void displayEmployees() {
        if (hashMap.isEmpty()) {
            System.out.println("No employee records available.");
            return;
        }

        System.out.println("\n--- Employees (HashMap) ---");
        for (Map.Entry<Integer, Employee> entry : hashMap.entrySet()) {
            Employee e = entry.getValue();
            System.out.println("ID: " + entry.getKey() +
                    ", Name: " + e.name +
                    ", Email: " + e.email);
        }

        System.out.println("\n--- Employees (TreeMap - Sorted by ID) ---");
        for (Map.Entry<Integer, Employee> entry : treeMap.entrySet()) {
            Employee e = entry.getValue();
            System.out.println("ID: " + entry.getKey() +
                    ", Name: " + e.name +
                    ", Email: " + e.email);
        }
    }

    // Search employee
    public void searchEmployee(int empId) {
        Employee e = hashMap.get(empId);
        if (e != null) {
            System.out.println("Employee Found:");
            System.out.println("ID: " + e.empId);
            System.out.println("Name: " + e.name);
            System.out.println("Email: " + e.email);
        } else {
            System.out.println("Employee not found.");
        }
    }

    // Remove employee
    public void removeEmployee(int empId) {
        if (hashMap.remove(empId) != null) {
            hashTable.remove(empId);
            treeMap.remove(empId);
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee ID not found.");
        }
    }

    // Demonstrate null key & null value support
    public void demonstrateNullSupport() {

        System.out.println("\n--- Null Support Demonstration ---");

        // HashMap allows one null key and multiple null values
        hashMap.put(null, new Employee(0, "NullKeyEmployee", "null@demo.com"));
        hashMap.put(999, null);

        System.out.println("HashMap allows null key & null value ✔");

        // Hashtable does NOT allow null
        try {
            hashTable.put(null, null);
        } catch (Exception e) {
            System.out.println("Hashtable does NOT allow null key/value ❌");
        }

        // TreeMap does NOT allow null key
        try {
            treeMap.put(null, new Employee(0, "Test", "test@test.com"));
        } catch (Exception e) {
            System.out.println("TreeMap does NOT allow null key ❌");
        }
    }
}



public class EmployeeManagementApp {
     
	
	// REGEX validation
    public static boolean validateName(String name) {
        return Pattern.matches("^[A-Za-z ]{3,20}$", name);
    }

    public static boolean validateEmail(String email) {
        return Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", email);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();
        int choice = 0;

        try {
            do {
                System.out.println("\n===== EMPLOYEE MANAGEMENT MENU =====");
                System.out.println("1. Add Employee");
                System.out.println("2. Display All Employees");
                System.out.println("3. Search Employee by ID");
                System.out.println("4. Remove Employee by ID");
                System.out.println("5. Demonstrate Null Support");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        System.out.print("Enter Employee ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Email: ");
                        String email = sc.nextLine();

                        if (!validateName(name)) {
                            System.out.println("Invalid Name!");
                            break;
                        }

                        if (!validateEmail(email)) {
                            System.out.println("Invalid Email!");
                            break;
                        }

                        manager.addEmployee(new Employee(id, name, email));
                        break;

                    case 2:
                        manager.displayEmployees();
                        break;

                    case 3:
                        System.out.print("Enter Employee ID to Search: ");
                        manager.searchEmployee(sc.nextInt());
                        break;

                    case 4:
                        System.out.print("Enter Employee ID to Remove: ");
                        manager.removeEmployee(sc.nextInt());
                        break;

                    case 5:
                        manager.demonstrateNullSupport();
                        break;

                    case 6:
                        System.out.println("Exiting program. Thank you!");
                        break;

                    default:
                        System.out.println("Invalid choice! Select 1–6.");
                }

            } while (choice != 6);

        } catch (Exception e) {
            System.out.println("Error: Invalid input!");
        } finally {
            sc.close();
        }
    }
}
