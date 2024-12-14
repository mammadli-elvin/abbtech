package az.abbtech.lesson_10.lesson.design_patterns.creational.abstract_factory;

import az.abbtech.lesson_10.lesson.design_patterns.creational.abstract_factory.factory.AbstractFactory;
import az.abbtech.lesson_10.lesson.design_patterns.creational.abstract_factory.factory.CircleRedFactory;
import az.abbtech.lesson_10.lesson.design_patterns.creational.abstract_factory.factory.FactoryProducer;
import az.abbtech.lesson_10.lesson.design_patterns.creational.abstract_factory.factory.RectangleBlueFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory circleRedFactory = new CircleRedFactory();
        FactoryProducer producer = new FactoryProducer(circleRedFactory);
        producer.render();

        AbstractFactory rectangleBlueFactory = new RectangleBlueFactory();
        FactoryProducer producer2 = new FactoryProducer(rectangleBlueFactory);
        producer2.render();
    }
}
