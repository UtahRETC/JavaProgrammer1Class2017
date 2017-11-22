package met;

public class OLSample1 {
  public void m1() {
    System.out.println("No-Arg");
  }

  public int m1(int i) {
    System.out.println("Int-Arg");
    return i;
  }

  public void m1(double d) {
    System.out.println("Double-Arg");
  }

  public static void main(String[] args) {
    OLSample1 s = new OLSample1();
    s.m1(); // No-Arg
    s.m1(5); // Int-Arg
    s.m1(5.5); // Double-Arg
  }
}
