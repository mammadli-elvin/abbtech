package az.abbtech.lesson_7.equals_tostring_hashcode;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Name", "surname", 50);
        Employee employee2 = new Employee("Old Name", "surname", 50);
        Employee employee3 = new Employee("New Name", "surname", 50);

        System.out.println(employee1.equals(employee2));

        System.out.println(employee1.toString() + " Hash code: " + employee1.hashCode());
        System.out.println(employee2.toString() + " Hash code: " + employee2.hashCode());
        System.out.println(employee3.toString() + " Hash code: " + employee3.hashCode());


    }
}
