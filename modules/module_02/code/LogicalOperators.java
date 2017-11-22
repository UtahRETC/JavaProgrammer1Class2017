public class LogicalOperators {
  public static void main(String[] args) {
    boolean youKnowMyEmail = false;
    boolean iKnowYourEmail = true;
    if (youKnowMyEmail || iKnowYourEmail) {
      System.out.println("We can communicate :)");
      // only one needs to be true
    }
  }
}
