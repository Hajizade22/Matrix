package Lesson_4;

import java.util.Scanner;

public class Lesson_4_HomeWork {
    public static void main(String[] args) {
        int randMaxMin = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        int a=0 ; // minimum deyerden 1 vahid asagi
        System.out.println("Zehmet olmasa her hansi bir reqemi qeyd edin");
        while (a != randMaxMin) {
            a = scanner.nextInt();
            if (a > randMaxMin) {
                System.out.println("Daha kicik reqem daxil edin");
            } else if (a < randMaxMin) {
                System.out.println("Daha boyuk reqem daxil edin");
            } else {
                System.out.println("Tebrik edirik siz duzgun reqemi tapdiniz");
            }
        }
    }
}
