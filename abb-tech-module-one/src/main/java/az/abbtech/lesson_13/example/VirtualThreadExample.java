package az.abbtech.lesson_13.example;

public class VirtualThreadExample {
    public static void main(String[] args) {
        // Creating a virtual thread using Thread.ofVirtual().start()
        Thread virtualThread = Thread.ofVirtual().start(() -> {
            System.out.println("Hello from a virtual thread: " + Thread.currentThread());
        });

        // Creating multiple virtual threads using an ExecutorService
        try (var executor = java.util.concurrent.Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 10; i++) {
                int taskId = i;
                executor.submit(() -> {
                    System.out.println("Task1 " + taskId + " is running in: " + Thread.currentThread());
                });
            }
        } // The executor automatically shuts down when used in a try-with-resources block

        // Waiting for the first virtual thread to complete
        try {
            virtualThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All tasks completed!");
    }
}

