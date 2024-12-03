package az.abbtech.lesson_7.generic;

public class GenericBox<T, V extends Number> {
    private final T[] elements;
    private final V value;

    public GenericBox(T[] elements, V value) {
        this.elements = elements;
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void printElements() {
        for (T element : elements) {
            System.out.println(element);
        }
    }
}
