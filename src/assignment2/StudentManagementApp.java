package assignment2;
import java.util.*;
import java.util.regex.Pattern;


interface StudentOperations {
    void addStudent(Student s);
    void displayStudents();
    void removeStudent(int rollNo);
    void searchStudent(int rollNo);
}

// Student class
class Student {
    int rollNo;
    String name;
    String email;

    Student(int rollNo, String name, String email) {
        this.rollNo = rollNo;
        this.name = name;
        this.email = email;
    }
}

// Implementation class using collections
class StudentManager implements StudentOperations {

    // Using List (ArrayList implementation)
    List<Student> studentList = new ArrayList<>();

    // Using Vector collection
    Vector<Student> studentVector = new Vector<>();

    // Add student
    public void addStudent(Student s) {
        studentList.add(s);
        studentVector.add(s);
        System.out.println("Student added successfully.");
    }

    // Display students
    public void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\n--- Student Records ---");
        for (Student s : studentList) {
            System.out.println("Roll No: " + s.rollNo +
                               ", Name: " + s.name +
                               ", Email: " + s.email);
        }
    }

    // Remove student by roll number
    public void removeStudent(int rollNo) {
        Iterator<Student> it = studentList.iterator();
        boolean found = false;

        while (it.hasNext()) {
            Student s = it.next();
            if (s.rollNo == rollNo) {
                it.remove();
                studentVector.remove(s);
                found = true;
                System.out.println("Student removed successfully.");
                break;
            }
        }

        if (!found) {
            System.out.println("Student with Roll No " + rollNo + " not found.");
        }
    }

    // Search student by roll number
    public void searchStudent(int rollNo) {
        for (Student s : studentList) {
            if (s.rollNo == rollNo) {
                System.out.println("Student Found:");
                System.out.println("Roll No: " + s.rollNo);
                System.out.println("Name: " + s.name);
                System.out.println("Email: " + s.email);
                return;
            }
        }
        System.out.println("Student not found.");
    }
}


public class StudentManagementApp {

	public static boolean validateName(String name) {
        return Pattern.matches("^[A-Za-z ]{3,20}$", name);
    }

    public static boolean validateEmail(String email) {
        return Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", email);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int choice = 0;

        try {
            do {
                System.out.println("\n===== STUDENT MANAGEMENT MENU =====");
                System.out.println("1. Add Student");
                System.out.println("2. Display All Students");
                System.out.println("3. Remove Student by Roll No");
                System.out.println("4. Search Student by Roll No");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();
                sc.nextLine(); // clear buffer

                switch (choice) {

                    case 1:
                        System.out.print("Enter Roll Number: ");
                        int roll = sc.nextInt();
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

                        manager.addStudent(new Student(roll, name, email));
                        break;

                    case 2:
                        manager.displayStudents();
                        break;

                    case 3:
                        System.out.print("Enter Roll Number to Remove: ");
                        manager.removeStudent(sc.nextInt());
                        break;

                    case 4:
                        System.out.print("Enter Roll Number to Search: ");
                        manager.searchStudent(sc.nextInt());
                        break;

                    case 5:
                        System.out.println("Exiting Program. Thank you!");
                        break;

                    default:
                        System.out.println("Invalid choice! Choose between 1–5.");
                }

            } while (choice != 5);

        } catch (Exception e) {
            System.out.println("Error: Invalid input!");
        } finally {
            sc.close();
        }
    }
}
