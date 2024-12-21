package az.abbtech.lesson_13.tasks.task_1;

public class CallTracker {
    private static volatile CallTracker instance;
    private int counter; // Non-static to maintain instance state

    private CallTracker() {}

    public void increment() {
        System.out.println("Call count: " + ++counter);
    }

    public static CallTracker getInstance() {
        if (instance == null) { // skipping synchronization for performance reasons after the instance is created
            synchronized (CallTracker.class) {
                if (instance == null) { // for checking only one thread creates the instance
                    instance = new CallTracker();
                }
            }
        }
        return instance;
    }
}