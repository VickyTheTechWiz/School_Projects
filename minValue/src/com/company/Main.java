package com.company;

public class Main {

    public static int main(String[] args) {
        int[] arr = new int[0];
        if (arr.length == 0) {
            throw new RuntimeException("not suitable input");
        }


        arr = new int[0];
        int minValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }

        return minValue;

    }
}


