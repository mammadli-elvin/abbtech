package az.abbtech.lesson_6.inner_nested;

public class InnerClassMain {

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass("instanceField");
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        OuterClass.NestedClass nestedClass = new OuterClass.NestedClass();
    }

}
