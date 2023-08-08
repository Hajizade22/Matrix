package Lesson_3;

import java.util.Scanner;

public class Lesson_3_ClassWork {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
                int a = scanner.nextInt();
                int b = scanner.nextInt();
         if (a>b){
             System.out.println("birinci boyukdur");
         } else if (a<b) {
             System.out.println("ikinci boyukdur");
         }
         else {
             System.out.println("hec biri");
         }
    }
}
