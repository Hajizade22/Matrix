package Lesson_4;


import java.util.Scanner;

public class InputValidation {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int num= input.nextInt();
                System.out.print("Enter an integer: ");
                while (!input.hasNextInt()) {
                    System.out.println("Invalid input. Please enter an integer.");
                    input.next(); // consume the invalid input
            } while (num <= 0);

            System.out.println("You entered: " + num);
        }
    }
