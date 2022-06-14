package AssignmentsAndClassWorks;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int redo;
        do {
            System.out.println("Enter First Number: ");
            int number1 = input.nextInt();
            System.out.println("Enter Second Number: ");
            int number2 = input.nextInt();

            int sum = number1 + number2;
            System.out.println("Sum is  " +sum);

            System.out.println("Enter 0 to redo Or Enter 1 to end");
            redo = input.nextInt();
        }
        while (redo == 0);

    }

}
