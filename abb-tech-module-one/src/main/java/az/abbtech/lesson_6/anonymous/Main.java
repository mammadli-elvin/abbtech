package az.abbtech.lesson_6.anonymous;

public class Main extends AbstractAnonymous {

    AbstractAnonymous anonymous = null;

    @Override
    public void doAddition(String name, int a, int b) {
        if (name.equals("a")) {
            a = 4;
        } else if (name.equals("b")) {
            b = 5;
        }
        doPrint(a + b);
    }

    public void doPrint(int result) {
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.doAddition("a", 1, 2);

        AnonymousInterface anonymousInterface = new AnonymousInterface() {

            @Override
            public void doSomething() {
                System.out.println("doSomething");
            }
        };

        anonymousInterface.doSomething();

        new AbstractAnonymous() {

            @Override
            public void doAddition(String name, int a, int b) {

            }
        };
    }
}
