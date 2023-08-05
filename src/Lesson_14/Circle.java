package Lesson_14;

public class Circle {
    public final double PI = 3.14;
    public final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }

    public void showArea() {
        System.out.println(calculateArea());
    }
}


class print {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        circle.showArea();

    }
}

