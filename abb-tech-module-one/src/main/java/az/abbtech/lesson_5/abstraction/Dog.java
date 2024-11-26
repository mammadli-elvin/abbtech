package az.abbtech.lesson_5.abstraction;

public class Dog extends ClassAbstractionPet {
    public Dog(String name) {
        super(name);
    }

    @Override
    protected void eat() {
        System.out.println("Dog eat");
    }
}
