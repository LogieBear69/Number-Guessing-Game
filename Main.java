import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;

        System.out.println("Welcome to the number guessing game!");
        System.out.println("Please enter a number between 1 and 100");


        System.out.println("Please select the difficulty");
        Scanner input = new Scanner(System.in);
        String difficulty = input.nextLine();

        System.out.println("You have chosen " + difficulty);
        System.out.println("Let's start the game!");

        switch (difficulty) {
            case "Easy" -> {
                int maxAttempts = 9;
                System.out.println("You have " + (maxAttempts + 1) + " attempts");
                guessing(input, numberToGuess, maxAttempts);
            }
            case "Medium" -> {
                int maxAttempts = 4;
                System.out.println("You have " + (maxAttempts + 1) + " attempts");
                guessing(input, numberToGuess, maxAttempts);
            }
            case "Hard" -> {
                int maxAttempts = 2;
                System.out.println("You have " + (maxAttempts + 1) + " attempts");
                guessing(input, numberToGuess, maxAttempts);
            }
            default -> System.out.println("Invalid difficulty");
        }


    }

    private static void guessing(Scanner input, int numberToGuess, int maxAttempts) {
        for (int i = 0; i <= maxAttempts; i++) {
            System.out.println("Enter your guess: ");
            int guess = input.nextInt();
            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed it!");
                return;
            }
            else if (guess > numberToGuess) {
                System.out.println("Your number is too high!");
            }
            else {
                System.out.println("Your number is too low!");
            }
        }
        System.out.println("Sorry! You are out of guessing! The correct number is " + numberToGuess);
    }


}