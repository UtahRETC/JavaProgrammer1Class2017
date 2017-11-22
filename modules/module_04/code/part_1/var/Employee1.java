package var;

public class Employee1 {
  static String empName = "Sam";

  public static void main(String[] args) {
    System.out.println(empName);
    // C.E.: non-static variable empName cannot be referenced from a static context
  }
}
