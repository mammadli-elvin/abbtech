package az.abbtech.lesson_5;

public class AbstractionMain {
    public static void main(String[] args) {
        ClassAbstractionPet petCat = new Cat("Garfield");
        petCat.eat();

        InterfaceAbstractionPet interfaceCat = new Cat("Tom");
        interfaceCat.play();
    }
}
