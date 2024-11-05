package az.abbtech.lesson_1;

public class Lesson1 {

    public static void main(String[] args) {
        int i = 46;
        double d = 55.9;
        d = i;
        System.out.println("i=" + i);
        System.out.println("d=" + d);

        int i2 = 183;
        double d2 = 2024.9;
        i2 = (int) d2;
        System.out.println("i2=" + i2);
        System.out.println("d2=" + d2);
    }
}

//TODO:
// + Declare an int variable and a double variable.
// + Assign the int value to the double variable.
// + Print both variables and observe implicit typecasting.

//TODO:
// + Declare a double variable and an int variable.
// + Assign the double value to the int variable using explicit typecasting.
// + Print both variables and observe explicit typecasting

//TODO:
// + Upgrade Java version to 21 + . Use one of the IDE (IntelliJ(Recommended), Eclipse, Netbeans)