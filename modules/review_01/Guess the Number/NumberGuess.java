import java.util.Scanner; 
import java.util.concurrent.ThreadLocalRandom;

public class NumberGuess {
    public static void main(String [] args){

        int TargetNumber = ThreadLocalRandom.current().nextInt(-250, 250 + 1); // the max limit is exclusive this is why we need to add 1
        final int MAX_GUESS = 10;
        Scanner GuessHolder = new Scanner( System.in );

        for (int i = 1; i <= MAX_GUESS; i++){
            System.out.println("Attempt #" + i + " : guess a number between -250 and 250");
            int GuessReader = GuessHolder.nextShort();   //good place to talk about why we are using nextShort() instead of nextInt()
            
            while(GuessReader > 250 || GuessReader < -250) {
                System.out.println("nice try!! enter a number between -250 and 250 for realsies");
                GuessReader = GuessHolder.nextShort();
            }
            
            // Testing the Guess
            if (GuessReader == TargetNumber) {
                System.out.println("Hooray!! you are right the correct guess is: " + GuessReader);
                break;
            } else if (i == 10) {
                System.out.println("Incorrect! sorry!! the correct answer is " + TargetNumber);
            } else if (GuessReader > TargetNumber) {
                System.out.println("Not quite!! Hint: the target number is less than " + GuessReader);
            } else if (GuessReader < TargetNumber) {
                System.out.println("Not quite!! Hint: the target number is more than " + GuessReader);
            }

    }
}
}