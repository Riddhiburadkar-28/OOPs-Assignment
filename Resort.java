import java.util.Scanner;

class Resort {
    int RNo;
    String Name;
    float Charges;
    int Days;
    float Amount;

    // Function to calculate Amount
    float Compute() {
        Amount = Days * Charges;
        if (Amount > 11000) {
            Amount = 1.02f * Amount; // 2% extra
        }
        return Amount;
    }

    // Function to take input
    void Getinfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Room Number: ");
        RNo = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Customer Name: ");
        Name = sc.nextLine();

        System.out.print("Enter Charges per Day: ");
        Charges = sc.nextFloat();

        System.out.print("Enter Number of Days: ");
        Days = sc.nextInt();
    }

    // Function to display output
    void DispInfo() {
        Compute();

        System.out.println("\n----- Resort Details -----");
        System.out.println("Room Number: " + RNo);
        System.out.println("Customer Name: " + Name);
        System.out.println("Charges per Day: " + Charges);
        System.out.println("Number of Days: " + Days);
        System.out.println("Total Amount: " + Amount);
    }

    // Main method
    public static void main(String[] args) {
        Resort r = new Resort();

        r.Getinfo();
        r.DispInfo();
    }
}