class FileProcessingSystem {
    public static void main(String[] args) {
        try {
            System.out.println("Reading file...");
            int data = 10 / 2; // simulate file read
        } catch (Exception e) {
            System.out.println("Error reading file");
        } finally {
            System.out.println("Closing file resources");
        }
    }
}