package az.abbtech.lesson_10.lesson.design_patterns.creational.abstract_factory.factory;

import az.abbtech.lesson_10.lesson.design_patterns.creational.abstract_factory.color.Color;
import az.abbtech.lesson_10.lesson.design_patterns.creational.abstract_factory.shape.Shape;

public class FactoryProducer {
    private Shape shape;
    private Color color;

    public FactoryProducer(AbstractFactory factory) {
        this.shape = factory.createShape();
        this.color = factory.createColor();
    }

    public void render(){
        shape.draw();
        color.fill();
    }
}
