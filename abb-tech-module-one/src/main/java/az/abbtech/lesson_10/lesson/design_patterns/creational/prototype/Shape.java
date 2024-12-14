package az.abbtech.lesson_10.lesson.design_patterns.creational.prototype;

public abstract class Shape implements Prototype {
    private int id;
    private String color;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public abstract Shape clone();
}
