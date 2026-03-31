import java.util.ArrayList;

// Book class
class Book {
    String title;
    String author;
    String ISBN;

    // Constructor
    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Method to display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println();
    }
}

// Library class
class Library {
    ArrayList<Book> books = new ArrayList<>();

    // Add a new book
    void addBook(Book b) {
        books.add(b);
        System.out.println("Book added successfully.");
    }

    // Remove a book by ISBN
    void removeBook(String ISBN) {
        boolean found = false;

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).ISBN.equals(ISBN)) {
                books.remove(i);
                System.out.println("Book removed successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }

    // Display all books
    void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Available Books:");
            for (Book b : books) {
                b.display();
            }
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Library lib = new Library();

        // Adding books
        lib.addBook(new Book("Java Programming", "James Gosling", "111"));
        lib.addBook(new Book("C++ Basics", "Bjarne Stroustrup", "222"));

        // Display books
        lib.displayBooks();

        // Remove a book
        lib.removeBook("111");

        // Display again
        lib.displayBooks();
    }
}