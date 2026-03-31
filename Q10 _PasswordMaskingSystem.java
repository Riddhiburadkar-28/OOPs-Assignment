import java.util.Scanner;

class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        String masked = password.replaceAll(".(?=..)", "*");

        System.out.println("Masked Password: " + masked);
    }
}