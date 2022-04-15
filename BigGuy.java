import java.util.Scanner;

public class BigGuy{

   public static void main(String[] args){
   
   Scanner Input = new Scanner(System.in);
   System.out.println("Enter firstNumber: ");
   int firstNumber = Input.nextInt();
   
   System.out.println("Enter secondNumber:" );
   int secondNumber = Input.nextInt();
   
   int Sum = firstNumber + secondNumber;
   System.out.printf("Sum is %d%n", Sum);
}
   

}