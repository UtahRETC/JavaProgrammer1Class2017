import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sample {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int numberToGuess = ThreadLocalRandom.current().nextInt(-250, 250 + 1);

    System.out.printf("Give me your best guess and press enter: ");
    int numberGuessed = reader.nextShort();

    System.out.printf(
        "The number you guessed is %d and you were supposed to guess %s.\n",
        numberToGuess, numberGuessed);
  }
}
