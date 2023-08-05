package Exam;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int a ;
//         for (int i = 1; i <=10 ; i++) {
//            System.out.println(i);

//        int b=1;
//        for (int i =1; i<=a; i++) {
//            b=b*i;
//        }
//        System.out.println(b);

//
//        while (a<=100){
//            a*=2;
//            System.out.println(a);


//               int a= 0;
//             int rand= (int) (Math.random() * 100) + 1;
//             while(a!=rand){
//             a= scanner.nextInt();
//             if(a>rand){
//                 System.out.println("Yuksek eded daxil olunubdur");
//             } else if (a<rand) {
//                 System.out.println("Kicik eded daxil olunub");
//             }
//             else {
//                 System.out.println("tebrikler");
//             }
//        boolean musbet = true;
//        while (musbet) {
//            a=scanner.nextInt();
//            if (a < 0) {
//                System.out.println("Musbet eded daxil edin");
//            } else if (a == 0) {
//                System.out.println("sifirdan boyuk eded daxil edin");
//            } else {
//                musbet = false;
//                System.out.println("tebrikler");


                String entered;

                do {
                    System.out.println("Entered password");
                    entered = scanner.nextLine();

                    if (!entered.equals("Java123")) {
                        System.out.println("Try again");
                    }
                }

                    while (!entered.equals("Java123"));
                    System.out.println("Correct");
                    }

            }




