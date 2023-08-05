package Lesson_8;

import java.util.Scanner;

public class RomanNumber2HomeWork {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String romanNumeral = scanner.nextLine();
        int sum = romanToInt(romanNumeral);
        System.out.println(sum);
    }

    public static int romanToInt(String s) {
        int result = 0;
        int a = s.length();
        for (int i = 0; i < a; i++) {
            switch (s.charAt(i)) {
                case 'I':
                    if (i < a - 1 && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')) {
                        result -= 1;
                    } else {
                        result += 1;
                    }
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    if (i < a - 1 && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')) {
                        result -= 10;
                    } else {
                        result += 10;
                    }
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    if (i < a - 1 && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')) {
                        result -= 100;
                    } else {
                        result += 100;
                    }
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
            }
        }
        return result;
    }
}