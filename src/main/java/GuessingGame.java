import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args)
    {
        // TODO: Prompt the user with a welcome message
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int num= rand.nextInt(100)+1;
        do {
            System.out.print("Enter your guess: ");
            int gNum = sc.nextInt();
            if (gNum > num) {
                System.out.println("Too high! Try again.");
            } else if (gNum < num) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("You got it!");
                run = false;
            }
        }
            while (run);
            // TODO: Generate a random secret number between 1 and 100 (inclusive)
            // TODO: Use a do...while loop to read guesses until correct
            // TODO: Print "Too low" / "Too high" / "You got it!" accordingly
            // TODO: Use Scanner for input

    }
}
