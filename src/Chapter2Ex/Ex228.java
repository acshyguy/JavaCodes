package Chapter2Ex;

import java.util.Scanner;

public class Ex228 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius of a circle");
        double radius = input.nextInt();

        double diameter = 2*radius;
        double circumference = 2* (3.14159)*radius;
        double area = (3.14159)*radius*radius;

        System.out.println("Diameter is: "+ diameter);
        System.out.println("Circumference is: "+ circumference);
        System.out.println("Area is: "+ area);
    }
}
