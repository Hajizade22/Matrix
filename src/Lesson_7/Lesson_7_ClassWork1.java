package Lesson_7;

public class Lesson_7_ClassWork1 {
    String make;

    String model;

    double motor;

    int doors;


    boolean manual;

    public Lesson_7_ClassWork1(String make, String model, double motor, int doors, boolean manual) {
        this.make = make;
        this.model = model;
        this.motor = motor;
        this.doors = doors;
        this.manual = manual;
    }

    @Override
    public String toString() {
        return "Lesson_7_ClassWork1{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", motor=" + motor +
                ", doors=" + doors +
                ", manual=" + manual +
                '}';
    }



}

