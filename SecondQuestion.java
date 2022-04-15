//OBELEAGU ODINAKACHUKWU EMMANUEL
// QUESTION 2
import java.util.Scanner;

public class SecondQuestion{
    public static void main(String[] args) {
        
        double feet;
        double meter = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in feet: ");
        feet = input.nextDouble();

        meter = feet * 0.305;

        System.out.println(feet + " feet is " + meter + " meters");

    }
}