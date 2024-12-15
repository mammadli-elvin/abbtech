package az.abbtech.lesson_11.lesson;

public class ZeroDivideNotAllowedException extends RuntimeException {
    private String message;

    public ZeroDivideNotAllowedException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
