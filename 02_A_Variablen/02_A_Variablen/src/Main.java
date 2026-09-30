public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // Naming

        // Which are valid variable names and which are not?
        // Try to determine what is valid and what is not without uncommenting the code.
        // If something is not valid, write a comment explaining why it is not valid.

        // Example:
        // int myVariable; // Valid
        // int %myVariable; // Not Valid, starts with a special character.


        // int 1stNumber; // ja es startet mit einem Zahl

        // int firstNumber; // ja es fängt mit eine kleine Buchstabe an

        // int tryThisNumber; // nein try ist ein schlüsselwort von Java

        // int _myNumber; // unterstrich ist als erste buchstabe erlaubt

        // int int; // nein int ist ein  Schlüsselwort von Java

        // int _number_; // es geht es fängt mit ein unterstrich an

        // int i; // ja aber ist nicht Ideal weil man vielleicht nicht versteht was nur eine i heisst

        // int number1; // ja number ist kein schlüsselwort

        // int .product;  //  lieber nicht startet nicht mit buchstabe oder zahl

        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Naming convention

        // Which are recommended variable names and which are not?

        // Example:
        // int myVariable; // recommended
        // int _myVariable; // not recommended, starts with a special character
        // int g; // not recommended, depending on the context, it can make sense. E.g. in the context of gravitational acceleration

        int number1;  //recommended
        int speed; // recommended
        int JustANUmber; // just is not needed only write number
        int justAnotherNumber; // number2 would beb better if you need another number
        int _weather; // not recommended to start with special keys like _ better just weather
        int _Id; // same as above and the i should be lowercase
        int $Money; // shouldnt start with special key
        int moneyinthebankaccount; // does't follow lowerCamelCase moneyInTheBankAccount is better
        int aLotOfmoneyonbankAccount; // same as above better  aLotOfMoneyOnBankAccount
        int circumstanceEarthInKM; // you could put final and everything big but its ok if it will change
        int circumstanceEarth_KM; //Same as Above and would avoid the _

        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Declaration and initialization of variables

        // Add the appropriate data type before the variable name, so, that it becomes a valid declaration and initialization.
        // (Variable names are in german to not reveal the result)

        float meineGleitkommaZahl = 23.5f;

        byte meineSehrKleineGanzzahl = 50;

        char meinUnicodeZeichen = '\u003D';

        short meineKleineGanzzahl = 200;

        char meinBuchstabe = 'B';

        float meineNegativeGleitkommaZahl = -14.612f;

        double meineGrosseGleitkommaZahl = 50.1234567890123d;

        boolean meinWahrheitswert1 = false;

        int meineNormaleGanzzahl = 50_000;

        long meineGrosseGanzzahl = 123_456_789_012_345L;

        boolean meinWahrheitswert2 = true;


        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Keyword final

        // Based on the variable name/value, decide if the keyword "final" is suitable or not.
        // If it is suitable, apply the recommended naming convention for variables with the "final" keyword.
        // Write -why- you decided to either mark it as final or not.


        int moneyInBankAccount = 100_000; // Das Geld kann sich immer ändern

        final short MY_BIRTH_YEAR = 2001; // Das änddert sich nicht

        final byte AMOUNT_OF_MONTHS = 12; // ändert sich auch nicht

        final float GRAVITY_FORCE = 9.81f; // ändert sich nicht

        final byte amountOfMinutesPerHour = 60; // ändert sich nicht

        final short amountOfSecondsPerHour = 3600; // ändert sich nicht

        final float pi = 3.14159f; // ändert sich nicht

        short amountOfStudents = 167; // kann sich ändern

        //--------------------------------------------------------------------------------------------------------------
    }
}