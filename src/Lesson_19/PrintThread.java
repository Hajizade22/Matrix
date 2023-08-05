package Lesson_19;

public class PrintThread {
    public static void main(String[] args) throws InterruptedException {
        int[] a = {10,20,30,40,50};

        SumCalculator sumCalculator = new SumCalculator(a);
        Thread thread=new Thread(sumCalculator);
        thread.start();
        thread.join();

    }
}

