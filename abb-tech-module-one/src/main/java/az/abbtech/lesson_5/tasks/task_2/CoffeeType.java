package az.abbtech.lesson_5.tasks.task_2;

public enum CoffeeType {
    ESPRESSO {
        @Override
        public String getDescription() {
            return "A strong coffee shot.";
        }
    }, LATTE {
        @Override
        public String getDescription() {
            return "A smooth coffee with milk.";
        }
    }, CAPPUCCINO {
        @Override
        public String getDescription() {
            return "A rich and foamy coffee.";
        }
    };

    public abstract String getDescription();
}
