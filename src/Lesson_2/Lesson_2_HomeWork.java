package Lesson_2;

import java.util.Scanner;

public class Lesson_2_HomeWork {
    public static void main(String[] args) {
        // double yerine floatda qoymaq olar lakin double daha cox istifade olunur deqiqliyine gore
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ev tapsirigi kesr kalkulyatoru");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        System.out.println("Butun reqemlerin cemi "+ (a+b+c+d));
        System.out.println("Bir ve ikincinin cemi "+ (a+b));
        System.out.println("Uc bol dord "+ (c/d));
        System.out.println("Butun reqemlerin hasili "+ (a*b*c*d));
        


    }
}
