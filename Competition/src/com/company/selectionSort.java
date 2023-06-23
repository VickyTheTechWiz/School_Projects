package com.company;

import java.util.Arrays;

public class selectionSort {
    public static int[] sortArrayUsingSelectionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int smallestElementIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[smallestElementIndex]) {
                    smallestElementIndex = j;
                }
            }

            int minValueInUnsortedArray = nums[smallestElementIndex];
            nums[smallestElementIndex] = nums[i];
            nums[i] = minValueInUnsortedArray;
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayUsingSelectionSort(new int[]{32000, 4000, 16000, 8000 })));
    }
}
