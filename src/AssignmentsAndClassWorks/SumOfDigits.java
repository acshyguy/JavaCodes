package AssignmentsAndClassWorks;

import java.util.Scanner;
//
public class SumOfDigits {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter first number: ");
//        int firstNumber = input.nextInt();
//
//        System.out.println("Enter second number: ");
//        int secondNumber = input.nextInt();
//
//        System.out.println("Enter third number: ");
//        int thirdNumber = input.nextInt();
//
//        System.out.println("Enter fourth number: ");
//        int fourthNumber = input.nextInt();
//
//        System.out.println("Sum of Integers is " + sumOfIntegers(firstNumber,secondNumber,thirdNumber,fourthNumber));
//    }
//
//
//    public static int sumOfIntegers(int firstNumber,int secondNumber,int thirdNumber, int fourtNumber){
//        int sum = firstNumber + secondNumber + thirdNumber + fourtNumber;
//        return sum;
//    }
//

    public static void main(String[] args) {
        int x = 2;
        int a = 6;
//        y = a * x * x + 5 * x + 2;
//        b) y = a * x * x + (5 * x) + 2;
//        c) y = a * x * x + 5 * (x + 2);
//        d) y = a * (x * x) + 5 * x + 2;
//        e) y = a * x * (x + 5 * x) + 2;
//        f) y = a * (x * x + 5 * x + 2)
        System.out.println(a * x * x + 5 * x + 2);
        System.out.println(a * x * x + (5 * x) + 2);
        System.out.println(a * x * x + 5 * (x + 2));
        System.out.println(a * (x * x) + 5 * x + 2);
        System.out.println(a * x * (x + 5 * x) + 2);
        System.out.println(a * (x * x + 5 * x + 2));
    }
}



