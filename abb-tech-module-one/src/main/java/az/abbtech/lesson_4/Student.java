package az.abbtech.lesson_4;

public class Student {
    private String name;
    private int id;
    private int year;

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Initializer block");
    }

    public Student() {
    }

    public Student(String name, int id, int year) {
        this.name = name;
        this.id = id;
        this.year = year;
    }

    public void showStudentInfo() {
        showStudentInfo();
    }

    public String showStudentInfo(String name) {
        return name;
    }

    public String showStudentInfo(String name, int id) {
        return name + id;
    }

    public int showStudentInfo(int id) {
        return id;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.showStudentInfo();
    }
}
