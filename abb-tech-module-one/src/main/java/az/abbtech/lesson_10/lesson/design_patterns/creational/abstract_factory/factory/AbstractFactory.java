package az.abbtech.lesson_10.lesson.design_patterns.creational.abstract_factory.factory;

import az.abbtech.lesson_10.lesson.design_patterns.creational.abstract_factory.color.Color;
import az.abbtech.lesson_10.lesson.design_patterns.creational.abstract_factory.shape.Shape;

public interface AbstractFactory {
    Shape createShape();
    Color createColor();
}
