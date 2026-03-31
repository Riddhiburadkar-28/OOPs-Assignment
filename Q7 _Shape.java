import java.util.Scanner;   

// Abstract class
abstract class Shape {

    // Abstract method
    abstract double calculate_area();

    // Concrete method
    void display_info() {
        System.out.println("This is a shape.");
    }
}

// Circle class
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double r) {
        radius = r;
    }

    // Implement abstract method
    double calculate_area() {
        return 3.14 * radius * radius;
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, breadth;

    // Constructor
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    // Implement abstract method
    double calculate_area() {
        return length * breadth;
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

        // Creating objects of subclasses
        Shape c = new Circle(r);
        Shape rec = new Rectangle(l, b);

        // Calling methods
        System.out.println("\n--- Circle ---");
        c.display_info();
        System.out.println("Area of Circle: " + c.calculate_area());

        System.out.println("\n--- Rectangle ---");
        rec.display_info();
        System.out.println("Area of Rectangle: " + rec.calculate_area());

        // ❌ Uncommenting below line will give error
        // Shape s = new Shape();  // Cannot instantiate abstract class
    }
}