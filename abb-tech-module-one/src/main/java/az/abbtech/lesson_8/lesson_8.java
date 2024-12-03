package az.abbtech.lesson_8;

import java.util.Stack;

public class lesson_8 {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");

        stack.add("c");
        stack.add("d");
        stack.push("d");
        System.out.println(stack.pop());

    }
}
