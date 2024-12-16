package az.abbtech.lesson_12.lesson;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        Optional<String> value = Optional.of("Hello");  // Can not send null
        Optional.empty();
        Optional.ofNullable(null);  // Can send null
    }
}
