package Lesson_12;

import java.util.Scanner;

public class StringAnalyzer2 {
    public static String isPalindrome(String str) {
        String pal = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            pal += str.charAt(i);
        }
        return pal;
    }
    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                count++;
        }
        return count;
    }
    public static boolean hasSubstring (String str, String substr){
    return str.contains(substr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pal = scanner.nextLine();
        Boolean palindrome = StringAnalyzer2.isPalindrome(pal).contains(pal); //??
        System.out.println(palindrome);
        int count = StringAnalyzer2.countVowels(pal.toLowerCase());
        System.out.println(count);
        String b= scanner.nextLine();
        String hasSubstr= String.valueOf(StringAnalyzer2.hasSubstring(pal,b));
        System.out.println(hasSubstr);

    }
    }

