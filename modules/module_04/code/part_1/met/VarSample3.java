package met;

import var.Variables;

public class VarSample3 extends Variables {
  public static void main(String[] args) {
    Variables v = new Variables();
    // System.out.println(v.sPro); // Error : sPro has protected access in var.Variables1

    VarSample3 v1 = new VarSample3();
    System.out.println(v1.sPro);

    Variables v2 = new VarSample3();
    // System.out.println(v2.sPro); // Error : sPro has protected access in var.Variables1
  }
}
