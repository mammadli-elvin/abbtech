package az.abbtech.lesson_5.tasks.task_2;

public enum CoffeeSize {
    SMALL(2.5), MEDIUM(3.5), LARGE(4.5);

    private final double price;

    CoffeeSize(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
