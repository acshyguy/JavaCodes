package AssignmentsAndClassWorks;
import java.util.Scanner;

public class RaiseToPower {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int number1 = input.nextInt();

        System.out.println("Enter second number: ");
        int number2 = input.nextInt();

        int i = number2;
        int j = number1;
        int powerNumber1 = 1, powerNumber2 = 1;

        while (i != 0){
            powerNumber1 = powerNumber1 * number1;
            i--;
        }
        while(j != 0) {
            powerNumber2 = powerNumber2 * number2;
            j--;
        }

        System.out.println( "Power Number 1: " +powerNumber1);
        System.out.println("Power Number 2: " +powerNumber2);



    }

}
