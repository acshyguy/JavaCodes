package AssignmentsAndClassWorks;

public class DaysOfChristmas {
    public static void main(String[] args) {

        for (int dayOfChristmas = 1; dayOfChristmas <= 12; dayOfChristmas++) {
                System.out.print("On the ");

            switch (dayOfChristmas){
                case 1:
                    System.out.print("First Day ");
                    break;
                case 2:
                    System.out.print("Second Day ");
                    break;
                case 3:
                    System.out.print("Third Day ");
                    break;
                case 4:
                    System.out.print("Fourth Day ");
                        break;
                case 5:
                    System.out.print("Fifth Day ");
                    break;
                case 6:
                    System.out.print("Sixth Day ");
                    break;
                case 7:
                    System.out.print("Seventh Day ");
                    break;
                case 8:
                    System.out.print("Eighth Day ");
                    break;
                case 9:
                    System.out.print("Ninth Day ");
                    break;
                case 10:
                    System.out.print("Tenth Day ");
                    break;
                case 11:
                    System.out.print("Eleventh Day ");
                    break;
                default:
                    System.out.print("Twelfth Day ");
                    break;

            }

            System.out.println("of Christmas ");
            System.out.println("My true love gave to me");

            switch (dayOfChristmas) {
                case 12:
                    System.out.println("12 Drummers Drumming");
                case 11:
                    System.out.println("11 Pipers Piping");
                case 10:
                    System.out.println("10 Lords a Leaping");
                case 9:
                    System.out.println("9 Ladies Dancing");
                case 8:
                    System.out.println("8 Maids a Milking");
                case 7:
                    System.out.println("7 Swans a Swimming");
                case 6:
                    System.out.println("6 Geese a Laying");
                case 5:
                    System.out.println("5 Golden Rings");
                case 4:
                    System.out.println("4 Calling Birds");
                case 3:
                    System.out.println("3 French Hens");
                case 2:
                    System.out.println("2 Turtle Doves and");
                default:
                    System.out.println("A Partridge in a Pear Tree");

            }

        }

    }
}


