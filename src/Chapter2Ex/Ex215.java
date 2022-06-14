package Chapter2Ex;
import java.util.Scanner;

public class Ex215 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int number1 = input.nextInt();

        System.out.println("Enter second number");
        int number2 = input.nextInt();

        int squareOfNumber1 = number1 * number1;
        System.out.println("Square of First number: " + squareOfNumber1);
        int squareOfNumber2 = number2 * number2 ;
        System.out.println("Square of Second number: " +squareOfNumber2);


        int sumOfSquares = squareOfNumber1 + squareOfNumber2;
        System.out.println("Sum of Squares: "+sumOfSquares);

        int differenceOfSquares = squareOfNumber1 + squareOfNumber2;
        System.out.println("Difference of Squares: "+ differenceOfSquares);




    }

}
