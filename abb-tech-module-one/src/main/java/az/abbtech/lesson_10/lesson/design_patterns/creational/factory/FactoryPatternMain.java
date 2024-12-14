package az.abbtech.lesson_10.lesson.design_patterns.creational.factory;

public class FactoryPatternMain {
    public static void main(String[] args) {
        Shape rectangle = ShapeFactory.getShape(ShapeType.RECTANGLE);
        Shape triangle = ShapeFactory.getShape(ShapeType.TRIANGLE);
        Shape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
        Shape square = ShapeFactory.getShape(ShapeType.SQUARE); // null

        rectangle.draw();
        triangle.draw();
        circle.draw();
//        square.draw();
    }
}
