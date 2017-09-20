public class WhileLoopsWithConditionals {
  public static void main(String[] args) {
    boolean bankAccountIsEmpty = false;
    int bankAccountBalance = 85;
    int burgerCount = 0;

    while (!bankAccountIsEmpty) {
      System.out.println("You bought a burger");
      bankAccountBalance -= 5;
      burgerCount += 1;
      if (bankAccountBalance <= 0) {
        bankAccountIsEmpty = true;
      }
    }
  }
}
