package Java;

import java.util.Scanner;

public class Lesson_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("Iki ededin cemi ");
        System.out.println(a+b);
        System.out.println("Iki ededin ferqi " +"\n"+ (a - b));
        System.out.println(a * b);
        System.out.println(a / b);
    }
}

