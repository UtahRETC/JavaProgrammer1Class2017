public class Continues {
  public static void main(String[] args) {
    // This is an array, we'll discuss them in a future lesson.
    // Just think of this as a series of numbers, from 10 to 50.
    int[] numbers = {10, 20, 30, 40, 50};

    for (int x : numbers) { // Another way to write a for-loop
      if (x == 30) {
        continue;
      }
      System.out.print(x);
      System.out.print("\n");
    }
  }
}
