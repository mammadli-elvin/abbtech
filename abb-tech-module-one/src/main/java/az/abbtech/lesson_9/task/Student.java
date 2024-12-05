package az.abbtech.lesson_9.task;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private final String name;
    private final Integer mathGrade, scienceGrade, englishGrade;


    public Student(String name, Integer mathGrade, Integer scienceGrade, Integer englishGrade) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        if (mathGrade < 0 || scienceGrade < 0 || englishGrade < 0) {
            throw new IllegalArgumentException("Grades cannot be negative");
        }
        this.name = name;
        this.mathGrade = mathGrade;
        this.scienceGrade = scienceGrade;
        this.englishGrade = englishGrade;
    }

    public String getName() {
        return name;
    }

    public Integer getMathGrade() {
        return mathGrade;
    }

    public Integer getScienceGrade() {
        return scienceGrade;
    }

    public Integer getEnglishGrade() {
        return englishGrade;
    }

    public int getTotalGrade() {
        return mathGrade + scienceGrade + englishGrade;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(other.getTotalGrade(), this.getTotalGrade());    // Descending order we changed the place of fields in parameter
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mathGrade=" + mathGrade +
                ", scienceGrade=" + scienceGrade +
                ", englishGrade=" + englishGrade +
                ", totalGrade=" + getTotalGrade() + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(getName(), student.getName()) && Objects.equals(getMathGrade(), student.getMathGrade()) && Objects.equals(getScienceGrade(), student.getScienceGrade()) && Objects.equals(getEnglishGrade(), student.getEnglishGrade());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMathGrade(), getScienceGrade(), getEnglishGrade());
    }
}
