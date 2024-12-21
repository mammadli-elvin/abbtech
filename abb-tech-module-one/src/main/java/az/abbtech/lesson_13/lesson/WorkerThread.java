package az.abbtech.lesson_13.lesson;

public class WorkerThread extends Thread {
    SharedResources sharedResources;
    @Override
    public void run() {
        sharedResources = new SharedResources();
        sharedResources.doTask1();
        System.out.println("Worker thread started: " + Thread.currentThread().getName());
    }
}
