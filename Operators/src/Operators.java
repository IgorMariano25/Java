public class Operators {
    public static void main(String[] args) throws Exception {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("====================================================");
        System.out.println("                 ADDITION OPERATOR                  ");
        System.out.println("====================================================");
        System.out.printf("1 + 2 = %d\n", result);
        int previsouResult = result;
        System.out.println("previsouResult = " + previsouResult + "\n");

        System.out.println("====================================================");
        System.out.println("                 SUBTRATION OPERATOR                ");
        System.out.println("====================================================");
        result = result - 1; // 3 - 1 = 2
        System.out.printf("3 - 1 = %d \n", result);
        System.out.println("previsouResult without changes = " + previsouResult + "\n");

        /*
         The value of the variable previsouResult didn't change, it continuous
         equal 3, becasue I didn't assign the value of the variable result to it
         */

        System.out.println("====================================================");
        System.out.println("                 MULTIPLY OPERATOR                  ");
        System.out.println("====================================================");
        result = result * 10; // 2 *10 = 20
        System.out.println("2 * 10 = " + result + "\n");
        previsouResult = result;
        System.out.println("previsouResult = " + previsouResult + "\n");

        System.out.println("====================================================");
        System.out.println("                 DIVISION OPERATOR                  ");
        System.out.println("====================================================");
        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);
        previsouResult = result;
        System.out.println("previsouResult = " + previsouResult + "\n");

        System.out.println("====================================================");
        System.out.println("              REMAINDER OF THE DIVISION             ");
        System.out.println("====================================================");

        result = result % 3; // The remainder of  ( 4 % 3 )
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++; // 1 + 1 = 2

        System.out.println("====================================================");
        System.out.println("              ABBREVIATING OPERATORS ++             ");
        System.out.println("====================================================");
        System.out.println("1 + 1 = " + result);
        System.out.println("restult++ = " + result);

        System.out.println("====================================================");
        System.out.println("              ABBREVIATING OPERATORS --             ");
        System.out.println("====================================================");
        // result = result - 1;
        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);
        System.out.println("restult-- = " + result);

        System.out.println("====================================================");
        System.out.println("              ABBREVIATING OPERATORS +=             ");
        System.out.println("====================================================");

        System.out.println("====================================================");
        System.out.println("              ABBREVIATING OPERATORS -=             ");
        System.out.println("====================================================");
    }
}
