package az.abbtech.lesson_9.lesson;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class ComparableMain {
    public static void main(String[] args) {
        Student s1 = new Student("Ali", 21);
        Student s2 = new Student("Vali", 22);
        Student s3 = new Student("John", 23);
        Student s4 = new Student("Shakir", 24);
        Student s5 = new Student("Akif", 25);
        Student s6 = new Student("Mammad", 26);
        Student s7 = new Student("Azer", 27);

        Queue<Student> students = new PriorityQueue<>();
        students.offer(s3);
        students.offer(s7);
        students.offer(s5);
        students.offer(s4);
        students.offer(s2);
        students.offer(s6);
        students.offer(s1);

        while (!students.isEmpty()) {
            System.out.println(students.poll());
        }


//        Set<Student> students = new TreeSet<>();
//        students.add(s3);
//        students.add(s1);
//        students.add(s4);
//        students.add(s2);
//
//        for (Student student : students) {
//            System.out.println(student);
//        }

//        Map<Student, Integer> students = new TreeMap<>();
//        students.put(s3, 3);
//        students.put(s7, 7);
//        students.put(s5, 5);
//        students.put(s4, 4);
//        students.put(s2, 2);
//        students.put(s6, 6);
//        students.put(s1, 1);
//
//        students.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
