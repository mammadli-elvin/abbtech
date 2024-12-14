package az.abbtech.lesson_10.lesson.design_patterns.creational.prototype;

public class PrototypePatternMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setId(1);
        circle.setColor("Red");
        circle.setRadius(5);

        Circle clonedCircle = (Circle) circle.clone();
        clonedCircle.setColor("Blue");
        System.out.println("Original Color: " + circle);
        System.out.println("Cloned Color: " + clonedCircle);

    }
}
