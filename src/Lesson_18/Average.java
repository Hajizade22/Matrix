package Lesson_18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            int e = scanner.nextInt();
            System.out.println((a * b * c * d * e) / 5);
            if (a < 0 || b < 0 || c < 0 || d < 0 || e < 0) {
                throw new NegativeNumberException("Menfi eded");
            }
        } catch (NegativeNumberException | NumberFormatException | InputMismatchException v) {
            System.out.println(v.getMessage());
        }

    }

}

