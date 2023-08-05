package Exam;

import java.util.Scanner;

public class Lesson3_SwitchNext {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        if (0 > number || number > 100) {
            System.out.println("Error");
        } else if (91 <= number && number <= 100) {
            System.out.println("A");
        } else if (81 <= number && number <= 90) {
            System.out.println("B");
        } else if (71 <= number && number <= 80) {
            System.out.println("C");
        } else if (61 <= number && number <= 70) {
            System.out.println("D");
        }
        String exam;
        switch (number) {
            case 60, 59, 58, 57, 56, 55, 54, 53, 52, 51:
                exam = "E";
                break;
            default:
                exam = " ";
        }
        System.out.println(exam);

        String c = (number>=51)?"Imtahandan kecdiniz" : "Invalid";
        System.out.println(c);
    }

}