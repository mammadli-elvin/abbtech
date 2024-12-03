package az.abbtech.lesson_8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        arrayList();
//        linkedList();
//        stack();
        priorityQueue();
    }

    public static void arrayList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (Integer i : list) {
            System.out.println(i);
        }
    }

    public static void linkedList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Python");
        list.add("C++");
        while(list.iterator().hasNext()) {
            System.out.println(list.iterator().next());
        }
    }

    public static void stack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.add(3);
        stack.push(4);
        stack.add(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    public static void priorityQueue() {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(1);
        queue.offer(7);
        queue.add(2222);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }

    public static void hashSet() {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        for(Integer i : set) {
            System.out.println(i);
        }
    }

}
