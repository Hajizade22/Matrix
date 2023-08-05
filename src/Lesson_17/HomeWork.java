package Lesson_17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        try {

            Scanner scanner = new Scanner(System.in);
            String answer;
            boolean football = true;
            System.out.println("İmtahan başlayır");
            String[] exam = new String[5];
            exam[0] = " ";
            exam[1] = "Mən GOL vurduğum zaman sevinmirəm,sadecə işimi görürəm.Poçtalyon sizə məktubu çatdıran zaman sevinirmi?" +
                    " Deyən futbolçu kimdir? ";
            exam[2] = "İtaliyada yerləşən bu stadion iki ada malikdir. 1-ci adı San Siro , 2-ci adı isə Giuseppe Meazzadır." +
                    " Bu stadion hansı 2 kluba məxsusdur ";
            exam[3] = "Almaniya-Azərbaycan oyunu zamanı nəhəng qapıçı Manuel Peter Neuerə künc zərbəsindən birbaşa GOL vuran " +
                    "oyunçumuzun adı nədir?";
            exam[4] = "Real Madrid və Barcelonada oynayıb.Ləqəbi \"The Maradona of the Carpathiansdır\" ." +
                    " \"Sağ ayağına kitab yazılar,son sətrinə solaxay idi cümlə əlavə olunar\".Söhbət hansı futbolçudan gedir ";

            System.out.println("==========================================================================================");
            System.out.println("Sual 1- " + exam[1]);
            System.out.println("Sual 2- " + exam[2]);
            System.out.println("Sual 3- " + exam[3]);
            System.out.println("Sual 4- " + exam[4]);
            System.out.println("==========================================================================================");
            System.out.println("Bir bilet seçin");
            int choice = scanner.nextInt();
            System.out.println("==========================================================================================");
            System.out.println("Sizin sualınız \n" + exam[choice]);


            if (choice == 1) {
                System.out.println("Cavabı seçin:\n 1:Robert Lewandowski\n 2:Mario Balotelli");
                while (football) {
                    int answerForQuestion = scanner.nextInt();
                    switch (answerForQuestion) {
                        case 1:
                            answer = "Yanlış cavab.Siz imtahandan kəsildiniz.";
                            break;
                        case 2:
                            answer = "Təbriklər siz doğru cavabı seçib imtahandan uğurla keçdiniz";
                            break;
                        default:
                            answer = "1 və ya 2 daxil edin";
                    }
                    System.out.println(answer);
                }
            } else if (choice == 2) {
                System.out.println("Cavabı seçin:\n 1:İnter və Milan\n 2:Juventus və Fiorentina");
                while (football) {
                    int answerForQuestion = scanner.nextInt();
                    switch (answerForQuestion) {
                        case 1:
                            answer = "Təbriklər siz doğru cavabı seçib imtahandan uğurla keçdiniz";
                            break;
                        case 2:
                            answer = "Yanlış cavab.Siz imtahandan kəsildiniz.";
                            break;
                        default:
                            answer = "1 və ya 2 daxil edin";
                    }
                    System.out.println(answer);
                }
            } else if (choice == 3) {
                System.out.println("Cavabı seçin:\n 1:Vaqif Cavadov\n 2:Əfran İsmayılov");
                while (football) {
                    int answerForQuestion = scanner.nextInt();
                    switch (answerForQuestion) {
                        case 1:
                            answer = "Təbriklər siz doğru cavabı seçib imtahandan uğurla keçdiniz";
                            break;
                        case 2:
                            answer = "Yanlış cavab.Siz imtahandan kəsildiniz.";
                            break;
                        default:
                            answer = "1 və ya 2 daxil edin";
                    }
                    System.out.println(answer);
                }
            } else if (choice == 4) {
                System.out.println("Cavabı seçin:\n 1:Andriy Mykolayovych Shevchenko\n 2:Gheorghe Hagi");
                while (football) {
                    int answerForQuestion = scanner.nextInt();
                    switch (answerForQuestion) {
                        case 1:
                            answer = "Yanlış cavab.Siz imtahandan kəsildiniz.";
                            break;
                        case 2:
                            answer = "Təbriklər siz doğru cavabı seçib imtahandan uğurla keçdiniz";
                            break;
                        default:
                            answer = "1 və ya 2 daxil edin";
                    }
                    System.out.println(answer);
                }

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Yanlış bilet nömrəsi");
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Yalnız tam ədəd daxil edin");
            System.out.println(e.getMessage());
        }
    }
}
