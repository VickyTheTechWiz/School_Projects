package com.company;


public class MinMax {

    public static class ArraysExamples {

        public static int getMinElement(int[] arr) {
            if (arr.length == 0) {
                throw new RuntimeException("not suitable input");
            }
            int minValue = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (minValue > arr[i]) {
                    minValue = arr[i];
                }
            }
            return minValue;
        }

        public static int getMaxElement(int[] arr) {
            if (arr.length == 0) {
                throw new RuntimeException("not suitable input");
            }
            int maxValue = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (maxValue < arr[i]) {
                    maxValue = arr[i];
                }
            }
            return maxValue;
        }

        /**
         * Return the number of even ints in the given array.
         * <p>
         * countEvens([2, 1, 2, 3, 4]) → 3
         * countEvens([2, 2, 0]) → 3
         * countEvens([1, 3, 5]) → 0
         */
        public static int countEvens(int[] arr) {
            int counter = 0;
            for (int element : arr) {
                if (element % 2 == 0) {
                    counter++;
                }
            }
            return counter;
        }

        /**
         * Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
         * <p>
         * bigDiff([10, 3, 5, 6]) → 7
         * bigDiff([7, 2, 10, 9]) → 8
         * bigDiff([2, 10, 7, 2]) → 8
         */
        public static int bigDiff(int[] arr) {
            int maxElement = getMaxElement(arr);
            int minElement = getMinElement(arr);
            return maxElement - minElement;
        }

        /**
         * Given an array of ints, return true if every 2 that appears in the array is next to another 2.
         * <p>
         * twoTwo([4, 2, 2, 3]) → true
         * twoTwo([2, 2, 4]) → true
         * twoTwo([2, 2, 4, 2]) → false
         */
        public static boolean twoTwo(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 2) {
                    continue;
                }
                if (i >= 1 && arr[i - 1] == 2) {
                    continue;
                }
                if (i < arr.length - 1 && arr[i + 1] == 2) {
                    continue;
                }
                return false;
            }
            return true;
        }


        public static void main(String[] args) {
            System.out.println(getMinElement(new int[]{1, 2, 3})); // 1
            System.out.println(getMinElement(new int[]{3, 4, 5, 10, 4})); // 3
            System.out.println(getMinElement(new int[]{3, 4, 2, 10, 4})); // 2
            try {
                getMinElement(new int[]{});
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

            System.out.println(countEvens(new int[]{2, 1, 2, 3, 4})); // 3
            System.out.println(countEvens(new int[]{2, 2, 0})); // 3
            System.out.println(countEvens(new int[]{1, 3, 5})); // 0
            System.out.println(countEvens(new int[]{})); // 0

            System.out.println(bigDiff(new int[]{})); // 10 - 3 = 7
            System.out.println(bigDiff(new int[]{7, 2, 10, 9})); // 10 - 2 = 8
            System.out.println(bigDiff(new int[]{2, 10, 7, 2})); // 10 - 2 = 8

            System.out.println(twoTwo(new int[]{4, 2, 2, 3})); // true
            System.out.println(twoTwo(new int[]{2, 2, 4})); // true
            System.out.println(twoTwo(new int[]{2, 2, 4, 2}));
            System.out.println(new SelectionSort(new int[]{8, 4, 6, 9, 2, 3, 1}));
            System.out.println(new InsertSort(new int[]{8,7,6,5,4,3,2,1}));

        }

        public static class SelectionSort {
            public SelectionSort(int[] ints) {
            }

            public static void selectionSort(int[] arr) {
                for (int i = 0; i < arr.length - 1; i++) {
                    int index = i;
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[j] < arr[index]) {
                            index = j;
                        }
                    }
                    int smallerNumber = arr[index];
                    arr[index] = arr[i];
                    arr[i] = smallerNumber;
                }
            }

            public static void main(String A[]) {
                int[] arr1 = {8, 4, 6, 9, 2, 3, 1};
                System.out.println("Before Selection Sort");
                for (int i : arr1) {
                    System.out.print(i + " ");
                }
                System.out.println();

                selectionSort(arr1);//sorting array using selection sort

                System.out.println("After Selection Sort");
                for (int i : arr1) {
                    System.out.print(i + " ");
                }
            }

            public static class InsertionSort {
                void sort(int arr[])
                {
                    int n = arr.length;
                    for (int i = 1; i < n; ++i) {
                        int key = arr[i];
                        int j = i - 1;


                        while (j >= 0 && arr[j] > key) {
                            arr[j + 1] = arr[j];
                            j = j - 1;
                        }
                        arr[j + 1] = key;
                    }
                }

                static void printArray(int arr[])
                {
                    int n = arr.length;
                    for (int i = 0; i < n; ++i)
                        System.out.print(arr[i] + " ");

                    System.out.println();
                }

                public static void main(String args[])
                {
                    int arr[] = { 8,7,6,5,4,3,2,1 };

                    InsertionSort ob = new InsertionSort();
                    ob.sort(arr);

                    printArray(arr);
                }
            }
        }


    }
    }