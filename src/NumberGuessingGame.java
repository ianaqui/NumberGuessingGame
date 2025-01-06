import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // generates a random int between 1,99
        // upper bounds are excluded.
        int numberToGuess = new Random().nextInt(1,100);
        // your code goes here
        System.out.println("Welcome to the Number Guessing Game!");
        Scanner in = new Scanner(System.in);


        while (true){
            System.out.print("Please guess a Number: ");

            int guess;
            guess = in.nextInt();

            if (guess < numberToGuess) {
                System.out.println("Your guess is too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Your guess is too high!");
            } else {
                System.out.println("Yes, the number is " + numberToGuess);
                break;
            }



        }
    }
}
