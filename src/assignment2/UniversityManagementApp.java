/*package assignment2;
import java.util.*;
import java.util.regex.Pattern;

// Interface
interface UniversityOperations {
    void addStudent(Student s);
    void displayStudents();
    void searchStudent(int id);
    void removeStudent(int id);
    void sortByMarks();
    void countCourseWise();
    void displayCourses(); 
}

// Student class
class Student{
    int id;
    String name; 
    String course;
    int marks;

    Student (int id, String name, String course, int marks) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }
}

// Implementation class
class UniversityManager implements UniversityOperations {

    // List & Vector
    List<Student> studentList = new ArrayList<>();
    Vector<Student> studentVector = new Vector<>();

    // Stack (history of added students)
    Stack<Student> studentStack = new Stack<>();

    // Set for unique courses
    Set<String> courseSet = new HashSet<>();

    // Maps
    HashMap<Integer, Student> studentMap = new HashMap<>();
    Hashtable<Integer, Student> studentTable = new Hashtable<>();

    // Add student
    public void addStudent(Student s) {

        if (studentMap.containsKey(s.id)) {
            System.out.println("Duplicate Student ID not allowed!");
            return;
        }

        studentList.add(s);
        studentVector.add(s);
        studentStack.push(s);
        studentMap.put(s.id, s);
        studentTable.put(s.id, s);
        courseSet.add(s.course);

        System.out.println("Student added successfully.");
    }

    // Display students
    public void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }

        System.out.println("\n--- Student Records ---");
        for (Student s : studentList) {
            System.out.println("ID: " + s.id +
                    ", Name: " + s.name +
                    ", Course: " + s.course +
                    ", Marks: " + s.marks);
        }
    }

    // Search student
    public void searchStudent(int id) {
        Student s = studentMap.get(id);
        if (s != null) {
            System.out.println("Student Found:");
            System.out.println("ID: " + s.id);
            System.out.println("Name: " + s.name);
            System.out.println("Course: " + s.course);
            System.out.println("Marks: " + s.marks);
        } else {
            System.out.println("Student not found.");
        }
    }

    // Remove student
    public void removeStudent(int id) {
        Student s = studentMap.remove(id);
        if (s != null) {
            studentList.remove(s);
            studentVector.remove(s);
            studentTable.remove(id);
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student ID not found.");
        }
    }

    // Sort students by marks
    public void sortByMarks() {
        studentList.sort(Comparator.comparingInt(st -> st.marks));
        System.out.println("Students sorted by marks.");
        displayStudents();
    }

    // Convert HashMap to TreeMap
    public void convertToTreeMap() {
        TreeMap<Integer, Student> treeMap = new TreeMap<>(studentMap);

        System.out.println("\n--- TreeMap (Sorted by Student ID) ---");
        for (Map.Entry<Integer, Student> entry : treeMap.entrySet()) {
            Student s = entry.getValue();
            System.out.println("ID: " + entry.getKey() +
                    ", Name: " + s.name +
                    ", Marks: " + s.marks);
        }
    }

    // Count students course-wise
    public void countCourseWise() {
        Map<String, Integer> countMap = new HashMap<>();

        for (Student s : studentList) {
            countMap.put(s.course, countMap.getOrDefault(s.course, 0) + 1);
        }

        System.out.println("\n--- Course-wise Student Count ---");
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Display all unique courses
    public void displayCourses() {
        System.out.println("\n--- Unique Courses ---");
        for (String course : courseSet) {
            System.out.println(course);
        }
    }
}

public class UniversityManagementApp {

	public static boolean validateName(String name) {
        return Pattern.matches("^[A-Za-z ]{3,20}$", name);
    }

    public static boolean validateCourse(String course) {
        return Pattern.matches("^[A-Za-z ]{2,15}$", course);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UniversityManager manager = new UniversityManager();
        int choice = 0;

        try {
            do {
                System.out.println("\n===== UNIVERSITY MANAGEMENT MENU =====");
                System.out.println("1. Add Student");
                System.out.println("2. Display All Students");
                System.out.println("3. Search Student by ID");
                System.out.println("4. Remove Student by ID");
                System.out.println("5. Sort Students by Marks");
                System.out.println("6. Convert HashMap to TreeMap");
                System.out.println("7. Count Students Course-wise");
                System.out.println("8. Display All Courses");
                System.out.println("9. Exit");
                System.out.print("Enter choice: ");

                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Course: ");
                        String course = sc.nextLine();

                        System.out.print("Enter Marks: ");
                        int marks = sc.nextInt();

                        if (!validateName(name) || !validateCourse(course)) {
                            System.out.println("Invalid Name or Course!");
                            break;
                        }

                        manager.addStudent(new Student(id, name, course, marks));
                        break;

                    case 2:
                        manager.displayStudents();
                        break;

                    case 3:
                        System.out.print("Enter ID to search: ");
                        manager.searchStudent(sc.nextInt());
                        break;

                    case 4:
                        System.out.print("Enter ID to remove: ");
                        manager.removeStudent(sc.nextInt());
                        break;

                    case 5:
                        manager.sortByMarks();
                        break;

                    case 6:
                        manager.convertToTreeMap();
                        break;

                    case 7:
                        manager.countCourseWise();
                        break;

                    case 8:
                        manager.displayCourses();
                        break;

                    case 9:
                        System.out.println("Exiting program. Thank you!");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } while (choice != 9);

        } catch (Exception e) {
            System.out.println("Error: Invalid input!");
        } finally {
            sc.close();
        }
    }
}*/
	