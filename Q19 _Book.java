class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println(title + " | " + author + " | ₹" + price);
    }
}

public class Main19 {
    public static void main(String[] args) {
        Book[] books = {
            new Book("Java Basics", "James Gosling", 500),
            new Book("Python Guide", "Guido", 400),
            new Book("Data Structures", "Mark", 600)
        };

        for (Book b : books) {
            b.display();
        }
    }
}