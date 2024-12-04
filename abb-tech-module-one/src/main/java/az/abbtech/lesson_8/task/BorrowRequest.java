package az.abbtech.lesson_8.task;

public class BorrowRequest {
    private final String borrowerName;
    private final String bookISBN;

    public BorrowRequest(String borrowerName, String bookISBN) {
        this.borrowerName = borrowerName;
        this.bookISBN = bookISBN;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    @Override
    public String toString() {
        return "BorrowRequest{" +
                "borrowerName='" + borrowerName + '\'' +
                ", bookISBN='" + bookISBN + '\'' +
                '}';
    }
}
