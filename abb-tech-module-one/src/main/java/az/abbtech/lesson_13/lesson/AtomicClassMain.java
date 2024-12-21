package az.abbtech.lesson_13.lesson;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class AtomicClassMain {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            raceCondition();
        }
    }

    public static void raceCondition() throws InterruptedException {
        Counter result = new Counter();
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
                .parallel()
                .forEach((value) -> executorService.execute(() -> result.incrementAndPrint()));
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println("Result: " + result.counter);
    }
}

class Counter {
    public AtomicInteger counter;

    public void incrementAndPrint() {
        int i = counter.incrementAndGet();
        System.out.print(i + "  ");
    }

}
