package az.abbtech.lesson_5.abstraction;

public class Monkey extends ClassAbstractionPet {
    public Monkey(String name) {
        super(name);
    }

    @Override
    protected void eat() {
        System.out.println("Monkey eat");
    }
}
