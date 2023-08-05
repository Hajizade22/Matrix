package Lesson_22;

public class ClassWork2 {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0){
            return false;}

        while(n%2==0){
            n/=2;
        }
        return n==1;
    }
    public static void main(String[] args) {
        int number = 16;
        System.out.println(isPowerOfTwo(number));

        number = 17;
        System.out.println(isPowerOfTwo(number));
    }
}