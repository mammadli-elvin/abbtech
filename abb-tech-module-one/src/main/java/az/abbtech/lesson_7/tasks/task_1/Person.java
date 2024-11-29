package az.abbtech.lesson_7.tasks.task_1;

import java.util.Objects;

public abstract class Person {
    private static int uniqueIdCounter = 1;
    private final int id;

    private String name;
    private int age;

    public Person(String name, int age) { // field id is auto generating, that's why constructor without id parameter
        this.id = uniqueIdCounter++;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {   // Avoiding using of setter due to unique id
//        this.id = id;
//    }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getId() == person.getId() && getAge() == person.getAge() && Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAge());
    }
}
