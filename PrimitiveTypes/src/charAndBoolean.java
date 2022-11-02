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
*/

// https://unicode-table.com/en/ --> Link to unicode web site
        char myCharVariable = 'C';
        char myUnicodeChar = '\u0043';
        System.out.println("myCharVariable is equal to: " + myCharVariable);
        System.out.println("myUnicodeChar is equal to:  " + myUnicodeChar);
    }
}
