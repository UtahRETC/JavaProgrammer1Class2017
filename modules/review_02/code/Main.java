import java.util.Random;
import java.util.Scanner;

public class Main {
  // Generated using https://www.randomlists.com/random-words
  protected static String[] words = {
    "advise",
    "ruthless",
    "gorgeous",
    "glove",
    "spoon",
    "nod",
    "eatable",
    "chase",
    "point",
    "evasive",
    "trick",
    "person"
  };

  public static String getARandomWord() {
    Random rand = new Random();
    return words[rand.nextInt(words.length)];
  }

  public static void startGameOfHangman() {
    Scanner in = new Scanner(System.in);
    Hangman game = new Hangman(getARandomWord());

    for (int i = 0; i < 50; i++) {
      System.out.println(game.generateBoard());

      System.out.printf("Guess a letter. Input your guess and press enter: ");
      String letter = in.next();

      if (letter.length() != 1) {
        System.out.println("You are only allowed to guess a single letter!");
      } else {
        game.guessALetter(letter);
      }

      // Check if we're done.
      if (game.isDone()) {
        System.out.println("You guessed all of the letters");
        System.out.println("You win!");
        break;
      }
    }
  }

  public static boolean playAnotherGame() {
    Scanner in = new Scanner(System.in);
    System.out.print("Play again? (yes/no) ");

    String answer = in.next();

    if (answer.equals("no")) {
      return false;
    } else if (answer.equals("yes")) {
      return true;
    } else {
      return playAnotherGame();
    }
  }

  public static void main(String[] args) {
    do {
      startGameOfHangman();
    } while (playAnotherGame());
  }
}
