public class Operators {
    public static void main(String[] args) throws Exception {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.printf("1 + 2 = %d", result);
        int previsouResult = result;
        System.out.printf("previsouResult =" ,previsouResult);
        result = result - 1; // 3 - 1 = 2
        System.out.printf("3 - 1 = %d", result);
        /*The value of the variable previsouResult didn't change, it continuous 
        equal 3
        */
        System.out.printf("previsouResult =" ,previsouResult);
        result = result * 10;
        System.out.printf("2 * 10 = %d", result);
    }
}
