package az.abbtech.lesson_8.task;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        System.out.println("Adding books to the library:");
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084"));
        library.addBook(new Book("1984", "George Orwell", "9780451524935"));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"));
        library.addBook(new Book("Duplicate ISBN Test", "Author Test", "9780061120084")); // Duplicate ISBN
        library.addBook(new Book("Invalid ISBN Test", "Author Test", "123456")); // Invalid ISBN

        System.out.println("\nListing all books in the library:");
        library.listBooks();


        System.out.println("\nAdding borrow requests:");
        library.addBorrowRequest("Elvin", "9780061120084");
        library.addBorrowRequest("Arif", "9780451524935");
        library.addBorrowRequest("Kerim", "9780000000000"); // Non-existent book
        library.addBorrowRequest("Tofik", "9780061120084"); // Already borrowed by Elvin


        System.out.println("\nProcessing borrow requests:");
        library.processRequest(); // Valid request
        library.processRequest(); // Valid request
        library.processRequest(); // Invalid request (non-existent book)
        library.processRequest(); // Invalid request (duplicate borrow)

        System.out.println("\nListing remaining books in the library:");
        library.listBooks();

        System.out.println("\nListing unique borrowers:");
        library.listBorrowers();

        // Return a book
        System.out.println("\nReturning a book:");
        library.returnBook("Elvin", new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084")); // Valid return
        library.returnBook("Arif", new Book("1984", "George Orwell", "9780451524935")); // Valid return
        library.returnBook("Kerim", new Book("Non-existent Book", "Fake Author", "9780000000000")); // Invalid return

        System.out.println("\nListing all books after returns:");
        library.listBooks();

        System.out.println("\nListing unique borrowers after returns:");
        library.listBorrowers();
    }
}
