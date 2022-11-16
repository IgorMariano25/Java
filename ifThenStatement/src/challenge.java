/*

 Let's test what you have learned aobut Operators 

 1 - Create a double variable with a value of  20.00

 2 - Create a variable of type double with the value of 80.00

 3 - Add bouth numbers together and multipy by 100.00

 4 - Use the remainder operator to figure out what the remainder from the result 
    of the operation in step 3 and 40.00.

 5 - Create a boolean variable that assigns the value true if the remiander in 
    step 4 is 0, or false if its not zero

 6 - Outout the boolean variable;

 7 - Write an if-then statement that displays a message if the boolean in step 5
    is not true.

*/


public class challenge {
    public static void main(String[] args) throws Exception {

        double myDoubleVariable = 20.00;
        double otherDoubleVarible = 80.00;

        System.out.println("The result of the account (20.00 + 80.00) * 100 = " +
                            (myDoubleVariable + otherDoubleVarible) * 100);
    }
}
