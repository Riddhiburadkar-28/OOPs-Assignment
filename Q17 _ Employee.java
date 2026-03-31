class Employee {
    String name;
    int id;
    static int employeeCount = 0;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
    }

    static void displayCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

public class Main17 {
    public static void main(String[] args) {
        new Employee("Amit", 1);
        new Employee("Riya", 2);
        new Employee("Rahul", 3);

        Employee.displayCount();
    }
}