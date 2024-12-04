package az.abbtech.lesson_8.lesson;

import az.abbtech.lesson_7.equals_tostring_hashcode.Employee;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain {
    public static void main(String[] args) {
        Set<Employee> employees = new HashSet();
        employees.add(new Employee("Name", "Surname", 20));
        employees.add(new Employee("Name", "Surname", 20));
        employees.add(new Employee("Name", "Surname", 23));
        System.out.println(employees);

    }
}
