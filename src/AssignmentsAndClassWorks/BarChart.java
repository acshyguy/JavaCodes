package AssignmentsAndClassWorks;

import java.util.Random;

public class BarChart {


    public static void main(String[] args) {
        Random number = new Random();

        int random= number.nextInt(30);
        int i=1;
        System.out.print(random);
        while(i <=random){
            System.out.print("*");
                 i++;
        }
        System.out.println();

        int random1= number.nextInt(30);
        System.out.print(random1);
        int j=1;
        while(j <=random1){
            System.out.print("*");
            j++;
        }
        System.out.println();

        int random2= number.nextInt(30);
        int n=1;
        System.out.print(random2);
        while(n <=random2){
            System.out.print("*");
            n++;
        }
        System.out.println();

        int random3= number.nextInt(30);
        int z=1;
        System.out.print(random3);
        while(z <=random3){
            System.out.print("*");
            z++;
        }

    }
}
