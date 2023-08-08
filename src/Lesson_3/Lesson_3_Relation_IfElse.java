package Lesson_3;

import java.util.Scanner;

public class Lesson_3_Relation_IfElse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        if (a == 0) {
            System.out.println("Beraberdir 0");
        } else if (a < 0) {
            System.out.println(" menfi eded");
        } else if (a > 0) {
            System.out.println("musbet eded");
        } else {
            System.out.println(" ");

        }
    }
}
