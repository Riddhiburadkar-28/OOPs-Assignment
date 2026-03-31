class BankingSystem {
    int balance = 1000;

    void withdraw(String name, int amount) {
        synchronized (this) {
            if (balance >= amount) {
                System.out.println(name + " withdrawing " + amount);
                balance -= amount;
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println(name + ": Insufficient balance");
            }
        }
    }

    public static void main(String[] args) {
        BankingSystem b = new BankingSystem();

        Thread t1 = new Thread(() -> b.withdraw("User1", 700));
        Thread t2 = new Thread(() -> b.withdraw("User2", 500));

        t1.start();
        t2.start();
    }
}