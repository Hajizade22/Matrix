package Lesson_12;

public class Static {
    static int count = 0;
    String make;
    public Static() {
        count++;
    }
    public static int getCount(){
        return count;
    }

    public void drive () {
        System.out.println("Model: " + this.make);
    }

    public Static(String make) {
        count++;
        this.make = make;
    }

    public static void main(String[] args) {
        Static a =new Static("Kia");
        Static b =new Static("Opel");
        Static c =new Static("Toyota");


        System.out.println(Static.count);
        a.drive();b.drive();c.drive();
    }
}
