package az.abbtech.lesson_10.lesson.design_patterns.creational.signleton;

public class SingletonPatternMain {
    public static void main(String[] args) {
//        HTTPClient singleton = HTTPClient.getInstance("host", 1521, "db_username", "password");
//        HTTPClient singleton2 = HTTPClient.getInstance("host", 1521, "db_username", "password");
//        HTTPClient singleton3 = HTTPClient.getInstance("host", 1521, "db_username", "password");
//
//        System.out.println(singleton.hashCode());
//        System.out.println(singleton2.hashCode());
//        System.out.println(singleton3.hashCode());

        Thread thread1 = new Thread(() -> {
            System.out.println(SingletonThreadSafe.getInstance().hashCode());
        });
        Thread thread2 = new Thread(() -> {
            System.out.println(SingletonThreadSafe.getInstance().hashCode());
        });
        Thread thread3 = new Thread(() -> {
            System.out.println(SingletonThreadSafe.getInstance().hashCode());
        });
        Thread thread4 = new Thread(() -> {
            System.out.println(SingletonThreadSafe.getInstance().hashCode());
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

//        SingletonBillPugh singletonBillPugh = SingletonBillPugh.getInstance();
//        SingletonBillPugh singletonBillPugh2 = SingletonBillPugh.getInstance();
//        SingletonBillPugh singletonBillPugh3 = SingletonBillPugh.getInstance();
//
//        System.out.println(singletonBillPugh.hashCode());
//        System.out.println(singletonBillPugh2.hashCode());
//        System.out.println(singletonBillPugh3.hashCode());

    }
}
