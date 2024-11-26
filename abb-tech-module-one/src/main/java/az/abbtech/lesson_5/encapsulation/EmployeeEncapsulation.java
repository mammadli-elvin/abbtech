package az.abbtech.lesson_5.encapsulation;

public class EmployeeEncapsulation {
    private String name;
    private int age;
    private double salary;

    public EmployeeEncapsulation(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public EmployeeEncapsulation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() == 0) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
