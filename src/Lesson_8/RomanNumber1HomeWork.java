package Lesson_8;

import java.util.Scanner;

public class RomanNumber1HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        while (a > 0) {
            if (a >= 1000) {
                System.out.print("M");
                a -= 1000;
            } else if (a >= 900) {
                System.out.print("CM");
                a -= 900;
            } else if (a >= 500) {
                System.out.print("D");
                a -= 500;
            } else if (a >= 400) {
                System.out.print("CD");
                a -= 400;
            } else if (a >= 100) {
                System.out.print("C");
                a -= 100;
            } else if (a >= 90) {
                System.out.print("XC");
                a -= 90;
            } else if (a >= 50) {
                System.out.print("L");
                a -= 50;
            } else if (a >= 40) {
                System.out.print("XL");
                a -= 40;
            } else if (a >= 10) {
                System.out.print("X");
                a -= 10;
            } else if (a >= 9) {
                System.out.print("IX");
                a -= 9;
            } else if (a >= 5) {
                System.out.print("V");
                a -= 5;
            } else if (a >= 4) {
                System.out.print("IV");
                a -= 4;
            } else if (a>= 1) {
                System.out.print("I");
                a -= 1;
            }

        }
    }
}