// OBELEAGU ODINAKACHUKWU EMMANUEL
// QUESTION 1

import java.util.Scanner;
public class Welcome2{
    public static void main(String[] args){
    
    double initialTemperature;
    double finalTemperature;
    double amountOfWaterInKg;
    double energy = 0.0;

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter amount of water in Killogram: ");
    amountOfWaterInKg = scanner.nextDouble();
    System.out.print("Enter inital water temperature: ");
    initialTemperature = scanner.nextDouble();
    System.out.print("Enter final water temperature: ");
    finalTemperature = scanner.nextDouble();

    energy = amountOfWaterInKg * (finalTemperature - initialTemperature) * 4184;

    System.out.println("The enegy needed is " + energy);

    }

} 