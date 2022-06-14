package EHIS;

import java.util.Scanner;

public class EhisClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        System.out.println("Enter multiple numbers and press -0 to terminate");
        int number = input.nextInt();

//         int[] array = {3,-198,754,8767,678,-99};
//          array = new int [6];
//
//            for (int i=0; i<array.length; i++){
//                if (array[i] > largest){
//                    largest = array[i];
//                }
//                if (array[i] < smallest){
//                    smallest = array[i];
//                }
//            }

        while (number != -0){
            if (number>largest){
                largest = number;
            }
            if (number< smallest){
                smallest=number;
            }
            System.out.println("Enter multiple numbers and press -0 to terminate");
            number = input.nextInt();
        }
        System.out.println("Largest is: "+ largest);
        System.out.println("Smallest is: "+ smallest);

    }
}
