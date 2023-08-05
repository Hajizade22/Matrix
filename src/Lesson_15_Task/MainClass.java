package Lesson_15_Task;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        TaskClass taskClass = new TaskClass();
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        if(a==1) {
            taskClass.first();
        }
        else {
            taskClass.second();
//      taskClass.third();
        }
    }
}
