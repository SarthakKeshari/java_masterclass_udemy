public class IfElse {
    public static void main(String[] args) {
        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("It is NOT an Alien!");
            System.out.println("I am sacred of aliens.");
        }

        int topScore = 80;
        if(topScore >= 100) {
            System.out.println("You got a high score");
        }

        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100) {
            System.out.println("You got greater than second top score but less than 100");
        }

        if((topScore > 90) || secondTopScore <= 90) {
            System.out.println("Either or both the condition is true");
        }
    }
}
