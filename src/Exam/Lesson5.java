package Exam;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
//        String [] name = {"Yusi","Yusif","Quqqqqqqa","Bubbbbba"};
//        for (int i = 0; i <name.length; i++) {
//            System.out.println(name[i]);
//        }

//        int[] sum={1,2,3,4,5};
//        int a=0;
//        for (int i = 0; i <= sum.length ; i++) {
//            a+=i;
//        }
//        System.out.println(a);
//        Scanner scanner=new Scanner(System.in);
//        int sum = 0;
//        int [] scan = new int[10];
//        scan[0]= scanner.nextInt();
//        scan[1]= scanner.nextInt();
//        scan[2]= scanner.nextInt();
//        scan[3]= scanner.nextInt();
//        scan[4]= scanner.nextInt();
//        scan[5]= scanner.nextInt();
//        scan[6]= scanner.nextInt();
//        scan[7]= scanner.nextInt();
//        scan[8]= scanner.nextInt();
//        scan[9]= scanner.nextInt();
//
//        for (int i = 0; i <scan.length ; i++) {
//            sum+=scan[i];
//        }
//        System.out.println(sum/ scan.length);
//            int[] mirror={1,3,6,9,15};
//        for (int i = mirror.length-1; i >=0; i--) {
//            System.out.println(mirror[i]);
//        }
//            Scanner scanner=new Scanner(System.in);
//            int a= scanner.nextInt();
//            int b = scanner.nextInt();
//            int c=1;
//            int d= scanner.nextInt();
//            int[][] f=new int[a][b];
//
//        for (int i = 0; i <a ; i++) {
//            for (int j = 0; j < b; j++) {
//                f[i][j] = c;
//                c++;
//            }
//        }
//            for (int i = 0; i <a ; i++) {
//                for (int j = 0; j <b ; j++) {
//                    if (f[i][j]==d){
//                        System.out.println("abc");
//                    }
//                }
//            }
        Scanner scanner = new Scanner(System.in);
        String[] words = {"apple", "banana", "cherry", "orange", "grape"};
        String word = words[(int) (Math.random() * words.length)];
        char[] letter = new char[word.length()];
        for (int i = 0; i < letter.length;i++) {
            letter[i] = '_';
        }
        int min = 0;
        int max = 3;


        while (min < max  &&  !new String(letter).equals(word)) {
            char o = scanner.next().charAt(0);

            boolean x = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == o) {
                    letter[i] = o;
                    x = true;
                }
            }
            if (!x) {
                min++;
            }
            System.out.println(letter);
        }
                if (min==max){
                    System.out.println("son");
                }
                else {
                    System.out.println("tebrikler");
                }

    }
}