package met;

public class OLSample2 {
  public void m1(int i, float f) {
    System.out.println("Int-Float");
  }

  public void m1(float f, int i) {
    System.out.println("Float-Int");
  }

  public static void main(String[] args) {
    OLSample2 s = new OLSample2();
    s.m1(10, 10.5f); // Int-Float
    s.m1(10.5f, 10); // Float-Int
    // s.m1(10,10);  //Error: reference to m1 is ambiguous;
  }
}
