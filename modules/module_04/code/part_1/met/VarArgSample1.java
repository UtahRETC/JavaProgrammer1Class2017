package test;

public class VarArgSample1 {
  static int add(int... x) {
    int sum = 0;
    System.out.println("Number of arguments: " + x.length);

    // using for loop to show array representation
    // for (int i = 0; i < x.length; i++) sum = sum + x[i];

    for (int a : x) sum = sum + a; // using for each loop
    return sum;
  }

  public static void main(String[] args) {
    System.out.println("Result=" + add()); // no parameter
    System.out.println("Result=" + add(1, 2)); // 2 params
    System.out.println("Result=" + add(1, 2, 3, 4)); // 4 params
  }
}
