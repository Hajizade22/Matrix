package Lesson_8;

import java.util.Scanner;

public class Classwork {
    public static void main(String[] args) {
        Name name = new Name();

        name.setName("Yusif", "Hacı");

        System.out.println(name.getName());
        Scanner scanner = new Scanner(System.in);
        name.surname="Hacizade";
        boolean notValidAge = true;
        while (notValidAge) {
            int yas = scanner.nextInt();
            if (yas > 0) {
                notValidAge = false;
                name.age = yas;
            }
        }
        System.out.println(name);
    }
}
