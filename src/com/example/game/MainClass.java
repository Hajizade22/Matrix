package com.example.game;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        PackageA packageA = new PackageA();
        PackageB packageB = new PackageB();
        PackageC packageC = new PackageC();
        int round = 1;
        Scanner scanner = new Scanner(System.in);
        int number;
        boolean num = true;
        while (num) {
            System.out.println(" 1, 2 ve ya 3  daxil ederek siz Xezine tapa bilersiniz");

            number = scanner.nextInt();
            if (number == 1) {
                packageA.explore();

            } else if (number == 2) {
                packageB.explore();

            } else if (number == 3) {
                packageC.explore();

            } else {
                System.out.println("Duzgun reqem daxil edilmedi.");
            }
            System.out.println("Davam etmek isteyirsinizmi ?  H/Y");
           String p = scanner.next();
            if (p.equalsIgnoreCase("H")) {
                System.out.println("Davam");
            } else {
                System.out.println("Son");
            num = false;
            }
        }
    }
}

