package Chapter5Ex;

public class Arrays {
    public static void main(String[] args) {

        System.out.println("Find the sum of numbers");
        System.out.println("");

        int[] myArray = {10,20,33,-6,-7};
        int sum = 0;
        int largest = myArray[0];
        int smallest = myArray[0];

       for (int i= 0;i<myArray.length; i++) {
           sum += myArray[i];
           if (largest < myArray[i]);

       }
        System.out.println("sum is "+ sum);
        System.out.println("average is "+ sum/myArray.length);
        System.out.println("largest is "+ largest);
        System.out.println("largest is "+ smallest);



    }
}
