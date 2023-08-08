package Lesson_3;

import java.util.Scanner;

// istifade olunubdur. Movzu 1 if-else, Movzu 2 Relation operators ,Movzu 3 Logical operators ve movzu 5 ternary operators
public class Lesson_3_HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a < 0 || a > 100) {
            System.out.println("error");
        } else if (a > 90 && a <= 100) {
            System.out.println("Sizin imtahan neticeniz A");
        } else if (a > 80 && a <= 90) {
            System.out.println("Sizin imtahan neticeniz B");
        } else if (a > 70 && a <= 80) {
            System.out.println("Sizin imtahan neticeniz C");
        } else if (a > 60 && a <= 70) {
            System.out.println("Sizin imtahan neticeniz D");
        } else if (a >= 51 && a <= 60) {
            System.out.println("Sizin imtahan neticeniz E");
        } else {
            System.out.println("Sizin imtahan neticeniz F");
        }
        String b = (a >= 51&& a<=100) ? "kecdiniz" : "kesildiniz";
        System.out.println(b);

    }
}
