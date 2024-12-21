package az.abbtech.lesson_13.example;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerExample {
    private static final int CAPACITY = 5;
    private final Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        ProducerConsumerExample example = new ProducerConsumerExample();

        Thread producer = new Thread(() -> example.produce());
        Thread consumer1 = new Thread(() -> example.consume(), "Consumer1");
        Thread consumer2 = new Thread(() -> example.consume(), "Consumer2");

        producer.start();
        consumer1.start();
        consumer2.start();
    }

    private void produce() {
        int value = 0;
        while (true) {
            synchronized (queue) {
                while (queue.size() == CAPACITY) {
                    try {
                        System.out.println("Queue is full. Producer waiting...");
                        queue.wait();
                    } catch (InterruptedException exception) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("Produced: " + value);
                queue.add(value++);
                queue.notifyAll();
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private void consume() {
        while (true) {
            synchronized (queue) {
                while (queue.isEmpty()) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " waiting for items...");
                        queue.wait();
                    } catch (InterruptedException exception) {
                        Thread.currentThread().interrupt();
                    }
                }
                int value = queue.poll();
                System.out.println(Thread.currentThread().getName() + " consumed: " + value);
                queue.notifyAll();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
