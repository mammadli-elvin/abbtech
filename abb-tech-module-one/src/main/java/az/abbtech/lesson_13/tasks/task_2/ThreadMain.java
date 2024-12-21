package az.abbtech.lesson_13.tasks.task_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        int maxCount = 8;

        Runnable runnable = () -> {
            for (int i = 1; i <= maxCount; i++) {
                synchronized (lock) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                    lock.notify(); // Notify the other thread
                    if (i < maxCount) {
                        try {
                            lock.wait(); // Wait unless it's the last iteration
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            System.out.println(Thread.currentThread().getName() + " interrupted.");
                            return;
                        }
                    }
                }
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Thread(runnable, "Thread 1"));
        executorService.execute(new Thread(runnable, "Thread 2"));
        executorService.shutdown();
    }

}
