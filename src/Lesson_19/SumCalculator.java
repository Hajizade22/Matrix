package Lesson_19;

import java.util.Arrays;

public class SumCalculator implements Runnable {
    int[] array;

    public SumCalculator(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int sum = Arrays.stream(array).sum();
        System.out.println("Sum " +sum);
    }
}


