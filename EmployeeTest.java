import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeTest {
    public static void main(String[] args) {
        // Create and store employees in an ArrayList
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 75000));
        employees.add(new Employee("Bob", 25, 65000));
        employees.add(new Employee("Charlie", 28, 85000));
        employees.add(new Employee("Diana", 35, 80000));

        // Sort by salary (descending)
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e2.getSalary(), e1.getSalary()); // Descending
            }
        });

        System.out.println("Employees sorted by salary (descending):");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Sort by name (ascending)
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName()); // Ascending
            }
        });

        System.out.println("\nEmployees sorted by name (ascending):");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
