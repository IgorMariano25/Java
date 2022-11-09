public class ifThenStatement {
    public static void main(String[] args) throws Exception {
        boolean isAlien = false;
        if (isAlien == false){
          System.out.println("It is not a Alien");
        }

        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got the high score!");
        }

        int secondScore = 81;
        if ((topScore > secondScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondScore <= 90)){
            System.out.println("Either or both conditions are true");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar){
            System.out.println("That is correct !");
        }

        boolean wasCar = isCar ? true : false;
    }
}
