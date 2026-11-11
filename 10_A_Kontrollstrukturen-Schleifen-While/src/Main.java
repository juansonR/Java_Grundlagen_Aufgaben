import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // Do this exercises __only__ with while-loops
        // Separate exercises for 'do-while' and 'for' will follow.
        //--------------------------------------------------------------------------------------------------------------

        //--------------------------------------------------------------------------------------------------------------
       /* System.out.println("Exercise 01");
        // 01.  Consider the following code:
        //      Do not run this code immediately!

             int iteratorEx1 = 0;
            while (iteratorEx1 < 10) {
                System.out.println("iteratorEx1:" + iteratorEx1++ );

            }
        //
        //      Questions to consider:
        //      1. What would happen if you ran this code as is? die konsole wurde unendlich viele 0 printen
        //      2. Why does this behavior occur? it occurs because the variable doesnt change at all is always the same
        //      3. How can you modify the code to achieve the desired output: change + "" for ++
        //         i:0 i:1 i:2 i:3 i:4 i:5 i:6 i:7 i:8 i:9


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02.  Using while loops, print each task and its numbers to the console (all numbers inclusive):
        //      02-01. 0 to 100
        int i = 0;
        while (i < 101) {
            System.out.println("The number equals:" + i);
            i++;
        }

        //      02-02. 42 to 100
        System.out.println("new counter");
        int counter = 42;
        while (counter < 101){
            System.out.println("The number equals:" + counter);
            counter++;
        }
        //      02-03. 42 to 123
        System.out.println("new counter");
        int newcounter = 42;
        while (newcounter < 124){
            System.out.println("The number equals:" + newcounter);
            newcounter++;}
        //      02-04. Even numbers (0, 2, 4, ...) from 0 to 10
        int evenNumbers = 0;
        while (evenNumbers <= 10){
            System.out.println("The number equals:" + evenNumbers);
            evenNumbers = evenNumbers + 2;}
        //      02-05. Odd numbers (1, 3, 5, ...) from 0 to 10
            int oddNumbers = 1;
            while (oddNumbers <= 9){
                System.out.println("the odd number equals " + oddNumbers);
                oddNumbers = oddNumbers + 2;
            }
        //      02-06. -10 to 20
        int negativeCounter = -10;
        while (negativeCounter <= 20){
            System.out.println("the counter is " + negativeCounter);
            negativeCounter++;
        }

        //      02-07. 35 to 0 (descending)
        int descendingNumber = 35;
        while (descendingNumber >= 0){
            System.out.println("the number is " + descendingNumber);
            descendingNumber = descendingNumber - 1;
        }
        //      02-08. 15 to -20 (descending)
        int descendingNumber1 = 15;
        while (descendingNumber1 >= -20){
            System.out.println("the number is " + descendingNumber1);
            descendingNumber1 = descendingNumber1 - 1;
        }
        //      02-09. Even numbers from 10 to -10 (descending)
        int descendingEvenNumber = 10;
        while (descendingEvenNumber >= -10){
            System.out.println("the number is " + descendingEvenNumber);
            descendingEvenNumber = descendingEvenNumber - 2;
        }
        //      02-10. Odd numbers from 10 to -10 (descending)
        int descendingOddNumber = 9;
        while (descendingOddNumber >= -9){
            System.out.println("the number is " + descendingOddNumber);
            descendingOddNumber = descendingOddNumber - 2;
        }


        //--------------------------------------------------------------------------------------------------------------
       */ System.out.println("Exercise 03");
        // 03.  Calculate the sum of all numbers from 0-100 (both inclusive). Print it to the console.

        System.out.println("Exercise 03");

        int whileSum_03 = 0;
        int counter2 = 0;
        while (counter2 <= 100) {
            whileSum_03 += counter2;
            counter2++;
        }
        System.out.println(whileSum_03);
        // Your code here

        System.out.println(whileSum_03); // Should be 5050

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Calculate the sum of all even numbers from 0-100 (both inclusive). Print it to the console.

        int whileSum_04 = 0;
        int counter3 = 0;
        while (counter3 <= 100) {
            whileSum_04 += counter3;
            counter3 += 2;
        }

        // Your code here

        System.out.println(whileSum_04); // Should be 2550

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Calculate the sum of all odd numbers from 0-100 (both inclusive). Print it to the console.

        int whileSum_05 = 0;
        int counter4 = 1;
        while (counter4 <= 99) {
            whileSum_05 += counter4;
            counter4 += 2;}

        // Your code here

        System.out.println(whileSum_05); // Should be 2500

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 06");
        // 06.  Generate random numbers between 0 and 100 (inclusive) until you get 22.
        //      Count and report how many attempts it took to generate 22.

        // Creating an object of type Random, calling it randomGenerator.
        // Check the import at the very beginning of this file. This import is needed to make this work
        Random randomGenerator = new Random();

        // Declaring an integer
        int randomNumber;

        // Setting the value of the integer to a random number between 0 (inclusive) and 101 (exclusive)
        randomNumber = randomGenerator.nextInt(101);
        long iterationSteps = 0;


        // Implement a while loop that:
        // 1. Generates a random number
        // 2. Increments the iteration count
        // 3. Stops when 22 is generated

        // Your code here
        while (randomNumber != 22){
            randomNumber = randomGenerator.nextInt(101);
            iterationSteps++;
        }


        System.out.println("The program ran " + iterationSteps + " times until the number was found!");
    }
}