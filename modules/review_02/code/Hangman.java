import java.util.ArrayList;

class Hangman {
  protected String word;
  protected ArrayList<String> letters;

  public Hangman(String w) {
    word = w;
    letters = new ArrayList<String>();

    for (int i = 0; i < word.length(); i++) {
      letters.add("_");
    }
  }

  public boolean isDone() {
    return !letters.contains("_");
  }

  public String generateBoard() {
    return String.join(" ", letters);
  }

  public void guessALetter(String letter) {
    // Fill in all instances of `guess` that are found in `word`.
    int index = word.indexOf(letter);

    while (index >= 0) {
      letters.set(index, letter);
      index = word.indexOf(letter, index + 1);
    }
  }
}
