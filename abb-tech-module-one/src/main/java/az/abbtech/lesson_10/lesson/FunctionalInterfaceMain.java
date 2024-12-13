package az.abbtech.lesson_10.lesson;

import az.abbtech.lesson_9.lesson.Student;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionalInterfaceMain {
    public static void main(String[] args) {
        Function<Integer, String> function = new Function<>() {

            @Override
            public String apply(Integer integer) {
                return "Hello Integer " + integer;
            }
        };
        System.out.println(function.apply(5));

        CustomFunctionalInterface<Student> studentCustomFunctionalInterface = new CustomFunctionalInterface<>() {
            @Override
            public void method(Student student) {
                System.out.println("Hello Student " + student);
            }
        };
        studentCustomFunctionalInterface.method(new Student("Name", 20));


        CustomFunctionalInterface<Student> studentCustomFunctionalInterface2 =
                (student) -> System.out.println("Hello Student " + student);

        studentCustomFunctionalInterface2.method(new Student("Name", 4));


        Consumer<Student> StudentConsumer = student -> System.out.println("Hello Student " + student);

        BiConsumer<Student, Double> studentBiConsumer = (student, doubleValue) -> {
            System.out.println("Hello Student " + student + " " + doubleValue);
        };

        studentBiConsumer.accept(new Student("Name", 20), 1.0);

    }

    public static void comparatorLambdaVersion() {
        Comparator<Student> comparator = (s1, s2) -> Integer.compare(s1.getAge(), s2.getAge());
    }
}
