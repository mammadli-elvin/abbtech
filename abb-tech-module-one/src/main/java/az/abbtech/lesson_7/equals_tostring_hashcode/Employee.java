package az.abbtech.lesson_7.equals_tostring_hashcode;

public class Employee {
    private String name;
    private String surname;
    private int age;

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Employee emp) {
            boolean isEquals = this.name.equalsIgnoreCase(emp.getName())
                    && this.surname.equalsIgnoreCase(emp.getSurname())
                    && this.age == emp.getAge();
            return isEquals;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.surname.hashCode() + this.age;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }
}
