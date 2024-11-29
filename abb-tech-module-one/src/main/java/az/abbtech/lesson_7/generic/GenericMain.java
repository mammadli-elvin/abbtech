package az.abbtech.lesson_7.generic;

public class GenericMain {
    public <T, V extends Number> T generic(T[] tValue, V vValue) {
        System.out.println(tValue[0] + " " + vValue);
        return tValue[1];
    }

    public static void main(String[] args) {
        String[] strings = {"a", "b", "c"};
        Integer vValue = 5;
        GenericMain genericMain = new GenericMain();
        System.out.println(genericMain.generic(strings, vValue));
    }
}
