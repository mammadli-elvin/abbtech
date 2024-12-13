package az.abbtech.lesson_8.task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Library {
    private final List<Book> BOOKS = new ArrayList<>();
    private final Queue<BorrowRequest> BORROW_REQUESTS = new LinkedList<>();
    private final Set<String> BORROWERS = new HashSet<>();

    private boolean isValidISBN(String isbn) {
        return isbn.matches("[0-9]{13}");   // ISBN-13 formats
    }

    private boolean checkBook(Book book) {
        if (book.getTitle() == null || book.getAuthor() == null || book.getISBN() == null) {
            System.out.println("Book details cannot be null.");
            return false;
        }
        if (!isValidISBN(book.getISBN())) {
            System.out.println("Invalid ISBN format: " + book.getISBN());
            return false;
        }
        return true;
    }

    public boolean addBook(Book book) {
        if (!checkBook(book)) {
            return false;
        }
        for (Book element : BOOKS) {
            if (element.getISBN().equals(book.getISBN())) {
                System.out.println("Book with this ISBN already exists in the library: " + book.getISBN());
                return false;
            }
        }
        BOOKS.add(new Book(book.getTitle(), book.getAuthor(), book.getISBN()));
        return true;
    }

    public boolean returnBook(String borrowerName, Book book) {
        if (BORROWERS.contains(borrowerName) && checkBook(book)) {
            BORROWERS.remove(borrowerName);
            addBook(book);
            System.out.println(borrowerName + " has returned the book with ISBN: " + book.getISBN());
            return true;
        } else {
            System.out.println("Borrower " + borrowerName + " does not have an active borrow.");
            return false;
        }
    }

    public void listBooks() {
        if (BOOKS.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : BOOKS) {
                System.out.println(book);
            }
        }
    }

    public boolean addBorrowRequest(String borrowerName, String bookISBN) {
        if (borrowerName == null || bookISBN == null) {
            System.out.println("Borrower name and book ISBN cannot be null.");
            return false;
        }
        if (!isValidISBN(bookISBN)) {
            System.out.println("Invalid ISBN format: " + bookISBN);
            return false;
        }
        boolean bookExists = false;
        for (Book book : BOOKS) {
            if (book.getISBN().equals(bookISBN)) {
                bookExists = true;
                break;
            }
        }
        if (!bookExists) {
            System.out.println("Book with ISBN " + bookISBN + " does not exist in the library.");
            return false;
        }
        BORROW_REQUESTS.offer(new BorrowRequest(borrowerName, bookISBN));
        return true;
    }

    public void processRequest() {
        if (BORROW_REQUESTS.isEmpty()) {
            System.out.println("No borrow requests to process.");
            return;
        }

        BorrowRequest request = BORROW_REQUESTS.poll();
        Book bookToBorrow = null;

        for (Book book : BOOKS) {
            if (book.getISBN().equals(request.getBookISBN())) {
                bookToBorrow = book;
                break;
            }
        }

        if (bookToBorrow != null) {
            BOOKS.remove(bookToBorrow);
            BORROWERS.add(request.getBorrowerName());
            System.out.println(request.getBorrowerName() + " borrowed the book: " + bookToBorrow.getTitle());
        } else {
            System.out.println("Book with ISBN: " + request.getBookISBN() + " not found.");
        }
    }

    public void listBorrowers() {
        if (BORROWERS.isEmpty()) {
            System.out.println("No borrowers yet.");
        } else {
            System.out.println("Unique active Borrowers:");
            for (String borrower : BORROWERS) {
                System.out.println(borrower);
            }
        }
    }
}
