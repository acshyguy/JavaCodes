package ac.classWork;
import java.util.Scanner;

public class ZubberApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = input.nextInt();

        if (number > 55) {
            System.out.print("Pass");
        }
        if (number < 55) {
            System.out.print("Fail");
        }

    }

}
