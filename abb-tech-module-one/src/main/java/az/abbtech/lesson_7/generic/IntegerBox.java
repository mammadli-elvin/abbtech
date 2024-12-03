package az.abbtech.lesson_7.generic;

public class IntegerBox {
    private final Integer[] elements;

    public IntegerBox(Integer[] elements) {
        this.elements = elements;
    }

    public void printElements() {
        for (Integer element : elements) {
            System.out.println(element);
        }

    }
}
