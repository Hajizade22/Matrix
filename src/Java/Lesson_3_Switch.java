package Java;

import java.util.Scanner;

public class Lesson_3_Switch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        String name;
        switch (a){
            case 1:
                name="Hacizade Haci";
                break;
            case 2:
                name="Hacizade Mehseti";
                break;
            case 3:
                name="Hacizade Yusif";
                break;
            default:
                name="Bele bir musteri movcud deyil";
        }
        System.out.println(name);
    }
}
