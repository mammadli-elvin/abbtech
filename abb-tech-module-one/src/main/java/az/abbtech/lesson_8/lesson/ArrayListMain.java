package az.abbtech.lesson_8.lesson;

import az.abbtech.lesson_7.equals_tostring_hashcode.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        String[] stringArray = new String[10];
        stringArray[0] = "Hello";


        List<String> strings = new ArrayList<>();

        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee("John", "Smith", 1990);
        Employee employee2 = new Employee("John", "Smith", 1990);
        employees.add(employee1);
        employees.add(employee2);

        System.out.println("Is employees equals : " + employee1.equals(employee2));


        strings.add("World");
        strings.add("Java");
        strings.add("Python");
        strings.add("World");
        strings.remove(3);

        System.out.println(strings.size());

        System.out.println(strings.isEmpty());
        System.out.println("Is Exists: " + strings.contains("World"));

        // 1.
        for (int i=0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

        // 2.
        for (String element : strings) {
            System.out.println(element);
        }

        // 3.
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
