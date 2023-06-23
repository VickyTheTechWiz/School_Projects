package com.company;

import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100000);

        System.out.println("Want to win a million dollars?");
        System.out.println("If so, guess the winning number between 0 and 100000.");
        System.out.println("Insert $1.00 and enter your number or 'q' to quit");

        int guesses = 0;
        int hints = 0;
        double cost = 0;
        boolean isCorrect = false;

        while (!isCorrect) {
            System.out.print("Insert $1.00 and enter your number or 'q' to quit: ");
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            int guess = Integer.parseInt(input);
            guesses++;
            cost += 1.0;

            if (guess == number) {
                System.out.println("You win!");
                isCorrect = true;
            } else {
                System.out.println("Sorry, good guess, but not quite right.");
                if (hints < 5) {
                    System.out.print("Do you want me to give you a hint? (y/n): ");
                    String hintInput = scanner.nextLine();
                    if (hintInput.equals("y")) {
                        hints++;
                        cost += 2.0;
                        if (guess < number) {
                            System.out.println("Your number is too low!");
                        } else {
                            System.out.println("Your number is too high!");
                        }
                    }
                }
            }
        }

        double loss = cost - (isCorrect ? 0 : 1.0);
        System.out.printf("You made %d guesses and used %d hints.%n", guesses, hints);
        System.out.printf("You spent $%.2f and %s.%n", cost, isCorrect ? "won $1,000,000" : "did not win");
        System.out.printf("You lost $%.2f.%n", loss);
        System.out.println("Thanks for playing. Come again!");
    }
}
