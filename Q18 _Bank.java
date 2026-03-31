class Bank {
    final double interestRate = 5.0; // fixed rate

    double calculateInterest(double amount) {
        return (amount * interestRate) / 100;
    }
}

public class Main18 {
    public static void main(String[] args) {
        Bank b = new Bank();

        double interest1 = b.calculateInterest(10000);
        double interest2 = b.calculateInterest(20000);

        System.out.println("Interest 1: ₹" + interest1);
        System.out.println("Interest 2: ₹" + interest2);
    }
}