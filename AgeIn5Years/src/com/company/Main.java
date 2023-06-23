package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hello.  What is your name?: ");
        String name = scanner.nextLine();

        System.out.print("Hi," + name+ ". How old are you?: ");
        int age = scanner.nextInt();

        int ageInFiveYears = age + 5;
        int ageFiveYearsAgo = age - 5;

        System.out.println("Did you know that in five years, you wil be " + ageInFiveYears+ " years old?");
        System.out.println("And five years ago, you were " + ageFiveYearsAgo+ "! Imagine that!");
    }
}
