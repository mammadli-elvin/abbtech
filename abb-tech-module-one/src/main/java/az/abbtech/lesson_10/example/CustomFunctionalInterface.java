package az.abbtech.lesson_10.example;

@FunctionalInterface
public interface CustomFunctionalInterface<T, U, R> {
    R concatAndLength(T t, U u);
}
