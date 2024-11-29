package az.abbtech.lesson_7.tasks.task_1;

public class Teacher extends Person {

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
