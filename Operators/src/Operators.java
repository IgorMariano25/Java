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
        System.out.println("previsouResult = " + previsouResult + "\n");

        /*The value of the variable previsouResult didn't change, it continuous 
        equal 3
        */
        System.out.println("====================================================");
        System.out.println("                 MULTIPLY OPERATOR                  ");
        System.out.println("====================================================");
        result = result * 10;
        System.out.println("2 * 10 = " + result + "\n");
        previsouResult = result;

        System.out.println("====================================================");
        System.out.println("                 DIVISION OPERATOR                  ");
        System.out.println("====================================================");
    }
}
