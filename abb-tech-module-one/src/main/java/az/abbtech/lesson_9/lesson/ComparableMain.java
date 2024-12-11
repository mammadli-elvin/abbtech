package az.abbtech.lesson_9.lesson;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class ComparableMain {
    public static void main(String[] args) {
        Student s1 = new Student("Ali", 23);
        Student s2 = new Student("Vali", 24);
        Student s3 = new Student("John", 25);
        Student s4 = new Student("Shakir", 26);

//        Queue<Student> students = new PriorityQueue<>();
//        students.add(s3);
//        students.add(s1);
//        students.add(s4);
//        students.add(s2);
//
//        while (!students.isEmpty()) {
//            System.out.println(students.poll());
//        }

        /** List have its own insertion order (Comparable do not working?)
         *         List<Student> students = new LinkedList<>();
         *         students.add(s3);
         *         students.add(s1);
         *         students.add(s4);
         *         students.add(s2);
         *         for(Student student : students) {
         *             System.out.println(student);
         *         }
         */

        Set<Student> students = new TreeSet<>();
        students.add(s3);
        students.add(s1);
        students.add(s4);
        students.add(s2);

        for (Student student : students) {
            System.out.println(student);
        }


    }
}
