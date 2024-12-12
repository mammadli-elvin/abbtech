package az.abbtech.lesson_9.lesson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorMain {
    public static void main(String[] args) {
        Comparator<Student> studentComparator = new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        Student s1 = new Student("Ali", 21);
        Student s2 = new Student("Vali", 22);
        Student s3 = new Student("John", 23);
        Student s4 = new Student("Shakir", 24);
        Student s5 = new Student("Akif", 25);
        Student s6 = new Student("Mammad", 26);
        Student s7 = new Student("Azer", 27);

        Set<Student> students = new TreeSet<>(studentComparator);
        students.add(s3);
        students.add(s7);
        students.add(s5);
        students.add(s4);
        students.add(s2);
        students.add(s6);
        students.add(s1);

        for (Student student : students) {
            System.out.println(student);
        }


        // List -> Collections.sort()
//        List<Student> studentsList = new ArrayList<>();
//        studentsList.add(s3);
//        studentsList.add(s7);
//        studentsList.add(s5);
//        studentsList.add(s4);
//        studentsList.add(s2);
//        studentsList.add(s6);
//        studentsList.add(s1);
//
//        Collections.sort(studentsList, studentComparator);
//        for (Student student : studentsList) {
//            System.out.println(student);
//        }

    }
}
