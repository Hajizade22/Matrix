package Exam;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        if (a > 0) {
//            System.out.println("Musbet eded");
//        } else if (a < 0) {
//            System.out.println("Menfi eded");
//        } else {
//            System.out.println("sifir");
//        }
//        if (a > b) {
//            System.out.println("The first integer is greater than the second integer.");
//        } else {
//            System.out.println("The first integer is not greater than the second integer.");
//        }

        if (a%2==0 && a%3==0){
            System.out.println("The number is divisible by 2 and 3." );
        }
        else {
            System.out.println("The number is not divisible by both 2 and 3.");
        }
    }
}
