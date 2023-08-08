package Lesson_4;

import java.util.Scanner;

public class HomeWorkAgain {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 100) + 1;
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zehmet olmasa reqem daxil edin");
        boolean b=true;
        while (b) {
            a = scanner.nextInt();
            if (a > random) {
                System.out.println("Daha kicik reqem daxil edin");
            } else if (a < random) {
                System.out.println("Daha boyuk reqem daxil edin");
            } else {
                b=false;
                System.out.println("Tebrikler");

            }
        }
    }
}
