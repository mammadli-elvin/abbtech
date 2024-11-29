package az.abbtech.lesson_7.equals;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box("Red", 4);
        Box box2 = new Box("Blue", 3);
        Box box3 = new Box("Red", 4);
        System.out.println(box1.equals(box2));
        System.out.println(box1.equals(box3));
    }
}
