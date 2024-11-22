package az.abbtech.lesson_4;

public enum DayOfWeek {
    // field
    // method
    // constructor

    MONDAY(1) {
        @Override
        public void printOrderOfWeek() {
            System.out.println("Order of Week is 1");
        }
    }, TUESDAY(2) {
        @Override
        public void printOrderOfWeek() {
            System.out.println("Order of Week is 2");
        }
    }, WEDNESDAY(3) {
        @Override
        public void printOrderOfWeek() {
            System.out.println("Order of Week is 3");
        }
    }, THURSDAY(4) {
        @Override
        public void printOrderOfWeek() {
            System.out.println("Order of Week is 4");
        }
    }, FRIDAY(5) {
        @Override
        public void printOrderOfWeek() {
            System.out.println("Order of Week is 5");
        }
    }, SATURDAY(6) {
        @Override
        public void printOrderOfWeek() {
            System.out.println("Order of Week is 6");
        }
    }, SUNDAY(7) {
        @Override
        public void printOrderOfWeek() {
            System.out.println("Order of Week is 7");
        }
    };

    private int order;

    private DayOfWeek(int order) {
        this.order = order;
    }

    public abstract void printOrderOfWeek();

    public int getOrder() {
        return order;
    }
}
