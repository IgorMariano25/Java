public class primitiveTypes {
    public static void main(String[] args) throws Exception {
        System.out.println("Let's Study about Primitive Types!");
        System.out.println();

        int myValue = 1000;
        // Determining the minimum range of the int number
        // Using Wrapper class
        /*Java uses the concept of Wrapper class for all eight primitive types,
        in the case of int we can use Integer, and by doing that it gives us ways
         to perform operations on an int
        */
        int myMinimumValue = Integer.MIN_VALUE;
        // Determining the maximum range of int number
        // Using Wrapper class
        /*Java uses the concept of Wrapper class for all eight primitive types,
        in the case of int we can use Integer, and by doing that it gives us ways
         to perform operations on an int
        */
        int myMaximumValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum value = " + myMinimumValue);
        System.out.println("Integer Maximum value = " + myMaximumValue);
        // Doing Overflow
        System.out.println("Busted MAX value = " + (myMaximumValue + 1));
        // Doing Underflow
        System.out.println("Busted MIN value = " + (myMinimumValue - 1));

        System.out.println();
        byte myMinimumByteValue = Byte.MIN_VALUE;
        byte myMaximumByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value = " + myMinimumByteValue);
        System.out.println("Byte Minimum value = " + myMaximumByteValue);

        System.out.println();
    }
}
