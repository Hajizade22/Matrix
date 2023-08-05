package Lesson_21;

import java.util.Scanner;

public class MainOfStudent {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Student student=new Student("Elmin", Grade.C);
        student.displayGrade();
        student.promoteStudent();
        System.out.println();
        System.out.println(Grade.PROMOTE);
        System.out.println();
        student.displayGrade();
        int bal= scanner.nextInt();

        Score score=new Score(bal);
        Grade convertedGrade=score.convertToGrade();
        Student student1=new Student("Ibrahim",convertedGrade);
        student1.displayGrade();


    }
}
