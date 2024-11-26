package az.abbtech.lesson_6.tasks.task_2;

public class InnerMain {

    public static void main(String[] args) {
        House.Room room = new House().new Room();
        room.describeRoom();
    }
}
