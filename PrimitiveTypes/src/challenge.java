/*
 Your challenge is to create a byte variable and set it to any valid byte number, id doesn't matter.
 Create a short variable and set it to any valid short number.

 Crate an int variable ans set it to any valid int number lastly, create a variable of type long and
 make it equal to 50000 plus 10 times the sum of the byte plus the short plus the integer values
 */
public class challenge {
    public static void main(String[] args) throws Exception {
        byte myByteVariable = 115;
        short myShortVariable = 30_000;
        int myIntVariable = 127_143_278;
        long myLongVariable = 50_000L + 10L * (myByteVariable + myShortVariable + myIntVariable);

        System.out.println("The final result is equal to: " + myLongVariable);

        short myShortTotal = (short)(1000 + 10 *(myByteVariable + myShortVariable + myIntVariable));
    }
}
