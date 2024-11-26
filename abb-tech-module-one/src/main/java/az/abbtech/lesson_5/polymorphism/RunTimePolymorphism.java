package az.abbtech.lesson_5.polymorphism;

import az.abbtech.lesson_5.abstraction.ClassAbstractionPet;

public class RunTimePolymorphism extends ClassAbstractionPet {

    public RunTimePolymorphism(String name) {
        super(name);
    }

    @Override
    protected void eat() {
        System.out.println("RuntimePolymorphism eat() method");
    }

    @Override
    public void sleep() {
        System.out.println("RunTimePolymorphism sleep() method");
    }

    public static void main(String[] args) {
        RunTimePolymorphism obj = new RunTimePolymorphism("Name");
        obj.sleep();
    }
}
