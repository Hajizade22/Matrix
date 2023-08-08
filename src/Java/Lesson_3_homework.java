package Java;

import java.util.Scanner;

public class Lesson_3_homework {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Salam bizim Yusi Kitab evinə xoş gəlmişsiniz");
        System.out.println("Siz 1-4 arası bir rəqəm daxil edərək bizdən müəyyən hədiyyə qazana bilərsiniz");
        int a= scanner.nextInt();
        String name;
        switch (a){
            case 1:
                name="Təbrik edirik siz bizdən Kitab qazandınız";
                break;
            case 2:
                name="Təbrik edirik siz bizdən Defter qazandınız";
                break;
            case 3:
                name="Təbrik edirik siz bizdən Qelem qazandınız";
                break;
            case 4:
                name="Təbrik edirik siz bizdən Pozan qazandınız";
                break;
            default:
                name="Bele bir mekteb levzimati movcud deyil";
        }
        System.out.println(name);
    }
}
