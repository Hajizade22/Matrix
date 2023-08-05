package Lesson_7;

import java.util.Scanner;

public class Car {
    Scanner scanner=new Scanner(System.in);


    String model;

    int motor;

    int doors;


    boolean manual;


    void start() {
        System.out.println("Ready to go");
    }

    int maxSpeed() {
        return 220;
    }

}
