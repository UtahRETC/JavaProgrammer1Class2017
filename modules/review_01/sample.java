import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Proj1StartVersion {
  public static void main(String[] args) {
    Scanner GuessHolder = new Scanner(System.in);
    int TargetNumber = ThreadLocalRandom.current().nextInt(-250, 250 + 1);

    System.out.println("Give me your best guess and press enter: ");
    int GuessReader = GuessHolder.nextShort();
  }
}
