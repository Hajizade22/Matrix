package Java;

import java.util.Scanner;

public class Lesson_3_ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a == 0) {
            System.out.println("beraberdir 0");
        } else if (a > 0) {
            System.out.println("musbet eded");
        } else {
            System.out.println("menfi eded");
        }
    }
}

