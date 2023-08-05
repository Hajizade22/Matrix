package Lesson_23;

import java.util.*;

public class HomeWork2 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        List<String> first = new ArrayList<>();
        first.add("Mobil Telefon");
        first.add("Kondisioner");
        first.add("Kondisioner");
        first.add("TV");
        System.out.println(first);
        first.remove(1);
        System.out.println("Update :" + first);
        System.out.println(first.contains("TV"));
        System.out.println("Size of the list: " + first.size());
        first.clear();
        System.out.println("List after clearing: " + first);
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);

        System.out.println("==============================================================================");
        long startTime2 = System.nanoTime();
        Set<String> second = new HashSet<>();
        second.add("Mobil Telefon");
        second.add("Kondisioner");
        second.add("Kondisioner");
        second.add("TV");
        System.out.println(second);
        second.remove("Kondisioner");// Listde array nomreside yazmaq olur , set yalniz yazi ile qebul etdi
        System.out.println("Update : " + second);
        System.out.println(second.contains("TV"));
        System.out.println("Size of the list: " + second.size());
        second.clear();
        System.out.println("List after clearing: " + second);

        long endTime2 = System.nanoTime();
        long totalTime2 = endTime2 - startTime2;
        System.out.println(totalTime2);

        System.out.println("==============================================================================");
        long startTime3 = System.nanoTime();
        Queue<String> third = new LinkedList<>();
        third.offer("Mobil Telefon");
        third.offer("Kondisioner");
        third.offer("Kondisioner");
        third.offer("TV");
        System.out.println(third);
        String completedTask = third.poll();
        System.out.println("Completed task: " + completedTask);
        System.out.println("Tasks after removal: " + third);
        System.out.println(third.contains("Kondisioner"));
        System.out.println("Is the queue empty? " + third.isEmpty());// bos olmagini gosterir
        System.out.println("Size of the list: " + third.size());
        third.clear();
        System.out.println("List after clearing: " + third);
        System.out.println("Is the queue empty? " + third.isEmpty());
        long endTime3 = System.nanoTime();
        long totalTime3 = endTime3 - startTime3;
        System.out.println(totalTime3);


    }
}
