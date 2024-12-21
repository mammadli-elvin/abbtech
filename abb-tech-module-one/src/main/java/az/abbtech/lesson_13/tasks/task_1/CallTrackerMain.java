package az.abbtech.lesson_13.tasks.task_1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class CallTrackerMain {
    public static void main(String[] args) {
        CallTracker tracker = CallTracker.getInstance();
        tracker.increment();
        tracker.increment();

        System.out.println("Checking multithreaded call tracker: ");
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .parallel()
                .forEach((value) -> executorService.execute(tracker::increment));
        executorService.shutdown();

        try {
            if (!executorService.awaitTermination(5, java.util.concurrent.TimeUnit.SECONDS)) {
                System.err.println("Tasks did not finish in the expected time.");
            }
        } catch (InterruptedException e) {
            System.err.println("Executor interrupted: " + e.getMessage());
            Thread.currentThread().interrupt();
        }
    }
}
