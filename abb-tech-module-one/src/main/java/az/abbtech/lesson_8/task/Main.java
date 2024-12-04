package az.abbtech.lesson_8.task;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("To Kill a Mockingbird", "Harper Lee", "978-0061120084");
        library.addBook("1984", "George Orwell", "978-0451524935");
        library.addBook("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565");

        library.listBooks();

        // Add borrow requests (FIFO -> First In First Out)
        library.addBorrowRequest("Elvin", "978-0061120084");
        library.addBorrowRequest("Arif", "978-0451524935");
        library.addBorrowRequest("Kerim", "978-0000000000");
        library.addBorrowRequest("Tofik", "978-0061120084");


        library.processRequest(); // Valid
        library.processRequest(); // Valid
        library.processRequest(); // Invalid ISBN
        library.processRequest(); // Invalid ISBN because Elvin have already borrowed this book

        // List remaining books
        library.listBooks();

        // List borrowers
        library.listBorrowers();
    }
}
