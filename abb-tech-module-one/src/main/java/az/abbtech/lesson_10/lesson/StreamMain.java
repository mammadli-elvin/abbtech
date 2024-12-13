package az.abbtech.lesson_10.lesson;

import az.abbtech.lesson_9.lesson.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("10");
        list.add("2");
        list.add("3");
        list.add("8");
        list.add("7");
        list.add("6");

//        Integer reduced = list.stream()
//                .map(Integer::parseInt)
//                .reduce(0, Integer::sum);
//        System.out.println("Reduced: " + reduced);
//
//        List<Student> students = list.stream()
//                .map(studentAge -> new Student("NameOfStudent", Integer.parseInt(studentAge)))
//                .sorted(Comparator.comparingInt(Student::getAge))
//                .toList();
//
//        boolean isExists = students.stream()
//                .anyMatch(student -> student.getAge() > 6);
//
//        System.out.println("IsExists: " + isExists);
//        System.out.println(students);


        Integer result = list.stream()
//                .filter(string -> string.equalsIgnoreCase("10"))
//                .filter(string -> {
//                    System.out.println("String is " + string);
//                    return string.equalsIgnoreCase("2");
//                })
                .map(s -> {
                    System.out.println("Inner the MAP String is " + s);
                    return Integer.valueOf(s);
                })
                .reduce(0, (x, y) -> x + y);
        System.out.println("Result is " + result);

        System.out.println("============================");


        List<Computer> computerList = List.of(
                new Computer("HP", List.of("A", "B", "C")),
                new Computer("Lenovo", List.of("D", "E", "F")),
                new Computer("Mac", List.of("G", "H", "I"))
                );


    }
}
