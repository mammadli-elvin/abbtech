package az.abbtech.lesson_7.generic;

public class StringBox {
    private final String[] elements;

    public StringBox(String[] elements) {
        this.elements = elements;
    }

    public void printElements() {
        for (String element : elements) {
            System.out.println(element);
        }

    }
}
