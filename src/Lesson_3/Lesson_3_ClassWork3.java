package Lesson_3;

import java.util.Scanner;

public class Lesson_3_ClassWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String b;
        switch (a) {
            case 1:
                b = "Yanvar";
                break;
            case 2:
                b = "Fevral";
                break;
            case 3:
                b = "Mart";
                break;
            case 4:
                b = "Aprel";
                break;
            case 5:
                b = "May";
                break;
            default:
                b = "sehv";


        }
        System.out.println(b + " ayidir");


    }
}
