package az.abbtech.lesson_12.lesson;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalGPT {
    public static void main(String[] args) {
//        Optional<String> emptyOptional = Optional.empty();
//        Optional<String> optional = Optional.of("Hello"); // if the value is null, throws NullPointerException
//        Optional<String> optionalNull = Optional.ofNullable(null); // No Exception
//
//        if (optional.isPresent()) {
//            System.out.println(optional.get()); // Prints the value if present
//        }
//
//        optional.ifPresent(System.out::println);
//
//        String value = optional.get();
//        String otherwise = optional.orElse("Default value");
//        String otherwiseGet = optional.orElseGet(() -> "Generated value");
//        String otherwiseThrow = optional.orElseThrow(IllegalArgumentException::new);

//        optionalMap();
//        optionalFlatMap();
//        optionalFilter();
//        chainingOperations();
        commonUseCases();
    }

    public static void optionalMap() {
        // Transforms the value inside the Optional if present:
        Optional<String> optional = Optional.of("Hello");
        Optional<Integer> length = optional.map(String::length);
        System.out.println(length.orElse(0));
    }

    public static void optionalFlatMap() {
//         Similar to map(), but used when the transformation also returns an Optional:
        Optional<String> optional = Optional.of("Hello");
        Optional<String> upperCase = optional.flatMap(value -> Optional.of(value.toUpperCase()));
        System.out.println(upperCase.orElse("Empty"));
    }

    public static void optionalFilter() {
        Optional<String> optional = Optional.of("Java");
        optional = optional.filter(value -> value.startsWith("J"));
        System.out.println(optional.orElse("Not Found"));
    }

    public static void chainingOperations() {
        String result = Optional.of("Java")
                .filter(value -> value.length() > 3)
                .map(String::toUpperCase)
                .orElse("Default");
        System.out.println(result);
    }

    public static void commonUseCases() {
        List<String> names = Arrays.asList("John", null, "Alice");
        names.stream()
                .map(name -> Optional.ofNullable(name).orElse("Unknown"))
                .forEach(System.out::println);
    }

}
