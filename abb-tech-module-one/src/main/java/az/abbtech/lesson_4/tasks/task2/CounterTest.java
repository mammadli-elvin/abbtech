package az.abbtech.lesson_4.tasks.task2;

public class CounterTest {
    public static void main(String[] args) {
        Counter[] counters = new Counter[100];
        for (Counter counter : counters) {
            counter = new Counter();
        }

        System.out.println("Count of instances = " + Counter.getInstanceCount());
    }
}
