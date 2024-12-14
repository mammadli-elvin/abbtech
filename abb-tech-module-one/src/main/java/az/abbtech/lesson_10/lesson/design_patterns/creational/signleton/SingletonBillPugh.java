package az.abbtech.lesson_10.lesson.design_patterns.creational.signleton;

/**
 *  Singleton class inner class-in static field-i oldugundan yalniz getInstance()-dan sonra load olunacaq (Lazy installation)
 */

public final class SingletonBillPugh {
    private SingletonBillPugh(){}

    private static class SingletonBillPughHolder {
        private static final SingletonBillPugh instance = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return SingletonBillPughHolder.instance;
    }
}
