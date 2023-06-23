package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        // Question 1
        System.out.println("Q1: What is the capital of Alaska?");
        System.out.println("1) Melbourne");
        System.out.println("2) Anchorage");
        System.out.println("3) Juneau");
        System.out.print("Your answer: ");
        String answer1 = scanner.nextLine();
        int score = 0;
        if (answer1.equalsIgnoreCase("3")) {
            System.out.println("That's right!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is 3) Juneau.");
        }

        // Question 2
        System.out.println("Q2) Can you store the value 'cat' in a variable int?");
        System.out.println("1) yes");
        System.out.println("2) no");
        System.out.print("Your answer: ");
        String answer2 = scanner.nextLine();
        if (answer2.equalsIgnoreCase("2")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.\n.");
        }

        // Question 3
        System.out.println("Q3) What is the result of 9+6/3?");
        System.out.println("1) 5");
        System.out.println("2) 11");
        System.out.println("3) 15/3");
        System.out.print("Your answer: ");
        String answer3 = scanner.nextLine();
        if (answer3.equalsIgnoreCase("2")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The answer is 2) 11");
        }

        // Print final score
        System.out.println("Overall, you got " + score + " out of 3 questions correct.");
        System.out.println("Thanks for playing!");
    }
}
