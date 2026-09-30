import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // 1. Create a Scanner object named "userInput".
        //    Ask the user to type in the following information:
        //
        //    - The first name,
        //    - last name,
        //    - age,
        //    - birthday (day)
        //    - birthday (month)
        //    - birthday (year)
        //    - whether the user is a student
        //     -and at least three (or more) questions you want to add.
        //
        //    To make it easier for the user, only ask him one question at a time
        //    In the end, greet the user with his age and let him know about
        //    all the data you have gathered from the user.
        //
        //
        //    It's up to you how you design this little program, but use all
        //    of your knowledge so far. Pay attention to the datatypes.
        //
        //    Challenge:
        //    Also calculate approximately how many days he has lived so far!
        //    To make it easier, lets assume a year has always 365 days and
        //    every month has 30 days. For the month, you can take september (09)
        //    Hint for a possible approximate formula at the bottom of the code.
        //
        //    Possible output:
        //    Thank you for your input, Hansi Meier!
        //    You are 28 years old
        //    You were born in 27.4.1994
        //    Are you a student? true
        //    Your favorite food is: Gnocchi
        //    And so far you have lived approximately ~10370 days!
        Scanner userInput = new Scanner(System.in);
        System.out.println("enter your name:\n");
        String name = userInput.nextLine();


        System.out.println("enter your last name:\n");
        String lastName = userInput.nextLine();
        System.out.println("Your name is " + name + " " + lastName);

        System.out.println("Enter your age\n");
        String age = userInput.nextLine();
        System.out.println("You are " + age + " years old");

        System.out.println("enter your birthday\n");
        byte birthDay = userInput.nextByte();
        System.out.println("Enter your Birthmonth\n");
        byte birthMonth = userInput.nextByte();
        System.out.println("enter your birthyear\n");
        short birthYear = userInput.nextShort();
        System.out.println("You were born in " + birthDay + "." + birthMonth + "." + birthYear);

        System.out.println("Are you a Student type true or false\n");
        boolean Student = userInput.nextBoolean();


        System.out.println("Thank you for the information " + name + " " + lastName);
        System.out.println("you are " + age + " years old");
        System.out.println("You were born in " + birthDay + "." + birthMonth + "." + birthYear);
        System.out.println("it is " + Student + " that you are a Student");
        //--------------------------------------------------------------------------------------------------------------
        // 2. Ask the user to input two numbers.
        //    Print the result of an addition, subtraction, division and multiplication
        System.out.println("please type two numbers\n");
        int firstNumber = userInput.nextInt();
        int secondNumber = userInput.nextInt();
        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = (float) firstNumber / secondNumber;
        System.out.println("The addition of your numbers equals: " + addition);
        System.out.println("The subtraction of your numbers equals: " + subtraction );
        System.out.println("The multiplication of your numbers equals: " + multiplication );
        System.out.println("The division of your numbers equals: " + division );
        //--------------------------------------------------------------------------------------------------------------
        // 3. Ask the user to input his weight and height.
        //    Calculate the body mass index (BMI) and print it to the user
        //    BMI = weight(kg) / height(m)^2
        System.out.println("Welcome to the BMI calculator");
        System.out.println("Please enter your height in meters");
        float height = userInput.nextFloat();
        System.out.println("Please enter your weight in kg");
        float weight = userInput.nextFloat();
        float BMI = weight / (height * height) ;
        System.out.println("Your BMI is " + BMI);



        //--------------------------------------------------------------------------------------------------------------
        // 4. Ask the user to input a number of minutes.
        //    Convert the minutes to hours and minutes and print it
        //    To test: 126minutes -> 2h and 6min
        System.out.println("please enter an amount of minutes you would like to convert into hours.");
        int minutes = userInput.nextInt();
        int totalHours = minutes / 60;
        int totalMinutes = minutes %60;
        System.out.println("that amount of minutes equals " + totalHours +" hours and " + totalMinutes + " minutes");

        //--------------------------------------------------------------------------------------------------------------
        // 5. Ask the user to input a radius.
        //    Calculate and display its circumference (2 * π * r) and area (π * r^2).
        System.out.println("Please enter the radius of a circle");
        float radius = userInput.nextFloat();
        float circumference = (float) (2 * Math.PI * radius);
        float area = (float) (Math.PI * (radius * radius));
        System.out.println("The circumference of your circle is " + circumference + " and the area is " + area);


        //--------------------------------------------------------------------------------------------------------------
        // 6. Ask the user to input a bill-amount and a tip-amount(percentage)
        //    Calculate the total price.
        //    Example:
        //    Bill: 100.-
        //    Tip in %: 20
        //    Total: 120.-
        System.out.println("Please enter how much you have to pay");
        float bill = userInput.nextFloat();
        System.out.println("Please enter how much tip in % you had like to give");
        float tip = userInput.nextFloat();
        float total = bill += bill / 100 * tip;
        System.out.println("The amount you have to pay is: " + total);

        //--------------------------------------------------------------------------------------------------------------
        // 6. Write a program to calculate your monthly and yearly salary
        //    Example:
        //    What's your hourly wage? -> 30
        //    How many hours do you work a week? -> 40
        //    Your monthly wage is: 4800
        //    Your yearly salary is: 57600 excluding the 13th month
        System.out.println("Please enter how much money you earn per hours");
        float hourIncome = userInput.nextFloat();
        System.out.println("How many hours do you work per week");
        byte workHours = userInput.nextByte();
        float monthlyIncome = hourIncome * workHours * 4;
        float yearlyIncome = monthlyIncome * 12;
        System.out.println("You earn " + monthlyIncome + " a month and " + yearlyIncome + " a year");

        //--------------------------------------------------------------------------------------------------------------
        // 7. Write a little quiz about your favorite hobby/movie/book/song/game/dance/whatsoever.
        //    Include at least 10 questions. Use a byte to store your result.
        //    Example:
        //    Hello and welcome to my quiz about game development!
        //    Q 01: Which is the most used texture in all games based on an algorithm to generate natural looking textures
        //          terrain and much more?
        //    (User Input): I don't know
        //    It is the perlin noise (texture). If you were correct, write 1, else 0.
        //    (User Input): 0
        //    Q 02: Ok, next question! What is the name of the algorithm commonly used for pathfinding?
        //    (User Input): A-Star
        //    It's the A* or the A-star. If you were correct, write 1, else 0.
        //    (User Input): 1
        //    ....
        //    Q 10: Last question! What does 'LOD' stand for?
        //    (User Input): Don't know
        //    It stands for 'Level Of Detail'. If you were correct, write 1, else 0.
        //    Now im calculating your points....
        //    If you were honest, then you reached a total of n points! Congrats!
        //--------------------------------------------------------------------------------------------------------------
        // 7. Write a little quiz about your favorite hobby/movie/book/song/game/dance/whatsoever.
        //    Include at least 10 questions. Use a byte to store your result.
        System.out.println("Hello and welcome to my quiz about football!");
        System.out.println("Answer the question. If you were correct write 1, else 0.");
        byte points = 0;


        System.out.println("Q 01: How many players from one team are on the pitch at the same time?");
        userInput.next(); //
        System.out.println("It is 11 players. If you were correct, write 1, else 0.");
        points += userInput.nextByte();


        System.out.println("Q 02: Ok, next question! How many minutes does a regular football match last?");
        userInput.next();
        System.out.println("It is 90 minutes. If you were correct, write 1, else 0.");
        points += userInput.nextByte();



    userInput.close();
    }
}





// Make sure you didn't forget to close the scanner :)


// Formula (approximately):
// (currentYear * daysPerYear + currentMonth * daysPerMonth) - (yourYear * daysPerYear + yourMonth * daysPerMonth);
// Example:
// (2024 * 365 + 9 *30) - (yourYear * 365 + yourMonth * 30);