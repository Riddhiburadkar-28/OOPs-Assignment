class Person {
    void role() {
        System.out.println("I am a person");
    }
}

class Employee extends Person {
    @Override
    void role() {
        System.out.println("I am an employee");
    }
}

class Manager extends Employee {
    @Override
    void role() {
        System.out.println("I am a manager");
    }
}

public class Main14 {
    public static void main(String[] args) {
        Person p;

        p = new Person();
        p.role();

        p = new Employee();
        p.role();

        p = new Manager();
        p.role(); // Runtime polymorphism
    }
}