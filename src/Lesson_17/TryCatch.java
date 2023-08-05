package Lesson_17;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
try {
    int[] numbers={1,2,3,4,5};
    Scanner scanner=new Scanner(System.in);
    int first= scanner.nextInt();
    int second=scanner.nextInt();
    System.out.println(numbers[first]+numbers[second]);
}catch (ArrayIndexOutOfBoundsException e){
    System.out.println("Xeta bas verdi");
    System.out.println(e.getMessage());
}


    }

}
