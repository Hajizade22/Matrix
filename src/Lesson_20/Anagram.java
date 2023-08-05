package Lesson_20;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sözü daxil edin:");
        String first = scanner.nextLine();
        System.out.println("Birinci söz \"" + first + "\" olaraq seçildi.");
        System.out.print("İkinci sözü daxil edin:");
        String second = scanner.nextLine();
        System.out.println("İkinci söz \"" + second + "\" olaraq seçildi.");
        scanner.close();


        boolean isAnagram = TwoAnagramWord(first.toLowerCase(), second.toLowerCase());

        if (isAnagram) {
            System.out.println("\"" + first + "\" ve \"" + second + "\"  anagramdırlar");
        } else {
            System.out.println("\"" + first + "\" ve \"" + second + "\"  anagram deyillər");
        }

    }

    static boolean TwoAnagramWord(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        char[] chars1 = first.toCharArray();
        char[] chars2 = second.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }
}
