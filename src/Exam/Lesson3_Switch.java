package Exam;

import java.util.Scanner;

public class Lesson3_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int month = scanner.nextInt();
//        String days;
//
//
//        switch (month) {
//            case 1:
//                days = "Yanvar" + "31 gun";
//                break;
//            case 2:
//                days = "Fevral" + "29 gun";
//                break;
//            case 3:
//                days = "Mart" + "31 gun";
//                break;
//            case 4:
//                days = "Aprel" + "30 gun";
//                break;
//            case 5:
//                days = "May" + "31 gun";
//                break;
//            case 6:
//                days = "Iyun" + "30 gun";
//                break;
//            case 7:
//                days = "Iyul" + "31 gun";
//                break;
//            case 8:
//                days = "Avqust" + "31 gun";
//                break;
//            case 9:
//                days = "Sentyabr" + "30 gun";
//                break;
//            case 10:
//                days = "Oktyabr" + "31 gun";
//                break;
//            case 11:
//                days = "Noyabr" + "30 gun";
//                break;
//            case 12:
//                days = "Dekabr" + "31 gun";
//                break;
//
//            default:
//                days = "Default";
//                break;
//        }
//        System.out.println(days);
                int cut= scanner.nextInt();
                String cutTek = (cut %2==0) ? "Cut" : "Tek";
                System.out.println(cutTek);
    }
}
