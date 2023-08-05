package Lesson_12_2;

public class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;

    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    @Override
    public String toString() {
        return "Marka : " + getMake() + "," + " Model : " + getModel() + "," + " İl : " + getYear() + "," + " Qapı : " + numDoors;
    }
}

class print {
    public static void main(String[] args) {
        Car car = new Car("Kia", "Ceed", 2009, 4);
        System.out.println(car);
        Car car2 = new Car("Yamaha", "BMS Chopper", 2023, 0);
        System.out.println(car2);


    }
}