import java.util.Scanner;

public class Geometry{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter firstX : ");
        double firstX = input.nextDouble();
        System.out.print("Enter firstY : ");
        double firstY = input.nextDouble();

        System.out.print("Enter secondX : ");
        double secondX = input.nextDouble();
        System.out.print("Enter secondY : ");
        double secondY = input.nextDouble();

        System.out.print("Enter thirdX : ");
        double thirdX = input.nextDouble();
        System.out.print("Enter thirdY : ");
        double thirdY = input.nextDouble();


        double area = (firstX * secondY - firstX * thirdY + secondX * thirdY - secondX * firstY + thirdX * firstY - thirdX * secondY)/2;

        System.out.printf("The area is positive value of %f", area);

    }

}