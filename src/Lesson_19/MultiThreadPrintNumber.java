package Lesson_19;

public class MultiThreadPrintNumber {
    int i = 1;

    public synchronized void printNumber(String threadNm) throws InterruptedException {

        if (threadNm.equals("Tək")) {
            if (i % 2 == 1) {
                System.out.println(Thread.currentThread().getName() + "--" + i++);
                notify();
            } else {
                wait();
            }
        } else if (threadNm.equals("Cüt")) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "--" + i++);
                notify();
            } else {
                wait();
            }
        }

    }

    public static void main(String[] args) {
        final MultiThreadPrintNumber obj = new MultiThreadPrintNumber();
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    while (obj.i <= 10000) {
                        obj.printNumber(Thread.currentThread().getName());
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Tək ədədlər bitdi");
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (obj.i <= 10000) {
                        obj.printNumber(Thread.currentThread().getName());
                    }
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
                System.out.println("Cüt ədədlər bitdi");
            }
        });

        t1.setName("Tək");
        t2.setName("Cüt");
        t1.start();
        t2.start();
    }
}