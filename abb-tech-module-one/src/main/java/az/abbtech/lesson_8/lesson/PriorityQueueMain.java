package az.abbtech.lesson_8.lesson;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueMain {
    public static void main(String[] args) {
        Queue<Double> doubles = new PriorityQueue<>();
        doubles.offer(2.14);
        doubles.offer(3.14);
        doubles.offer(4.14);
        doubles.offer(5.14);

        System.out.println(doubles.poll());
        System.out.println(doubles.peek());

    }
}
