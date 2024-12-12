package az.abbtech.lesson_10.example;

public class Main {
    public static void main(String[] args) {
        CustomFunctionalInterface<String, String, Integer> customFunctionalInterface = (str1, str2) -> {
            return str1.concat(str2).length();
        };

        System.out.println(customFunctionalInterface.concatAndLength("Hello World", "Concatination"));
    }
}
