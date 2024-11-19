package az.abbtech.lesson_4.tasks.task2;

public class Counter {
    public static int instanceCount;

    {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}
