package ac;

import java.util.Scanner;

    public class School{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            // Pseudocode
            // Ask a user to enter a score range.
            // if a user enters score range from 90 to 100, print A.
            // if a user enters score range from 80 to less than 90, print B.
            // if a user enters score range from 70 to less than 80, print C.
            // if a user enters score range from 60 to less than 70, print D.
            // if a user enters score range less than 60, print F.

            System.out.println("Score Range: ");
            int scoreRange = input.nextInt();

            if (scoreRange >= 90 && scoreRange <= 100) {
                System.out.print("A");
            }
            if (scoreRange >= 80 && scoreRange < 90) {
                System.out.print("B");
            }
            if (scoreRange >= 70 && scoreRange < 80) {
                System.out.print("C");
            }
            if (scoreRange >= 60 && scoreRange < 70) {
                System.out.print("D");
            }
            if (scoreRange < 60) {
                System.out.print("F");
            }
        }

    }