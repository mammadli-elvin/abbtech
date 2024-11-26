package az.abbtech.lesson_5.encapsulation;

public class EncapsulationMain {
    public static void main(String[] args) {
        EmployeeEncapsulation emp = new EmployeeEncapsulation("NAME", 15);
        emp.setName("New name");
        emp.getAge();
        emp.getSalary();
    }
}
