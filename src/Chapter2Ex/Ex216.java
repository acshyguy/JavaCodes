package Chapter2Ex;
import java.util.Scanner;

public class Ex216 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer");
        int number = input.nextInt();

        int square = number * number;
        if (number > 100) {
            System.out.println("number > 100: ");
        }
        if (number == 100) {
            System.out.printf("%d == 100");
        }
        if (number != 100) {
            System.out.println("number != 100: ");
        }
        if (number < 100) {
            System.out.println("number < 100: ");
        }




    }
}
