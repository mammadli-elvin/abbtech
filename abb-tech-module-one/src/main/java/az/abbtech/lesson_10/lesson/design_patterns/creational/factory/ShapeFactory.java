package az.abbtech.lesson_10.lesson.design_patterns.creational.factory;

public class ShapeFactory {
    public static Shape getShape(ShapeType shapeType) {
        return switch (shapeType) {
            case CIRCLE -> new Circle();
            case RECTANGLE -> new Rectangle();
            case TRIANGLE -> new Triangle();
            default -> null;
        };
    }
}
