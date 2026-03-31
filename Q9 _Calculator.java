import java.util.Scanner;

class Calculator {

    // Method 1: add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: add two doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        // Input for two integers
        System.out.print("Enter two integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        // Input for three integers
        System.out.print("Enter three integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Input for two doubles
        System.out.print("Enter two decimal numbers: ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();

        // Calling overloaded methods
        System.out.println("\nSum of two integers: " + calc.add(x, y));
        System.out.println("Sum of three integers: " + calc.add(a, b, c));
        System.out.println("Sum of two doubles: " + calc.add(d1, d2));
    }
}