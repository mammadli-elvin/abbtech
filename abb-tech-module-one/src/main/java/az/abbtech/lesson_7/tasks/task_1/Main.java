package az.abbtech.lesson_7.tasks.task_1;

public class Main {
    public static void main(String[] args) {
        // Students
        Student student1 = new Student("Elvin", 22);
        Student student2 = new Student("Arif", 21);
        Student student3 = new Student("Tofik", 23);
        Student student4 = new Student("Kerim", 20);

        // Teachers
        Teacher teacher1 = new Teacher("Tofik", 32);
        Teacher teacher2 = new Teacher("Kerim", 40);

        // Storage
        GenericStorage<Student> studentStorage = new GenericStorage<>(4);
        GenericStorage<Teacher> teacherStorage = new GenericStorage<>();    // Default length = 10

        // Adding items
        studentStorage.addItem(student1);
        studentStorage.addItem(student2);
        studentStorage.addItem(student3);
        studentStorage.addItem(student4);

        teacherStorage.addItem(teacher1);
        teacherStorage.addItem(teacher2);

        // Display all
        System.out.println("All Students:");
        studentStorage.displayAllItems();

        System.out.println("\nAll Teachers:");
        teacherStorage.displayAllItems();

        System.out.println("\nRemoving one student and one teacher...");
        studentStorage.removeItem(student2);
        teacherStorage.removeItem(teacher1);

        // Display after removal
        System.out.println("\nAll Students:");
        studentStorage.displayAllItems();

        System.out.println("\nAll Teachers:");
        teacherStorage.displayAllItems();

        // Searching
        System.out.println("\nSearching by ID:");
        System.out.println(studentStorage.searchItemById(3)); // Should find Student 3
        System.out.println(teacherStorage.searchItemById(6)); // Should find Teacher 2

        System.out.println("\nSearching by Name:");
        System.out.println(studentStorage.searchItemByName("Elvin"));
        System.out.println(teacherStorage.searchItemByName("Kerim"));
    }
}
