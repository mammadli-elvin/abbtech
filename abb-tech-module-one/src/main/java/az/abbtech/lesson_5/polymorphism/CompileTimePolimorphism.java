package az.abbtech.lesson_5.polymorphism;

public class CompileTimePolimorphism {

    public void doOverload(Integer arg) {

    }

    public void doOverload(String arg) {

    }

    public static void main(String[] args) {
        CompileTimePolimorphism obj = new CompileTimePolimorphism();
        obj.doOverload(1);
        obj.doOverload("hello");
    }
}
