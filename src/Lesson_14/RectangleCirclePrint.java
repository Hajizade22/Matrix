package Lesson_14;

public class RectangleCirclePrint {
    public static void main(String[] args) {
        Circle2 circle2=new Circle2(3);
        double v=circle2.calculateArea();
        System.out.println(v);
        Rectangle rectangle=new Rectangle(3,4);
        double n=rectangle.calculateArea();
        System.out.println(n);

    }

}
