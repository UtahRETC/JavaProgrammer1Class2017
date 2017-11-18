import java.util.Scanner; 
import java.util.concurrent.ThreadLocalRandom;
import javax.xml.stream.events.Characters;

public class Hangman {
    public static void main(String [] args){
        
        String words[] = new String[]{"catch" , "lunch", "palyer", "love", "banana", "field" , "runner" , "jazz" , "earth" };
        int RandIndex = ThreadLocalRandom.current().nextInt(0, words.length); // the max limit is exclusive this is why we need to add 1
        final int MAX_GUESS = 20;
        Scanner GuessHolder = new Scanner(System.in);   // you could dot useDelimiter("\\s*") in there if you want to take care of whitespaces. 
        String TargetWord = words[RandIndex];
        int tracker = 0;  
        System.out.println("HINT: the word that I'm thinking of has " + TargetWord.length() + " letters in it");

        for (int i = 1; i <= MAX_GUESS; i++){
            System.out.println("Attempt #" + i + " : guess a letter in the word that I'm thinking of");
            char GuessReader = GuessHolder.next().charAt(0);   
            
            while(!Character.isLetter(GuessReader)){
                System.out.println("nice try!! make sure you enter only a single letter without spaces");
                GuessReader = GuessHolder.next().charAt(0);
            }
            
            TargetWord = TargetWord.toLowerCase();

 
            int counter = 0;     
            for(int j = 0; j < TargetWord.length(); j++){   
                            
                if (TargetWord.charAt(j) == GuessReader){
                    System.out.println("the index of this letter in the word is : " + (j+1));
                    counter++;
                    tracker++;
                }

                if (tracker == TargetWord.length()){
                    System.out.println("Horray you've guessed all the correct letters in the word: " + TargetWord);
                    break;
                }
            }

            if (tracker == TargetWord.length()){
                break;
            } 
        }
    }
}