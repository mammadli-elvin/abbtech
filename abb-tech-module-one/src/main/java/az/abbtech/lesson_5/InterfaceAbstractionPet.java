package az.abbtech.lesson_5;

public interface InterfaceAbstractionPet {
    public abstract void play();

    default void sayHello() {
        System.out.println("Hello World");
    }
}
