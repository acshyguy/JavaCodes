package Chapter2Ex;

import java.util.Scanner;

public class Ex233 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight in kilogram: ");
        double weight = input.nextDouble();

        System.out.println("Enter your height in in meters: ");
        double height = input.nextDouble();

        double bmi = weight / height * height;
        System.out.println("BMI is: "+bmi);

    }

}
