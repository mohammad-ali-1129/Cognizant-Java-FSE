package EngineeringConcepts.EmployeeManagementSystem;

public class Main {

    public static void main(String[] args) {

        EmployeeManagement management = new EmployeeManagement(5);

        management.addEmployee(new Employee(101, "Ali", "Manager", 60000));
        management.addEmployee(new Employee(102, "Ahmed", "Developer", 50000));
        management.addEmployee(new Employee(103, "Sara", "Tester", 45000));

        System.out.println("\nEmployee Records");

        management.displayEmployees();

        System.out.println("\nSearching Employee");

        management.searchEmployee(102);

        System.out.println("\nDeleting Employee");

        management.deleteEmployee(102);

        System.out.println("\nUpdated Employee Records");

        management.displayEmployees();
    }
}