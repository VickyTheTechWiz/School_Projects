package com.company;

import java.util.Arrays;

public class Competition {


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


    public static int[] sortArrayUsingBubbleSort(int[] nums) {


        return nums;
    }

    public static int[] sortArrayUsingMergeSort(int[] nums) {
        return nums;
    }


    public static int[] sortArrayUsingQuickSort(int[] nums) {
        return nums;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayUsingInsertionSort(new int[]{32000, 4000, 16000, 8000  })));
        System.out.println(Arrays.toString(sortArrayUsingSelectionSort(new int[]{32000, 4000, 16000, 8000 })));
        System.out.println(Arrays.toString(sortArrayUsingBubbleSort(new int[]{32000, 4000, 16000, 8000 })));
        System.out.println(Arrays.toString(sortArrayUsingMergeSort(new int[]{32000, 4000, 16000, 8000 })));
        System.out.println(Arrays.toString(sortArrayUsingQuickSort(new int[]{32000, 4000, 16000, 8000 })));
    }
}