package az.abbtech.lesson_10.lesson.design_patterns.creational.abstract_factory.factory;

import az.abbtech.lesson_10.lesson.design_patterns.creational.abstract_factory.color.Color;
import az.abbtech.lesson_10.lesson.design_patterns.creational.abstract_factory.color.Red;
import az.abbtech.lesson_10.lesson.design_patterns.creational.abstract_factory.shape.Circle;
import az.abbtech.lesson_10.lesson.design_patterns.creational.abstract_factory.shape.Shape;

public class CircleRedFactory implements AbstractFactory {

    @Override
    public Shape createShape() {
        return new Circle();
    }

    @Override
    public Color createColor() {
        return new Red();
    }
}
