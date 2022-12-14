public class primitiveTypes {
    public static void main(String[] args) throws Exception {
        System.out.println("Let's Study about Primitive Types!");
        System.out.println();

        int myIntValue = 1000;
        System.out.println("myValues is equal to: " + myIntValue);
        // Determining the minimum range of the int number
        // Using Wrapper class
        /*Java uses the concept of Wrapper class for all eight primitive types,
        in the case of int we can use Integer, and by doing that it gives us ways
         to perform operations on an int
        */
        int myMinimumIntValue = Integer.MIN_VALUE;
        // Determining the maximum range of int number
        // Using Wrapper class
        /*Java uses the concept of Wrapper class for all eight primitive types,
        in the case of int we can use Integer, and by doing that it gives us ways
         to perform operations on an int
        */
        int myMaximumIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum value = " + myMinimumIntValue);
        System.out.println("Integer Maximum value = " + myMaximumIntValue);
        // Doing Overflow
        System.out.println("Busted MAX value = " + (myMaximumIntValue + 1));
        // Doing Underflow
        System.out.println("Busted MIN value = " + (myMinimumIntValue - 1));

        System.out.println();
        byte myMinimumByteValue = Byte.MIN_VALUE;
        byte myMaximumByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value = " + myMinimumByteValue);
        System.out.println("Byte Maximum value = " + myMaximumByteValue);
        // Doing Overflow
        System.out.println("Busted MAX value for type byte = " + (myMaximumByteValue + 1));
        // Doing Underflow
        System.out.println("Busted MIN value for type byte = " + (myMaximumByteValue - 1));

        System.out.println();
        short myMinimumShortValue = Short.MIN_VALUE;
        short myMaximumShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value = " + myMinimumShortValue);
        System.out.println("Short Maximum value = " + myMaximumShortValue);
        
        System.out.println();
        /*Long numbers, must end with L at the end because that's how Java identifies this value as long, 
        otherwise it will treat this value as an Int because a maximum int value fits in a long variable. 
        But the opposite event does not occur.*/
        long myLongValue = 100L;
        System.out.println("myLongValue is equal to: " + myLongValue);
        long myMinimumLongValue = Long.MIN_VALUE;
        long myMaximumLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum value = " + myMinimumLongValue);
        System.out.println("Long Maximum value = " + myMaximumLongValue);

        // Java use for default a type of variable as an INT
        int myTotal = (myMinimumIntValue / 2);
        System.out.println(" myTotal is equal to: " + myTotal);

        byte myNewByteValue =(byte) (myMinimumByteValue / 2);
        System.out.println("myNewByteValue is equal to: " + myNewByteValue);

        short myNewShortValue = (short) (myMinimumShortValue / 2);
        System.out.println("myNewShortValue is equal to: " + myNewShortValue);
    }
}
