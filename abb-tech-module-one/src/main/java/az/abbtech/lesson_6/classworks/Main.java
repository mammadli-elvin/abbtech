package az.abbtech.lesson_6.classworks;

public class Main {

    public static void main(String[] args) {
        new Vehicle() {
            @Override
            public void drive() {
                System.out.println("Drive");
            }

            @Override
            public void speedUp() {
                System.out.println("Speed up");
            }

            @Override
            public void stop() {
                System.out.println("Stop");
            }
        };

        new Drivable() {

            @Override
            public void drive() {
                System.out.println("Drive");
            }

            @Override
            public void speedUp() {
                System.out.println("Speed up");
            }

            @Override
            public void speedDown() {
                System.out.println("Speed down");
            }
        };
    }
}
