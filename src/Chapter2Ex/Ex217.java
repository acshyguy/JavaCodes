package Chapter2Ex;

import java.util.Scanner;

public class Ex217 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int number1 = input.nextInt();

        System.out.println("Enter second number");
        int number2 = input.nextInt();

        System.out.println("Enter third number");
        int number3 = input.nextInt();

        int sum = number1+number2+number3;
        System.out.println("Sum is: "+ sum);

        int average = sum / 3;
        System.out.println("Average is: "+ average);

        int product = number1*number2*number3;
        System.out.println("Product is: "+ product);

        int smallest = number1;
        if (smallest > number2) {
            smallest = number2;
//            System.out.println("Smallest is: "+ smallest);
        }
        if (smallest > number3) {
            smallest = number3;
//            System.out.println("Smallest is: "+ smallest);
        }
            System.out.println("Smallest is: "+ smallest);

       int largest = number1;
        if (largest < number2) {
            largest = number2;
 //           System.out.println("Largest is:  "+ number2);
        }
        if (largest < number3) {
           largest = number3;
 //          System.out.println("Largest is: "+ largest);
        }
        System.out.println("Largest is: "+ largest);



    }

}