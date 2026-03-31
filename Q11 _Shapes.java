import java.util.Scanner;

// Base class
class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

// Subclass 1: Circle
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Subclass 2: Rectangle
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void area() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input for Circle
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        // Input for Rectangle
        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double b = sc.nextDouble();

        // Creating objects
        Circle c = new Circle(r);
        Rectangle rec = new Rectangle(l, b);

        // Calling methods
        System.out.println("\n--- Circle ---");
        c.display();
        c.area();

        System.out.println("\n--- Rectangle ---");
        rec.display();
        rec.area();
    }
}