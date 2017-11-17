import java.util.Scanner; 
import java.util.concurrent.ThreadLocalRandom;

public class Proj1StartVersion {
    public static void main(String [] args){

        int TargetNumber = ThreadLocalRandom.current().nextInt(-250, 250 + 1); 
        Scanner GuessHolder = new Scanner( System.in );

        System.out.println("give me your best guess: ");
            int GuessReader = GuessHolder.nextShort();   
            
    }
}