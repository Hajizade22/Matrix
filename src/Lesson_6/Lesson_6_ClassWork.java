package Lesson_6;

import java.util.Scanner;

public class Lesson_6_ClassWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int value = 1;
        int[][] array = new int[a][b];
                for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = value;
                value++;
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (array[i][j] == c) {
                    System.out.println(i + " setr " +  j + " sutun");
                }

            }
        }
    }
}


