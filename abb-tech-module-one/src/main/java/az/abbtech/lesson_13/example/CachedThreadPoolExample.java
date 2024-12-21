package az.abbtech.lesson_13.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExample {

    public static void main(String[] args) {
        // Create a cached thread pool
        ExecutorService executorService = Executors.newCachedThreadPool();

        // Submit tasks to the executor service
        for (int i = 1; i <= 10; i++) {
            int taskNumber = i; // Capture the value of i for use in the tasks
            executorService.submit(() -> {
                System.out.println("Task1 " + taskNumber + " is running on thread: " + Thread.currentThread().getName());
                try {
                    // Simulate some work with Thread.sleep
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Restore interrupt status
                    System.err.println("Task1 " + taskNumber + " was interrupted.");
                }
                System.out.println("Task1 " + taskNumber + " completed.");
            });
        }

        // Shut down the executor service
        executorService.shutdown();
    }
}
