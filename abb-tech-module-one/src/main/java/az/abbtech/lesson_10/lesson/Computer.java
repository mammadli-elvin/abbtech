package az.abbtech.lesson_10.lesson;

import java.util.List;

public class Computer {
    private String computerName;
    private List<String> models;

    public Computer(String computerName, List<String> models) {
        this.computerName = computerName;
        this.models = models;
    }

    public String getComputerName() {
        return computerName;
    }

    public List<String> getModels() {
        return models;
    }
}
