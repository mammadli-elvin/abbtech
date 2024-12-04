package az.abbtech.lesson_8.lesson;

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Float> floats = new LinkedList<>();
        floats.add(1.3f);
        floats.add(1.4f);

        System.out.println(floats.get(1));
    }
}
