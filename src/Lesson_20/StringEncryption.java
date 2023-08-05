package Lesson_20;

import java.util.Scanner;

public class StringEncryption {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Şifrələmək istədiyiniz sözü daxil edin: ");
        String word = scanner.nextLine();
        String salt = "!mtrxjv";
        System.out.println("Parolu daxil edərək şifrələmə metodunu görə bilərsiniz ");
        System.out.print("Parol:");
        String password = scanner.nextLine();


        if (password.equalsIgnoreCase("java154")) {
            System.out.println("Parol doğrudur");
            String encryptedStringUsingString = encryptStringUsingString(word);
            System.out.println("Using String: " + encryptedStringUsingString + salt + ": Bizim Salt \"" + salt + "\" Bizim istifadə etdiyimiz metod" +
                    "char encryptedChar = (char) (inputString.charAt(i) +1);");


            String encryptedStringUsingStringBuffer = encryptStringUsingStringBuffer(word);
            System.out.println("Using StringBuffer: " + encryptedStringUsingStringBuffer + salt + ": Bizim Salt \"" + salt + "\" Bizim istifadə etdiyimiz metod" +
                    "char encryptedChar = (char) (inputString.charAt(i) +1);");


            String encryptedStringUsingStringBuilder = encryptStringUsingStringBuilder(word);
            System.out.println("Using StringBuilder: " + encryptedStringUsingStringBuilder + salt + ": Bizim Salt \"" + salt + "\" Bizim istifadə etdiyimiz metod" +
                    "char encryptedChar = (char) (inputString.charAt(i) +1);");
        } else {
            System.out.println("Siz səhv parol daxil etdiniz \nSöz şifrələndi metodi özünüz tapın");
            String encryptedStringUsingString = encryptStringUsingString(word);
            System.out.println("Using String: " + encryptedStringUsingString + salt);


            String encryptedStringUsingStringBuffer = encryptStringUsingStringBuffer(word);
            System.out.println("Using StringBuffer: " + encryptedStringUsingStringBuffer + salt);


            String encryptedStringUsingStringBuilder = encryptStringUsingStringBuilder(word);
            System.out.println("Using StringBuilder: " + encryptedStringUsingStringBuilder + salt);
        }
//        System.out.println(MathRand);
    }

    private static String encryptStringUsingString(String inputString) {
        String encrypted = new String();
        for (int i = 0; i < inputString.length(); i++) {
            char encryptedChar = (char) (inputString.charAt(i) + 1 + Math.random());
            encrypted += encryptedChar;
        }
        return encrypted.toString();
    }

    private static String encryptStringUsingStringBuffer(String inputString) {
        StringBuffer encrypted = new StringBuffer();
        for (int i = 0; i < inputString.length(); i++) {
            char encryptedChar = (char) (inputString.charAt(i) + 1);
            encrypted.append(encryptedChar);
        }
        return encrypted.toString();
    }

    private static String encryptStringUsingStringBuilder(String inputString) {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            char encryptedChar = (char) (inputString.charAt(i) + 1);
            encrypted.append(encryptedChar);
        }
        return encrypted.toString();
    }
}

