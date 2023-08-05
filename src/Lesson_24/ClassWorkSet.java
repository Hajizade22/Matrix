package Lesson_24;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClassWorkSet {
    public static void main(String[] args) {
        List<Integer> classWork=new ArrayList<>();
        classWork.add(1);
        classWork.add(1);
        classWork.add(1);
        classWork.add(1);
        classWork.add(2);
        classWork.add(3);
        classWork.add(4);
        classWork.add(5);
        System.out.println(classWork);


        Set<Integer> remove=new HashSet<>(classWork);
        System.out.println(remove);
    }
}
