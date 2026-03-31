import java.util.Scanner;

class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance, withdraw;

        System.out.print("Enter account balance: ");
        balance = sc.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        withdraw = sc.nextDouble();

        try {
            if (withdraw > balance) {
                throw new Exception("Insufficient Balance");
            } else {
                balance -= withdraw;
                System.out.println("Withdrawal successful.");
                System.out.println("Remaining balance: " + balance);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}