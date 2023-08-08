package Lesson_4;

import java.util.Scanner;

public class Lesson_4_for {
    // ctrl+alt+l= seliqeye salir
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 0;
        for (int i = 1; i <=a; i++) {
            b = b + i;
        }
        System.out.println(b);
    }
}


