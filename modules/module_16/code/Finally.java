public class Finally {
  public static void main(String[] args) {

    try {
      System.out.println("The `try` code block is running.");
      throw new Exception();
    } catch (Exception ex) {
      System.out.println("The `catch` code block is running.");
      return;
    } finally {
      System.out.println("The `finally` code block is running.");
    }

  }
}
