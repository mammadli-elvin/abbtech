package az.abbtech.lesson_13.lesson;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MultiThreadingMain {
    public static void main(String[] args) {
        SharedResources sharedResources = new SharedResources();

        Runnable runnableDoTask1 = () -> {
            System.out.println("Waiting for notify()");
            try {
                synchronized (sharedResources) {
                    sharedResources.wait();
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sharedResources.doTask1();
            System.out.println("doTask1 completed");
        };

        Runnable runnableDoTask2 = () -> {
            System.out.println("Task2 started");
            sharedResources.doTask2();
            System.out.println("doTask2 completed");
            synchronized (sharedResources) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                sharedResources.notify();
            }
        };

        Thread thread1 = new Thread(runnableDoTask1, "Thread1");
        Thread thread2 = new Thread(runnableDoTask2, "Thead2");

        thread1.start();
        thread2.start();

        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        executorService.execute(runnableDoTask1);
        executorService.close();

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(20);
        scheduledExecutorService.schedule(() -> {
            System.out.println("Scheduled tasks");
        }, 4, TimeUnit.SECONDS);
        scheduledExecutorService.close();

    }
}
