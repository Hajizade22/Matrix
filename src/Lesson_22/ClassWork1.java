package Lesson_22;

import java.util.Scanner;

public class ClassWork1 {
    public static int lengthOfLastWord(String word) {
        word = word.trim();
        int sonProbel = word.lastIndexOf(' ');
        String sonSoz = word.substring(sonProbel + 1);
        return sonSoz.length();
    }

    public static void main(String[] args) {
        String input = "Hello World";
        int uzunluq = lengthOfLastWord(input);
        System.out.println("Length of the last word: " + uzunluq);
    }
}
