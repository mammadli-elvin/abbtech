package az.abbtech.lesson_9.lesson;

public class Student implements Comparable<Student> {
    private String name;
    private Integer age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Student && ((Student) obj).getName().equals(name) && ((Student) obj).getAge() == age;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public int compareTo(Student student) {
        return (this.age < student.age) ? -1 : ((this.age == student.age) ? 0 : 1);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
