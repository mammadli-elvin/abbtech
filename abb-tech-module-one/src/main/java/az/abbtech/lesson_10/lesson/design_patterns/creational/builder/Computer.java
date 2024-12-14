package az.abbtech.lesson_10.lesson.design_patterns.creational.builder;

public class Computer {
    // Mandatory fields
    private String brand;
    private String model;

    // Optional fields
    private int ram;
    private int cpu;
    private int hardDisk;

    private Computer(ComputerBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.ram = builder.ram;
        this.cpu = builder.ram;
        this.hardDisk = builder.hardDisk;
    }

    public static ComputerBuilder builder(String brand, String model) {
        return new ComputerBuilder(brand, model);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", cpu=" + cpu +
                ", hardDisk=" + hardDisk +
                '}';
    }

    public static class ComputerBuilder {
        // Mandatory fields
        private String brand;
        private String model;

        // Optional fields
        private int ram;
        private int cpu;
        private int hardDisk;

        public ComputerBuilder(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        public ComputerBuilder withRam(int ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder withCpu(int cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder withHardDisk(int hardDisk) {
            this.hardDisk = hardDisk;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

}
