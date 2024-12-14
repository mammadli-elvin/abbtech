package az.abbtech.lesson_10.lesson.design_patterns.creational.prototype;

public class Circle extends Shape {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Circle clone() {
        Circle cloned = new Circle();
        cloned.radius = this.radius;
        cloned.setId(this.getId());
        cloned.setColor(this.getColor());
        cloned.setRadius(this.getRadius());
        return cloned;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color=" + getColor() +
                '}';
    }
}
