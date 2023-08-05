package Lesson_14;

abstract public class HomeWorkShape {
    String color;
    final double PI = 3.14;

    public HomeWorkShape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return color;
    }

    public abstract double calculateArea();
}
    class CircleShape extends HomeWorkShape{
        private double radius;

        public CircleShape(String color, double radius) {
            super(color);
            this.radius = radius;
        }

        public CircleShape(String color) {
            super(color);
        }

        @Override
        public double calculateArea() {
            return PI*Math.pow(radius,2);
        }
    }
    class RectangleShape extends HomeWorkShape{
        public RectangleShape(String color, double length, double width) {
            super(color);
            this.length = length;
            this.width = width;
        }

        private double length;
        private double width;
        public RectangleShape(String color){
            super(color);
        }

        @Override
        public double calculateArea() {
            return length*width;
        }
    }

class prt{
    public static void main(String[] args) {
        CircleShape circleShape=new CircleShape("Red",2);
        double v =circleShape.calculateArea();
        System.out.println(circleShape.color + " "+ v);
        RectangleShape rectangleShape=new RectangleShape("Blue",2,4);
        double c =rectangleShape.calculateArea();
        System.out.println(rectangleShape.color + " "+ c);


    }
}
