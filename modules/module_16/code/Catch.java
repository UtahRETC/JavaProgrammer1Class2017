import java.lang.IllegalStateException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Catch {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    double num = 0;

    while (true) {

      try {
        // Scanner.nextDouble throws the following
        //  - InputMismatchException - if the next token does not match the
        //    Float regular expression, or is out of range
        //  - NoSuchElementException - if the input is exhausted
        //  - IllegalStateException - if this scanner is closed
        //
        // https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html#nextDouble()

        System.out.println("");
        System.out.print("Please enter a number: ");
        num = input.nextDouble();
        System.out.println("You typed in " + num + ", thanks.");

        if (num == 0) {
          System.out.println("Because the input was zero, I will now close the input reader " +
              "and no longer allow input.");

          input.close();
        }
      } catch (IllegalStateException ex) {
        System.out.println("");
        System.out.println("The input scanner is closed and can no longer be used.");
        System.out.println("Please rerun the program to try again.");
        break;
      } catch (InputMismatchException ex) {
        System.out.println("It looks like you didn't input a number.");
        System.out.println("Please rerun the program to try again.");
        break;
      }

    }

  }
}
