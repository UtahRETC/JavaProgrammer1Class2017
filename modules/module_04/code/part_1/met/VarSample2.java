package met;

import var.Variables;

public class VarSample2 {
  public static void main(String[] args) {
    Variables v = new Variables();
    // System.out.println(v.sDef);
    // Error : sDef is not public in Variables1; cannot be accessed from outside package
    System.out.println(v.sPub);
    //  System.out.println(v.sPri);
    // Error : sPri has private access in Variables1
    //  System.out.println(v.sPro);
    // Error : sPro has protected access in Variables1
  }
}
