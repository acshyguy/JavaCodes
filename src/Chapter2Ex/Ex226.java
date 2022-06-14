package Chapter2Ex;

import java.util.Scanner;

public class Ex226 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 2 numbers");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int number1Trippled = number1*number1*number1;
        int number2Doubled = number2+number2;

        if (number1Trippled % number2Doubled == 0){
            System.out.println("Number 1 is trippled value of number 2 doubled");
        }
        if (number1Trippled % number2Doubled != 0){
            System.out.println("Number 1 is not trippled value of number 2 doubled");
        }

    }
}
