package az.abbtech.lesson_6.tasks.task_1;

public class AnonymousMain {
    public static void main(String[] args) {
        Animal animal = new Animal() {

            @Override
            public void makeSound() {
                System.out.println("The animal makes a sound");
            }
        };
        animal.makeSound();
    }
}
