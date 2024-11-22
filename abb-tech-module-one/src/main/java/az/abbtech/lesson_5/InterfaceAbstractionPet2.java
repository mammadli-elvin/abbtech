package az.abbtech.lesson_5;

public interface InterfaceAbstractionPet2 {
    public abstract void play();

    public static final String NAME = "Abstraction Pet";

    default void sayHello() {
        System.out.println("Hello World 2");
    }
}
