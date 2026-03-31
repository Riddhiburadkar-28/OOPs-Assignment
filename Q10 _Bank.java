interface Bank {
    double getInterestRate();
}

// SBI class
class SBI implements Bank {
    public double getInterestRate() {
        return 6.5;
    }
}

// HDFC class
class HDFC implements Bank {
    public double getInterestRate() {
        return 7.0;
    }
}

// ICICI class
class ICICI implements Bank {
    public double getInterestRate() {
        return 6.8;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Creating objects
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();

        // Display interest rates
        System.out.println("SBI Interest Rate: " + b1.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + b2.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + b3.getInterestRate() + "%");
    }
}