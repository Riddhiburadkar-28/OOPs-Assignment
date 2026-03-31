import java.util.Scanner;

// Abstract class
abstract class Payment {
    abstract void pay(double amount);
}

// Subclass 1: Credit Card
class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

// Subclass 2: UPI
class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

// Subclass 3: Net Banking
class NetBankingPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Net Banking.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter amount to pay: ");
        double amount = sc.nextDouble();

        System.out.println("Choose Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Net Banking");

        int choice = sc.nextInt();

        Payment p;

        switch (choice) {
            case 1:
                p = new CreditCardPayment();
                break;
            case 2:
                p = new UPIPayment();
                break;
            case 3:
                p = new NetBankingPayment();
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        // Perform payment
        p.pay(amount);
    }
}