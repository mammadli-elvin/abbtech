package az.abbtech.lesson_10.lesson.design_patterns.creational.abstract_factory.shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}
