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
    }
}
