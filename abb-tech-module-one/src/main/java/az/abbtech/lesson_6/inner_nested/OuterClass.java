package az.abbtech.lesson_6.inner_nested;

public class OuterClass {

    public String instanceField;

    public static final Integer STATIC_FIELD = 10;

    public void instanceMethod() {
        System.out.println("instanceMethod");
        class localInnerClass {
            void localInstanceMethod() {
                instanceField = "instanceField";
            }
        }
    }

    public static void staticMethod() {
        System.out.println("staticMethod");
    }

    public OuterClass(String instanceField) {
        this.instanceField = instanceField;
    }

    public static class NestedClass {
        public String nestedInstanceField;

        public static final Integer NESTED_STATIC_FIELD = 10;

        public void innerInstanceMethod() {
            System.out.println("nestedInstanceMethod");
        }

        public static void innerStaticMethod() {
            System.out.println("nestedStaticMethod");
        }
    }


    public class InnerClass {

        public String innerInstanceField;

        public static final Integer INNER_STATIC_FIELD = 10;

        public void innerInstanceMethod() {
            System.out.println("innerInstanceMethod");

        }

        public static void innerStaticMethod() {
            System.out.println("innerStaticMethod");
        }

    }

}
