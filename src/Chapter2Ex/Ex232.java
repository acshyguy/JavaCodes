package Chapter2Ex;

import java.util.Scanner;

public class Ex232 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 numbers");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int number4 = input.nextInt();
        int number5 = input.nextInt();

        int zeros = 0;
        int negatives = 0;
        int positives = 0;

        if (number1 == 0) zeros++;
        if (number2 == 0) zeros++;
        if (number3 == 0) zeros++;
        if (number4 == 0) zeros++;
        if (number5 == 0) zeros++;

        if (number1<0) negatives++;
        if (number2<0) negatives++;
        if (number3<0)negatives++;
        if (number4<0) negatives++;
        if (number5<0) negatives++;

        if (number1>0) positives++;
        if (number2>0) positives++;
        if (number3>0) positives++;
        if (number4>0) positives++;
        if (number5>0) positives++;


        System.out.println("Number of zeros input is: "+ zeros);
        System.out.println("Number of negative input is: "+ negatives);
        System.out.println("Number of positive input is: "+ positives);

    }

}
