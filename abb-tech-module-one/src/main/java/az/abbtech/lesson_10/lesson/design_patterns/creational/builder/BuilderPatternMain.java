package az.abbtech.lesson_10.lesson.design_patterns.creational.builder;

public class BuilderPatternMain {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("HP", "Probook")
                .withCpu(16)
                .withRam(16)
                .withHardDisk(512)
                .build();
        System.out.println(computer);

        Computer computer2 = new Computer.ComputerBuilder("ASUS", "Zenbook")
                .build();
        System.out.println(computer2);


    }
}
