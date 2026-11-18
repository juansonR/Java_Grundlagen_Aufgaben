import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Ask a user for a number between 1 and 7.
        //     If the number is a 1, then print out Monday.  2 = Tuesday, 3 = Wednesday and so on until 7 = Sunday.
        //     Print "Not a weekday!" if it's not a number between 1-7.
        Scanner scanner = new Scanner(System.in);
       /* System.out.println("please enter a number between 1 and 7");
        int weekday = scanner.nextInt();
        switch (weekday) {
            case 1:
                System.out.println("It is Monday");
                break;
            case 2:
                System.out.println("It is tuesday");
                break;
            case 3:
                System.out.println("It is wednesday");
                break;
            case 4:
                System.out.println("It is thursday");
                break;
            case 5:
                System.out.println("It is friday");
                break;
            case 6:
                System.out.println("It is Saturday");
                break;
            case 7:
                System.out.println("It is sunday");
                break;
            default:
                System.out.println("Not a weekday");
                break;
        }
        switch (weekday){
            case 1 -> System.out.println("It isMonday");
            case 2 -> System.out.println("It is tuesday");
            case 3 -> System.out.println("It is wednesday");
            case 4 -> System.out.println("It is thursday");
            case 5 -> System.out.println("It is friday");
            case 6 -> System.out.println("It is saturday");
            case 7 -> System.out.println("It is sunday");
            default -> System.out.println("Not a weekday");

        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Ask a user for a Month (String). Based on the provided month, print out the corresponding season.
        //     Months: January, February, March, April, May, June, July, August, September, October, November, December
        //     Seasons: Winter, Spring, Summer, Autumn
        //     Example:  "January" -> "Winter"
        //     Example: "EMVs" -> "Not a month!";
        //     Write the old switch-statement so, that it only contains 4 breaks.
        System.out.println(" please enter a month of the year to know the station");
        String month = scanner.nextLine();
        String station;
        switch (month){
            case "January":
            case "February":
            case "December":
                station = "Winter";
                break;
            case "March":
            case "April":
            case "May":
                station = "Spring";
                break;
            case "June":
            case "July":
            case "August":
                station = "Summer";
                break;
            case "September":
            case "October":
            case "November":
                station = "Autumn";
            break;
            default:
                station = "Not a month";
              break;
        }
        switch (month){
            case "December", "February", "January" -> station = "Winter";
            case "March", "April", "May" -> station = "Spring";
            case "june", "July", "August" -> station = "Summer";
            case "September", "october", "November" -> station = "Autumn";
        }
        System.out.println(station);
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Create a program that takes a month number (1-12) and prints the number of days in that month.
        //     Assume it's not a leap year.
        System.out.println("Please enter the number of the month you are in");
        int monthNumber = scanner.nextInt();
        switch (monthNumber){
            case 2:
                System.out.println("28 Days");
                break;
            case 4, 6, 9, 11:
                System.out.println("30 Days");
                break;
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31 Days");
                break;
            default:
                System.out.println("Not a month number");
                break;
        }
        switch (monthNumber){
            case 2 -> System.out.println("28 Days");
            case 4, 6, 9, 11 -> System.out.println("30 Days");
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 Days");
            default -> System.out.println("Not a month number");
        }







        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Solve this exercise with whatever switch you feel more comfortable (new or old)
        //      Create a basic role-playing game character class selector.
        //      Based on a number input, assign strength, agility, and intelligence values to a character.
        //      Example: "Select a class (1-Warrior, 2-Mage, 3-Rogue, 4-Cleric): "
        //      User Input: 2
        //      Output: "Mage (Strength: 3, Agility: 4, Intelligence: 9)"
        System.out.println("Select a class (1-Warrior, 2-Mage, 3-Rogue, 4-Cleric)");
        int character = scanner.nextInt();
        switch (character) {
            case 1 -> System.out.println(" Warrior (Strength: 10, Agility: 7, Intelligence: 4)");
            case 2 -> System.out.println("Mage (Strength: 3, Agility: 4, Intelligence: 9");
            case 3 -> System.out.println("Rogue (Strength: 5, Agility: 2, Intelligence: 7");
            case 4 -> System.out.println("Cleric (Strength: 3, Agility: 6, Intelligence: 10");
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Solve this exercise with whatever switch you feel more comfortable (new or old).
        //      You can use all you know so far to solve this.
        //      Ask the user to translate a digit (0-9) (userInput 1)
        //      in another language (1-german, 2-english, 3-japanese) (user input 2).

        //      Example:
        //      "Which digit do you want to translate?" -> 7
        //      "In which language do you want to translate your digit?" -> 3
        //      Output: nana
        System.out.println("please enter a number you would like to translate 0-9");
        int translatedNumber = scanner.nextInt();
        System.out.println("now enter the number of the language you would like to translate to (1-german, 2-english, 3-japanese) (user input 2)");
        int language = scanner.nextInt();
        switch (language){
            case 1 -> {
                switch (translatedNumber){
                    case 0 -> System.out.println("null");
                    case 1 -> System.out.println("eins");
                    case 2 -> System.out.println("zwei");
                    case 3 -> System.out.println("drei");
                    case 4 -> System.out.println("vier");
                    case 5 -> System.out.println("fünf");
                    case 6 -> System.out.println("sechs");
                    case 7 -> System.out.println("sieben");
                    case 8 -> System.out.println("acht");
                    case 9 -> System.out.println("neun");
                    default -> System.out.println("Bitte gib eine zahl von 0 bis 9 an");
                }
            }
            case 2 -> {
                switch (translatedNumber) {
                    case 0 -> System.out.println("zero");
                    case 1 -> System.out.println("one");
                    case 2 -> System.out.println("two");
                    case 3 -> System.out.println("three");
                    case 4 -> System.out.println("four");
                    case 5 -> System.out.println("five");
                    case 6 -> System.out.println("six");
                    case 7 -> System.out.println("seven");
                    case 8 -> System.out.println("eight");
                    case 9 -> System.out.println("nine");
                    default -> System.out.println("please enter a number from 0 to 9");
                }
            }
                case 3 -> {
                    switch (translatedNumber) {
                        case 0 -> System.out.println("zero");
                        case 1 -> System.out.println("ichi");
                        case 2 -> System.out.println("ni");
                        case 3 -> System.out.println("san");
                        case 4 -> System.out.println("shi");
                        case 5 -> System.out.println("go");
                        case 6 -> System.out.println("roku");
                        case 7 -> System.out.println("nana");
                        case 8 -> System.out.println("hachi");
                        case 9 -> System.out.println("kyuu");
                        default -> System.out.println("Mukō na sūchi");
                    }
                }
        }

        //      Help for japanese Numbers:
        //      0: zero
        //      1: ichi
        //      2: ni
        //      3: san
        //      4: shi
        //      5: go
        //      6: roku
        //      7: nana
        //      8: hachi
        //      9: kyuu
        //      default: Mukō na sūchi


        //--------------------------------------------------------------------------------------------------------------
       */ System.out.println("Exercise 06");
        double result = 0;
        // 06.   Solve this exercise with whatever switch you feel more comfortable (new or old)
        //      Write a small calculator. A user types in two numbers and an operation ('addition', 'subtraction', 'division', 'multiplication').
        //      Calculate the correct answer and print it out.
        //      Print a warning when the user tries to divide by 0 (Example: 2/0 -> number two must not be 0!
        System.out.println("please enter two numbers you want to calculate with");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("what would you like to do with these numbers? enter the symbol / * + -");
        String operator = scanner.nextLine();
        switch (operator) {
            case "+" -> result = number1 + number2;
            case "-" -> result = number1 - number2;
            case "*" -> result = number1 * number2;
            case "/" -> {
                if (number2 == 0) {
                    System.out.println("it is not possible to divide by zero");
                } else {
                    result = (double) number1 / number2;
                }





            }
            default -> System.out.println("not a valid operator");
        }
        System.out.println(result);





        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Optional exercises");
        // 01.  Try to come up with a program on your own and the tools you
        //    know so far. Try to implement user input.
    }
}