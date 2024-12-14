package az.abbtech.lesson_10.lesson.design_patterns.creational.abstract_factory.factory;

import az.abbtech.lesson_10.lesson.design_patterns.creational.abstract_factory.color.Blue;
import az.abbtech.lesson_10.lesson.design_patterns.creational.abstract_factory.color.Color;
import az.abbtech.lesson_10.lesson.design_patterns.creational.abstract_factory.shape.Rectangle;
import az.abbtech.lesson_10.lesson.design_patterns.creational.abstract_factory.shape.Shape;

public class RectangleBlueFactory implements AbstractFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }

    @Override
    public Color createColor() {
        return new Blue();
    }
}
