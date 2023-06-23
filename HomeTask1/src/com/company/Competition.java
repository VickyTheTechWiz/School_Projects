package com.company;

public class Competition {

    public static int[] sortArrayUsingInsertionSort(int[] nums){
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = key;
        }
        return nums;
    }

    public static int[] sortArrayUsingSelectionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }

    public static int[] sortArrayUsingBubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }

    public static int[] sortArrayUsingMergeSort(int[] nums, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            sortArrayUsingMergeSort(nums, low, mid);
            sortArrayUsingMergeSort(nums, mid + 1, high);
            merge(nums, low, mid, high);
        }
        return nums;
    }
    private static int[] sortArrayUsingMergeSort(int[] nums) {
        return nums;
    }
    public static void merge(int[] nums, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = nums[low + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = nums[mid + j + 1];
        }
        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                nums[k] = left[i];
                i++;
            } else {
                nums[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            nums[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            nums[k] = right[j];
            j++;
            k++;
        }
    }





    public static int[] sortArrayUsingQuickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(nums, low, high);
            quickSort(nums, low, partitionIndex - 1);
            quickSort(nums, partitionIndex + 1, high);
        }
    }

    private static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (nums[j] <= pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;
        return i + 1;
    }




    public static void main(String[] args) {
        int[] nums = {4000, 8000, 16000, 32000};
        long startTime, endTime, duration;

        startTime = System.nanoTime();
        int[] sortedNums1 = sortArrayUsingInsertionSort(nums);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Insertion Sort duration: " + duration + "ns");

        startTime = System.nanoTime();
        int[] sortedNums2 = sortArrayUsingSelectionSort(nums);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Selection Sort duration: " + duration + "ns");

        startTime = System.nanoTime();
        int[] sortedNums3 = sortArrayUsingBubbleSort(nums);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Bubble Sort duration: " + duration + "ns");

        startTime = System.nanoTime();
        int[] sortedNums4 = sortArrayUsingMergeSort(nums);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Merge Sort duration: " + duration + "ns");

        startTime = System.nanoTime();
        int[] sortedNums5 = sortArrayUsingQuickSort(nums);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Quick Sort duration: " + duration + "ns");
    }



}









