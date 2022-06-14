package ac;

public class kata {
    public static int noOfFactorsOf5;

    //get x
    //count from 1 to x
    //if count mod x returns 0 increment factors
    //return factors
    public static int noOfFactorsOf(int number) {
        int factors = 0;
        for (int i = 1; i <= number; i++)
            if (number % i == 0) factors++;
        return factors;
        //OR use while loop
        //int factors = 0;
        //int i = 1;
        //return factors;

    }

    public static boolean isPrime(int number) {
        if (noOfFactorsOf(number)== 2) return true;
        return false;
    }


    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;

    }

    public int subtract(int firstNumber, int secondNumber) {
        int difference = firstNumber - secondNumber;
        if (secondNumber > firstNumber) difference = secondNumber - firstNumber;
        return difference;
    }

    public int divide(int firstNumber, int secondNumber) {
        int division = secondNumber / firstNumber;
        //if (secondNumber > firstNumber) division = secondNumber / firstNumber;
        return division;
    }

    public int multiply(int firstNumber, int secondNumber) {
        int multiply = firstNumber * secondNumber;
        return multiply;
    }

    public int copies(int numberOfCopies) {
        int price = 0;
        if (numberOfCopies >= 1 && numberOfCopies <= 4)
            price = numberOfCopies * 2_000;
        if (numberOfCopies >= 5 && numberOfCopies <= 9)
            price = numberOfCopies * 1_800;
        if (numberOfCopies >= 10 && numberOfCopies <= 29)
            price = numberOfCopies * 1_600;
        if (numberOfCopies >= 30 && numberOfCopies <= 49)
            price = numberOfCopies * 1_500;
        if (numberOfCopies >= 50 && numberOfCopies <= 99)
            price = numberOfCopies * 1_300;
        if (numberOfCopies >= 100 && numberOfCopies <= 199)
            price = numberOfCopies * 1_200;
        if (numberOfCopies >= 200 && numberOfCopies <= 499)
            price = numberOfCopies * 1_100;
        if (numberOfCopies >= 500)
            price = numberOfCopies * 1_000;

        return price;
    }

    public String scoreGrade(int scoreRange) {
        String scoreGrade = null;
        if (scoreRange >= 90 && scoreRange <= 100) {
            scoreGrade = "A";
        }
        if (scoreRange >= 80 && scoreRange < 90) {
            scoreGrade = "B";
        }
        if (scoreRange >= 70 && scoreRange < 80) {
            scoreGrade = "C";
        }
        if (scoreRange >= 60 && scoreRange < 70) {
            scoreGrade = "D";
        }
        if (scoreRange < 60) {
            scoreGrade = "F";
        }

        return scoreGrade;
    }
}