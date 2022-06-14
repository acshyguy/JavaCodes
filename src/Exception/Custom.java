package Exception;

import tdd.Exception.CohortElevenException;

import java.util.Scanner;

public class Custom {
    private static final Scanner input = new Scanner(System.in);

    public static int collectInput() throws CohortElevenException {
        System.out.println("Enter a number: ");
        int userInput = input.nextInt();
        if (userInput < 0){
            throw new CohortElevenException("Can not take a negative integer");
        }
        return 0;
    }

    public static void main(String[] args) {
        try {
            collectInput();
        }catch (CohortElevenException cE){
            System.out.println( cE.getMessage());
        }
    }

}
