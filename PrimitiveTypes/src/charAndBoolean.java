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

\u --> Indicates that a unicode value will be used
004 --> The first three numbers indicate in which line the character is in the table
3 -- > The last number indicate in which column the character is in the table

With that combination we have that result: \u0043 that is equal to the leter C
*/

// https://unicode-table.com/en/ --> Link to unicode web site
        char myCharVariable = 'C';
        char myUnicodeChar = '\u0043';
        char myCopyrightChar = '\u00A9';
        boolean myBooleanTrueValue = true;
        System.out.println("myCharVariable is equal to: " + myCharVariable);
        System.out.println("myUnicodeChar is equal to:  " + myUnicodeChar);
        System.out.println("myCopyrightChar is equal to: " + myCopyrightChar);
        System.out.println("myBooleanTrueValue is equal to: " + myBooleanTrueValue);
    }
}
