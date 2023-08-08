package Lesson_3;

import java.util.Scanner;

public class Lesson_3_ClassWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a % 2 == 0 && a % 3 == 0) {
            System.out.println("bolunendir");
        } else if (a % 2 != 0 && a % 3 != 0) {
            System.out.println("bolunmeyendir");
        }
        else {
            System.out.println("Hec biri");

        }
    }
}