package Lesson_14;

public class Circle2 extends Shape{
    private double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radius,2);
    }
}
