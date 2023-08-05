package Java;


import java.util.Scanner;

public class Lesson_2_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sizin soyadiniz nedir?");
        String surname= scanner.nextLine();
        System.out.println("Sizin dogum tarixiniz?");
        int year= scanner.nextInt();
        System.out.println("Soyadiniz  " + surname +" il " + year);


    }
    }

