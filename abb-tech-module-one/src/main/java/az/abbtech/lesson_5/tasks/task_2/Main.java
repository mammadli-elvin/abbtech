package az.abbtech.lesson_5.tasks.task_2;

public class Main {
    public static void main(String[] args) {
        CoffeeOrder order1 = new CoffeeOrder(CoffeeType.CAPPUCCINO, CoffeeSize.LARGE, 1);
        CoffeeOrder order2 = new CoffeeOrder(CoffeeType.LATTE, CoffeeSize.MEDIUM, 2);
        CoffeeOrder order3 = new CoffeeOrder(CoffeeType.ESPRESSO, CoffeeSize.SMALL, 3);

        System.out.println("ORDER 1:");
        order1.printOrderDetails();
        System.out.println("Total: $" + order1.calculateTotal() + "\n");

        System.out.println("ORDER 2:");
        order2.printOrderDetails();
        System.out.println("Total: $" + order2.calculateTotal() + "\n");

        System.out.println("ORDER 3:");
        order3.printOrderDetails();
        System.out.println("Total: $" + order3.calculateTotal());
    }
}
