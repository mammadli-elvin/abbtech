package az.abbtech.lesson_12.example;

import java.io.Serial;
import java.io.Serializable;

public class Room implements Serializable {
    @Serial
    private static final long serialVersionUID = 5704944393821375632L;

    private String name;
    private transient int capacity;     // transient keyword preserve from serializing
    private int number;
    private String description;

    public Room(String name, int capacity, int number, String description) {
        this.name = name;
        this.capacity = capacity;
        this.number = number;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + "\'" +
                ", capacity=" + capacity +
                ", number=" + number +
                ", description='" + description + '\'' +
                '}';
    }
}
