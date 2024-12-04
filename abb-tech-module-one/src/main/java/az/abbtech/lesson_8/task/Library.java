package az.abbtech.lesson_8.task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Library {
    private final List<Book> books = new ArrayList<>();
    private final Queue<BorrowRequest> borrowRequests = new LinkedList<>();
    private final Set<String> borrowers = new HashSet<>();

    public boolean addBook(String title, String author, String isbn) {
        if (title == null || author == null || isbn == null) {
            System.out.println("Book details cannot be null.");
            return false;
        }
        books.add(new Book(title, author, isbn));
        return true;
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public boolean addBorrowRequest(String borrowerName, String bookISBN) {
        if (borrowerName == null || bookISBN == null) {
            System.out.println("Borrower name and book ISBN cannot be null.");
            return false;
        }
        borrowRequests.offer(new BorrowRequest(borrowerName, bookISBN));
        return true;
    }

    public void processRequest() {
        if (borrowRequests.isEmpty()) {
            System.out.println("No borrow requests to process.");
            return;
        }

        BorrowRequest request = borrowRequests.poll();
        Book bookToBorrow = null;

        for (Book book : books) {
            if (book.getISBN().equals(request.getBookISBN())) {
                bookToBorrow = book;
                break;
            }
        }

        if (bookToBorrow != null) {
            books.remove(bookToBorrow);
            borrowers.add(request.getBorrowerName());
            System.out.println(request.getBorrowerName() + " borrowed the book: " + bookToBorrow.getTitle());
        } else {
            System.out.println("Book with ISBN: " + request.getBookISBN() + " not found.");
        }
    }

    public void listBorrowers() {
        if (borrowers.isEmpty()) {
            System.out.println("No borrowers yet.");
        } else {
            System.out.println("Unique Borrowers:");
            for (String borrower : borrowers) {
                System.out.println(borrower);
            }
        }
    }
}
