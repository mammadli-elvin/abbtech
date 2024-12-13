package az.abbtech.lesson_10.lesson;

import az.abbtech.lesson_9.lesson.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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

        Integer reduced = list.stream()
                .map(Integer::parseInt)
                .reduce(0, Integer::sum);
        System.out.println("Reduced: " + reduced);

        List<Student> students = list.stream()
                .map(studentAge -> new Student("NameOfStudent", Integer.parseInt(studentAge)))
                .sorted(Comparator.comparingInt(Student::getAge))
                .toList();

        boolean isExists = students.stream()
                .anyMatch(student -> student.getAge() > 6);

        System.out.println("IsExists: " + isExists);
        System.out.println(students);


    }
}
