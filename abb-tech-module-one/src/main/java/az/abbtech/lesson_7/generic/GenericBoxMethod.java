package az.abbtech.lesson_7.generic;

public class GenericBoxMethod {
    public <V, T extends Number> V getValue(T[] tValue, V[] vValue) {
        return vValue[0];
    }
}
