package Lesson_24;

import java.util.*;

public class DuplicateRemover {
    public static int[] removeDuplicates(int[] nums) {
        Set<Integer> uniqueSet = new HashSet<>();

        for (int num : nums) {
            uniqueSet.add(num);
        }

        int[] uniqueArray = new int[uniqueSet.size()];
        int index = 0;
        for (int num : uniqueSet) {
            uniqueArray[index++] = num;
        }

        return uniqueArray;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2, 1, 5, 6, 3};
        int[] uniqueArray = removeDuplicates(nums);

        System.out.println("Original Array: " + Arrays.toString(nums));
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
    }
}

