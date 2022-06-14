package AssignmentsAndClassWorks;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class RandomNumGen {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int answer = random.nextInt(100);
        int guess;

        System.out.println("Guess a number");
        guess = input.nextInt();

        if (guess == answer){
            System.out.println("You won");
            return;
            // TODO check if the answer from the random number is greater than the guess.
        } else if (guess > answer) {
            System.out.println("Too high, try again");
            // TODO check if the answer from the random number is lower than the guess.
        }else if (guess < answer){
            System.out.println("Too low, try again");
        }

        // TODO keeps going until the person guesses the right number.

        while (answer != guess){
//            System.out.println("Wrong entry, try again");
            System.out.println("Guess a number");
            guess = input.nextInt();

            // TODO check if the answer from the random number is the same as the guess.
            if (guess == answer){
                System.out.println("You won");
                return;
                // TODO check if the answer from the random number is greater than the guess.
            } else if (guess > answer) {
                System.out.println("Too high, try again");
                // TODO check if the answer from the random number is lower than the guess.
            }else if (guess < answer){
                System.out.println("Too low");
            }
        }

    }

}
