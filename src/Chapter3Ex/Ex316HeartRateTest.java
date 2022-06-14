package Chapter3Ex;

import java.util.Scanner;

public class Ex316HeartRateTest {


    static Ex316HeartRate healthCheck = new Ex316HeartRate("Tunde","Obeleagu",
            "Dec",04,1994);
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(healthCheck.getFirstName());
        System.out.println(healthCheck.getLastName());
        System.out.println(healthCheck.getBirthMonth());
        System.out.println(healthCheck.getBirthDay());
        System.out.println(healthCheck.getBirthYear());


        System.out.println("Enter ur first name: ");
        String fisrtName = input.nextLine();
        healthCheck.setFirstName(fisrtName);

        System.out.println("Enter ur last name: ");
        String secondName = input.nextLine();
        healthCheck.setLastName(secondName);

        System.out.println("Enter ur birth month: ");
        String birthMonth = input.nextLine();
        healthCheck.setBirthMonth(birthMonth);

        System.out.println("Enter ur birth day: ");
        int birthDay = input.nextInt();
        healthCheck.setBirthDay(birthDay);

        System.out.println("Enter ur birth year: ");
        int birthYear = input.nextInt();
        healthCheck.setBirthYear(birthYear);

        System.out.println(healthCheck.getFirstName());
        System.out.println(healthCheck.getLastName());
        System.out.println(healthCheck.getBirthMonth());
        System.out.println(healthCheck.getBirthDay());
        System.out.println(healthCheck.getBirthYear());



        System.out.println("Age is : "+healthCheck.age());

        System.out.println("Maximum Heart Rate is: "+healthCheck.maximumHeartRate());

        System.out.println("Lower Target Rate is: "+healthCheck.lowerTargetHeartRate());
        System.out.println("Higher Target Rate is: "+healthCheck.higherTargetHeartRate());
    }

}
