package az.abbtech;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

//        forAndForEachDifference();

    }

    public static void forAndForEachDifference() {

        String[] arr = {"Hello", "How", "are", "you"};
        for(String str : arr) {
            str = str.toUpperCase();
        }
        System.out.println(Arrays.asList(arr));

        for(int i=0; i < arr.length; i++) {
            arr[i] = arr[i].toUpperCase();
        }
        System.out.println(Arrays.asList(arr));
    }
}
