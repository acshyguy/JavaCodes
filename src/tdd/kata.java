package tdd;

public class kata {
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
}