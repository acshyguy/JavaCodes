package AssignmentsAndClassWorks;

import java.util.Scanner;

public class FactorialValue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int factorial = 1;

        while(number!=0){
            factorial=factorial*number;
            number--;

        }
        System.out.println(factorial);
    }
}
