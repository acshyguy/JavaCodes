package AssignmentsAndClassWorks;
import java.util.Scanner;

public class MtnApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1 for English");
        System.out.println("Enter 2 for Igbo");
        System.out.println("Enter 3 for French");
        System.out.println("Enter 4 for Yoruba");
        int voice = input.nextInt();

        switch (voice){
            case 1:
                System.out.println("Press 1 for data\nPress 2 for Transfer");
               int voice1 = input.nextInt();
               switch (voice1){
                   case 1:
                       System.out.println("Data");
                       break;
                   case 2:
                       System.out.println("Transfer");
               }
                break;
            case 2:
                System.out.println("Press 1 for sharing\nPress 2 for caring");
                int voice2 = input.nextInt();
                switch (voice2){
                    case 1:
                        System.out.println("Sharing");
                        break;
                    case 2:
                        System.out.println("Caring");
                }
                break;
            case 3:
                System.out.println("Press 1 for Egg\nPress 2 for Champagne");
                int voice3 = input.nextInt();
                switch (voice3){
                    case 1:
                        System.out.println("Egg");
                        break;
                    case 2:
                        System.out.println("Champagne");
                }
                break;
            case 4:
                System.out.println("Press 1 for Ewa\nPress 2 for Agoyin");
                int voice4 = input.nextInt();
                switch (voice4){
                    case 1:
                        System.out.println("Ewa");
                        break;
                    case 2:
                        System.out.println("Agoyin");
                }
                break;
            default:
                System.out.println("Wrong Number Code");
        }
/*  while(voice < 1 || voice > 4) {
        System.out.println("Invalid number. Try again.");
        voice = input.nextInt();
}

 */
    }
}