package az.abbtech.lesson_7.generic;

public class GenericMain {
    public static void main(String[] args) {
        Integer[] integerElements = {1, 2, 3, 4, 5};
        IntegerBox integerBox = new IntegerBox(integerElements);

        String[] stringElements = {"a", "b", "c"};
        StringBox stringBox = new StringBox(stringElements);


        GenericBox<Integer, Float> integerGenericBox = new GenericBox<>(integerElements, 5.4f);
        GenericBox<? extends String, ? super Number> stringGenericBox = new GenericBox<>(stringElements, 4.5);

        integerGenericBox.printElements();

        GenericBoxMethod genericBoxMethod = new GenericBoxMethod();
        genericBoxMethod.getValue(integerElements, stringElements);

    }
}
