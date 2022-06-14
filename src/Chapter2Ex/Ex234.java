package Chapter2Ex;

import java.util.Scanner;

public class Ex234 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        long currentWorldPopulation = 7_000_000_000L;
        double annualGrowthRate = 1.0;
        long currentPopulation2022;
        long population2023;
        long population2024;
        long population2025;
        long population2026;
        long population2027;

        currentPopulation2022 = (long) ((currentWorldPopulation * (annualGrowthRate/100)) + currentWorldPopulation);

        population2023 = (long) ((currentPopulation2022 * (annualGrowthRate/100)) + currentWorldPopulation);
        population2024 = (long) ((population2023 * (annualGrowthRate/100)) + population2023);
        population2025 = (long) ((population2024 * (annualGrowthRate/100)) + population2024);
        population2026 = (long) ((population2025 * (annualGrowthRate/100)) + population2025);
        population2027 = (long) ((population2026 * (annualGrowthRate/100)) + population2026);

        System.out.println("World population after year 1 is: "+ population2023);
        System.out.println("World population after year 2 is: "+ population2024);
        System.out.println("World population after year 3 is: "+ population2025);
        System.out.println("World population after year 4 is: "+ population2026);
        System.out.println("World population after year 5 is" +
                "" +
                ": "+ population2027);



    }
}
