// Abstract class
abstract class Employee {
    String name;
    int id;

    // Constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method
    abstract double calculateBonus();

    // Common method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Manager subclass
class Manager extends Employee {
    double salary;

    Manager(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    // Override calculateBonus()
    double calculateBonus() {
        return 0.20 * salary; // 20% bonus
    }
}

// Developer subclass
class Developer extends Employee {
    double salary;
    double projectIncentive;

    Developer(String name, int id, double salary, double projectIncentive) {
        super(name, id);
        this.salary = salary;
        this.projectIncentive = projectIncentive;
    }

    // Override calculateBonus()
    double calculateBonus() {
        return (0.10 * salary) + projectIncentive; // 10% + incentive
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Runtime Polymorphism
        Employee e1 = new Manager("Ravi", 101, 50000);
        Employee e2 = new Developer("Anita", 102, 40000, 5000);

        // Manager details
        System.out.println("Manager Details:");
        e1.display();
        System.out.println("Bonus: " + e1.calculateBonus());

        System.out.println();

        // Developer details
        System.out.println("Developer Details:");
        e2.display();
        System.out.println("Bonus: " + e2.calculateBonus());
    }
}