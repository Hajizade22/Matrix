package Lesson_5;

public class Lesson_5_Arrays2 {
    public static void main(String[] args) {
    }
    double[] temperatures = {72.5, 68.0, 70.5, 73.0, 69.5, 75.0, 72.5};

    public static double calculateAverageTemperature(double[] temperatures) {
        double sum = 0.0;
        for (int i = 0; i < temperatures.length; i++) {
            sum += temperatures[i];
        }
        double average = sum / temperatures.length;
        return average;
    }


}
