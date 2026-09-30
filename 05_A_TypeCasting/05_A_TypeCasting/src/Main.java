public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // 1. Declare variables for all primitive data types except boolean. Initialize them with appropriate values.
        // Perform type casting operations as follows:
        //      a. Start with the smallest range data type.
        //      b. Cast this type to every other type with a larger range.
        //      c. Repeat this process for each data type, always casting to types with larger ranges.
        // For each casting operation:
        //      If the cast is valid (widening conversion), perform the operation.
        //      If the cast is invalid or requires an explicit cast (narrowing conversion), write the code but comment it out.
        byte myByte = 50;
        short myShort = 100;
        int myInt = 67;
        long myLong = 6767;
        char myChar = 34567;
        float myFloat = 67.69f;
        double myDouble = 1234.12;

        short byteToShort = myByte;
        int byteToInt = myByte;
        long byteToLong = myByte;
        float byteToFloat = myByte;
        double byteToDouble = myByte;

        // byte shortToByte = (byte) myShort;
        int shortToInt = myShort;
        long shortToLong = myShort;
        float shortToFloat = myShort;
        double shortToDouble = myShort;

        // byte intToByte = (byte) myInt;
        // short intToShort = (short) myInt;
        long intToLong = myInt;
        float intToFloat = myInt;
        double intToDouble = myInt;

        // byte longToByte = (byte) myLong;
        // short longToShort = (short) myLong;
        // int longToInt = (int) myLong;

        float longToFloat = myLong;
        double longToDouble = myLong;





        // Your code here

        //--------------------------------------------------------------------------------------------------------------
        // 2. Now create a long with the value = 1234567890.
        //    Manually cast the long to an int and print it out



        // Your code here
        long bigLong = 1234567890;
        int intTooBig = (int) bigLong;
        System.out.println(intTooBig);
        //--------------------------------------------------------------------------------------------------------------
        // 3. Try to guess what the following code is doing:

        String myNumber = "33";
        int intNumber = 10;

        myNumber += intNumber;

        // Try to guess first what happens, then test it.
        // System.out.println(myNumber);
        System.out.println(myNumber);

        // Can you explain what is happening?
        // Es ist eine String nicht eine Zahl also kann es nicht + 10 berechnet werden, Java zeigt 3310 also es verbindet beide


        //--------------------------------------------------------------------------------------------------------------
        // 4. Below is a line commented out, because it is throwing an error.
        //    What is the error and why does it happen?
        //    Try to figure out, how you could convert a String-value to an int.
        //    PS: You need to look it up in the internet.
        //    You might want to try following search term: "java string to int"
        //    Check with the System.out.println if you are actually printing an int


        String houseNumberInString = "52";
        int houseNumber = Integer.parseInt(houseNumberInString);
        System.out.println(houseNumber);
        // int houseNumber = houseNumberInString;
        // System.out.println(houseNumber);

        //--------------------------------------------------------------------------------------------------------------
        // 5. Write down what could go wrong with your solution above
        //dass die String Buchstaben hat dann kann sie nicht zu einen int werden.

        // Write down here

    }
}