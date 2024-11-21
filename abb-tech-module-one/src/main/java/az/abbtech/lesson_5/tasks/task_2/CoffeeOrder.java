package az.abbtech.lesson_5.tasks.task_2;

public class CoffeeOrder {
    private CoffeeType type;
    private CoffeeSize size;
    private int count;

    CoffeeOrder(CoffeeType type, CoffeeSize size, int count) {
        this.type = type;
        this.size = size;
        this.count = count;
    }

    public void printOrderDetails() {
        System.out.println("Coffee Type: " + type);
        System.out.println("Coffee Description: " + type.getDescription());
        System.out.println("Coffee Size: " + size);
        System.out.println("Coffee Price: $" + size.getPrice());
        System.out.println("Coffee Count: " + count);
    }

    public double calculateTotal() {
        return size.getPrice() * count;
    }

}
