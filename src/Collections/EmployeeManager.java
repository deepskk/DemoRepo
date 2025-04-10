package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();

        // Adding 5 Employee objects
        list.add(new Employee(101, "John", 50000));
        list.add(new Employee(102, "Jane", 55000));
        list.add(new Employee(103, "Alex", 60000));
        list.add(new Employee(104, "John", 65000));
        list.add(new Employee(105, "Alice", 70000));

        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. View All Employees");
            System.out.println("2. Search Employee by ID");
            System.out.println("3. Delete Employee by ID");
            System.out.println("4. Update Employee Name by ID");
            System.out.println("5. Find Employees with Same Name");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- All Employees ---");
                    for (Employee emp : list) {
                        System.out.println(emp);
                    }
                    break;

                case 2:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for (Employee emp : list) {
                        if (emp.getId() == searchId) {
                            System.out.println("Employee Found: " + emp);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Employee not found.");
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    int delId = sc.nextInt();
                    Iterator<Employee> itr = list.iterator();
                    boolean deleted = false;
                    while (itr.hasNext()) {
                        Employee emp = itr.next();
                        if (emp.getId() == delId) {
                            itr.remove();
                            deleted = true;
                            System.out.println("Employee deleted.");
                            break;
                        }
                    }
                    if (!deleted) System.out.println("Employee not found.");
                    break;

                case 4:
                    System.out.print("Enter ID to update name: ");
                    int updateId = sc.nextInt();
                    boolean updated = false;
                    for (Employee emp : list) {
                        if (emp.getId() == updateId) {
                            System.out.print("Enter new name: ");
                            String newName = sc.next();
                            emp.setName(newName);
                            updated = true;
                            System.out.println("Name updated.");
                            break;
                        }
                    }
                    if (!updated) System.out.println("Employee not found.");
                    break;

                case 5:
                    System.out.print("Enter name to search: ");
                    String name = sc.next();
                    boolean matched = false;
                    for (Employee emp : list) {
                        if (emp.getName().equalsIgnoreCase(name)) {
                            System.out.println(emp);
                            matched = true;
                        }
                    }
                    if (!matched) System.out.println("No employees found with this name.");
                    break;

                case 6:
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
class Employee{
    private  int id;
    private String name;
    private  double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
