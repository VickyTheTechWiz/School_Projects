package com.company;

import java.util.Arrays;

public class insertionSort {
    public static int[] sortArrayUsingInsertionSort(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int pointerOfSortedArray = i - 1;

            while (pointerOfSortedArray >= 0 && nums[pointerOfSortedArray] > key) {
                nums[pointerOfSortedArray + 1] = nums[pointerOfSortedArray];
                pointerOfSortedArray -= 1;
            }
            nums[pointerOfSortedArray + 1] = key;
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayUsingInsertionSort(new int[]{32000, 4000, 16000, 8000})));
    }

}
