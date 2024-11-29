package az.abbtech.lesson_7.equals;

public class Box {
    private String color;
    private double size;

    public Box(String color, double size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object instanceof Box box) {            return this.getColor().equals(box.getColor()) && this.getSize() == box.getSize();
        }
        return false;
    }


}
