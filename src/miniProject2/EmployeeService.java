package miniProject2;
import java.util.*;
public class EmployeeService {

	private List<Employee> employees = FileUtil.load();

    public void addEmployee(Employee e) throws InvalidEmployeeException {
        for (Employee emp : employees) {
            if (emp.getId() == e.getId())
                throw new InvalidEmployeeException("Employee ID must be unique");
        }
        if (e.getSalary() <= 0)
            throw new InvalidEmployeeException("Salary must be positive");
        if (e.getDepartment().isEmpty())
            throw new InvalidEmployeeException("Department cannot be empty");

        employees.add(e);
        FileUtil.save(employees);
    }

    public void displayAll() {
        employees.forEach(System.out::println);
    }

    public Employee searchById(int id) {
        for (Employee e : employees)
            if (e.getId() == id) return e;
        return null;
    }

    public void updateSalary(int id, double salary) throws InvalidEmployeeException {
        if (salary <= 0)
            throw new InvalidEmployeeException("Salary must be positive");

        Employee e = searchById(id);
        if (e != null) {
            e.setSalary(salary);
            FileUtil.save(employees);
        }
    }

    public void deleteEmployee(int id) {
        employees.removeIf(e -> e.getId() == id);
        FileUtil.save(employees);
    }

    public void displaySorted() {
        employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);
    }

    public void displayDepartments() {
        Set<String> depts = new HashSet<>();
        for (Employee e : employees)
            depts.add(e.getDepartment());
        depts.forEach(System.out::println);
    }
}
