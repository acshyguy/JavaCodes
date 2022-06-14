package Chapter3Ex;

import java.util.Scanner;

public class Ex317HealthRecordsMain {
    public static Ex317HealthRecords records = new Ex317HealthRecords("Odogwu","Obele","Male",
            "December",04,1994,6.5,90);

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        System.out.println(records.getFirstName());
//        System.out.println(records.getLastName());
//        System.out.println(records.getGender());
//        System.out.println(records.getMonthOfBirth());
//        System.out.println(records.getDayOfBirth());
//        System.out.println(records.getYearOfBirth());
//        System.out.println(records.getHeight());
//        System.out.println(records.getWeight());

        System.out.println("Enter ur first name: ");
        String fName = input.nextLine();
        records.setFirstName(fName);

        System.out.println("Enter ur last name: ");
        String lName = input.nextLine();
        records.setLastName(lName);

        System.out.println("Enter ur gender: ");
        String gender = input.nextLine();
        records.setGender(gender);

        System.out.println("Enter ur month of birth: ");
        String mBirth = input.nextLine();
        records.setMonthOfBirth(mBirth);

        System.out.println("Enter ur day of birth: ");
        int dBirth = input.nextInt();
        records.setDayOfBirth(dBirth);

        System.out.println("Enter ur year of birth: ");
        int yBirth = input.nextInt();
        records.setYearOfBirth(yBirth);

        System.out.println("Enter ur height: ");
        double height = input.nextDouble();
        records.setHeight(height);

        System.out.println("Enter ur weight: ");
        double weight = input.nextDouble();
        records.setWeight(weight);


        System.out.println("Age is: "+records.age());

        System.out.println("BMI range is: "+records.bodyMassIndex());

        System.out.println("Maximum heart rate range is: "+records.maximumHeartRate());

        System.out.println("Lower Target heart range: "+records.lowerTargetHeartRate());

        System.out.println("Higher Target heart range: "+records.higherTargetHeartRate());


    }

}
