package az.abbtech.lesson_9.lesson;

public class TernaryOperators {
    public static void main(String[] args) {
        String input = "ABB TECH";
        System.out.println(isAbbTech(input));

    }

    public static boolean isAbbTech(String input) {
        return input.equalsIgnoreCase("ABB TECH") ? true : false;
    }
}
