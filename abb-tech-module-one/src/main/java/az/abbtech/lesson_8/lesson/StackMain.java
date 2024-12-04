package az.abbtech.lesson_8.lesson;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Element1");
        stack.push("Element2");
        stack.push("Element3");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
