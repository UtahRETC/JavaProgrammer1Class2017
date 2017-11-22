package met;

public class OLsample3 {

  public void m1(Object o) {
    System.out.println("Object Version");
  }

  public void m1(String s) {
    System.out.println("String Version");
  }

  public void m1(OLsample3 ols) {
    System.out.println("OLsample3 version");
  }

  public static void main(String[] args) {
    Object o = new Object();
    String s = "Java";
    OLsample3 ol = new OLsample3();

    ol.m1(s); // String Version
    ol.m1(ol); // OLsample3 version
    ol.m1(o); // Object Version
    o = ol;
    ol.m1(o); // Object Version
    // ol.m1(null); //Error : reference to m1 is ambiguous;
  }
}
