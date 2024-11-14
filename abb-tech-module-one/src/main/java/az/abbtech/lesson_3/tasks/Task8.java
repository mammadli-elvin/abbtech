package az.abbtech.lesson_3.tasks;

//TODO:
// + Write a Java program to sort in ascending and descending order by the length of the given array of strings.
//      Sample Output:
//      Original unsorted colors: [Green, White, Black, Pink, Orange, Blue, Champagne, Indigo, Ivory]
//      Sorted color (descending order): [Champagne, Orange, Indigo, Green, White, Black, Ivory, Pink, Blue]
//      Sorted color (ascending order): [Pink, Blue, Green, White, Black, Ivory, Orange, Indigo, Champagne]

public class Task8 {
    public static void main(String[] args) {
        String[] arr = {"Green", "White", "Black", "Pink", "Orange", "Blue", "Champagne", "Indigo", "Ivory"};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) { //descending Bubble Sort
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].length() < arr[j + 1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        StringBuilder builderDesc = new StringBuilder("Sorted color (descending order): ");
        for (int i = 0; i < arr.length; i++) {
            builderDesc.append(arr[i].concat(", "));
        }
        System.out.println(builderDesc.toString());


        for (int i = 0; i < n - 1; i++) { //ascending Bubble Sort
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        StringBuilder builderAsc = new StringBuilder("Sorted color (ascending order): ");
        for (int i = 0; i < arr.length; i++) {
            builderAsc.append(arr[i].concat(", "));
        }
        System.out.println(builderAsc.toString());
    }
}
