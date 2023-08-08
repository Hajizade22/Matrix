package Lesson_4;

import java.util.Scanner;

public class Lesson_4_ClassWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        while (a < 0) {
            System.out.println("Musbet eded daxil edin");
            scanner.nextInt();
        }
    }
}



