package az.abbtech.lesson10.example;

@FunctionalInterface
public interface CustomFunctionalInterface<T, U, R> {
    R concatAndLength(T t, U u);
}
