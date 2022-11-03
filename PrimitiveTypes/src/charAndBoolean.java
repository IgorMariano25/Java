public class charAndBoolean {
    public static void main(String[] args) {
/*
1 - Char can store characters like a string, but one character at time and have 
    to use simple quotes;
2 - If we try to put more than one character we will revive a error like this message: 
    Too many characters in character litera OR THIS Invalid character constant
    */

/* We can use Unicode values instead of using a literal character, like the 
example above

OBS: Aded another backslash just ti remove de unicode "error"
\\u --> Indicates that a unicode value will be used 
004 --> The first three numbers indicate in which line the character is in the table
3 -- > The last number indicate in which column the character is in the table

With that combination we have that result: \u0043 that is equal to the leter C
*/

// https://unicode-table.com/en/ --> Link to unicode web site
        char myCharVariable = 'C';
        char myUnicodeChar = '\u0043';
        char myCopyrightChar = '\u00A9';
        boolean myBooleanTrueValue = true;
        boolean myBooleanFalseValue = false;

/*
 Normally for boolean type we use is + a question to make intuitive what that
 variable is actually tracking
 */
        boolean isCostumerOverTwentyOne = true;

        System.out.println("myCharVariable is equal to: " + myCharVariable);
        System.out.println("myUnicodeChar is equal to:  " + myUnicodeChar);
        System.out.println("myCopyrightChar is equal to: " + myCopyrightChar);
        System.out.println("myBooleanTrueValue is equal to: " + myBooleanTrueValue);
        System.out.println("myBooleanFalseValue is equal to: " + myBooleanFalseValue);
        System.out.println("isCostumerOverTwentyOne is equal to: " +isCostumerOverTwentyOne);

        String myStringValue = "I'm a string text";
        System.out.println(myStringValue);
        myStringValue += ", and I have 35 characters";
        System.out.println(myStringValue);
        System.out.printf("%c All rigths reserved by Igor Mariano 2022\n", myCopyrightChar);

/*
The java understand that a variable numberString is a string and for that reason 
 can't do math operations with that variable. And for this reason when we try do 
 math operations with string adding the math operator + java just add the two 
 strings and form a new valeu by the combination of the both strings 
*/
        String numberString = "250";
        numberString += "50";
        System.out.println(numberString);
    }
}
