package Lesson_20;

import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mirror = scanner.nextLine();
        StringBuffer stringBuffer=new StringBuffer(mirror);
        stringBuffer.reverse();
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder(mirror);
        stringBuilder.reverse();
        System.out.println(stringBuilder);


//        String name = "World!";
//        String reverse = "";
//        char mr;
//        for (int i = 0; i < name.length(); i++) {
//            mr = name.charAt(i);
//            reverse = mr + reverse;
//        }
//        {
//
//        }
//        System.out.println(reverse);
    }
}