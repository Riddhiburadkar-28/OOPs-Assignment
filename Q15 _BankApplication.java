class BankApplication {

    static void processTransaction() throws Exception {
        throw new Exception("Transaction failed");
    }

    public static void main(String[] args) {
        try {
            processTransaction();
            System.out.println("Transaction processed");
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}