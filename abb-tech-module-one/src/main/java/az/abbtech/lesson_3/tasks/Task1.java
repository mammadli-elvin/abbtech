package az.abbtech.lesson_3.tasks;

//TODO:
// + Write a Java program to get the index of all the characters of the alphabet.

public class Task1 {
    public static void main(String[] args) {
        char a = 'a';
        char[] alphabet = new char[26];
        for(int i=0; i<=25; i++) {
            char ch = (char) (a+i);
            alphabet[i] = ch;
            System.out.println(alphabet[i] + " -> " + i);
        }
    }
}
