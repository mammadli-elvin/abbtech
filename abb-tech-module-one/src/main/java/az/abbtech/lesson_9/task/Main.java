package az.abbtech.lesson_9.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put("Elvin", new Student("Elvin", 23, 29, 22));
        studentMap.put("Kerim", new Student("Kerim", 26, 22, 29));
        studentMap.put("Arif", new Student("Arif", 30, 21, 30));
        studentMap.put("Tofik", new Student("Tofik", 29, 20, 26));
        studentMap.put("Adil", new Student("Adil", 15, 31, 30));

        // Convert Map values to List
        List<Student> studentList = new ArrayList<>(studentMap.values());

        //Sort using Comparable interface
        Collections.sort(studentList);
        System.out.println("Students sorted by total grades (descending):");
        for (Student student : studentList) {
            System.out.println(student);
        }

        System.out.println("\n=============\n");

        // Sort using an anonymous Comparator class
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Collections.sort(studentList, comparator);

        System.out.println("Students sorted alphabetically by name:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
