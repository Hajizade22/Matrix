package Lesson_3;

public class Lesson_3_Switch {
    public static void main(String[] args) {
        int dayOfWeek = 3;
        String dayName;
        switch (dayOfWeek) {
            case 1:
                dayName = "Bazar Ertesi";
                break;
            case 2:
                dayName = "Chersenbe axsami";
                break;
            case 3:
                dayName = "Chersenbe";
                break;
            case 4:
                dayName = "Cume axsami";
                break;
            case 5:
                dayName = "Cume";
                break;
            default:
                dayName = "Hec bir gun";
        }
        System.out.println("Bugun heftenin " + dayName + " gunudur");

    }
}
