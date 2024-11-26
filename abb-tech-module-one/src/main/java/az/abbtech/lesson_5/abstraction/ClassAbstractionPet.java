package az.abbtech.lesson_5.abstraction;

public abstract class ClassAbstractionPet {
    protected abstract void eat();

    public String name;

    public ClassAbstractionPet(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println("Pet is sleeping");
    }
}
