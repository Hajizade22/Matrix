package Lesson_8;

import java.util.Scanner;

public class Lesson_8_ClassWork {
    public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);
    int x = scanner.nextInt();
    int sum=0;
    int qaliq;
    int temp;
    temp=x;

    while(x>0){
        qaliq=x%10;
        sum=(sum*10)+qaliq;
        x=x/10;
    }

    if (temp==sum){
        System.out.println("true");
    }
    else {
        System.out.println("false");
    }



    }

}
