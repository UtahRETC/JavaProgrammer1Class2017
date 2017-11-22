public class WhileLoops {
  public static void main(String[] args) {
    int number = 50;

    while (number > 0) {
      System.out.println(number + " cycles left");
      number -= 1; // The same as "number = number - 1;"
    }
  }
}
