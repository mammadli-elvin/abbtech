package az.abbtech.lesson_5.abstraction;

public class Cat extends ClassAbstractionPet implements InterfaceAbstractionPet, InterfaceAbstractionPet2{

    private int age;

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println(super.name + "Cat eat");
    }

    @Override
    public void play() {
        System.out.println(super.name + " cat is playing");
    }

    @Override
    public void sayHello() {
        System.out.println("Abstraction in CAT");
    }
}
