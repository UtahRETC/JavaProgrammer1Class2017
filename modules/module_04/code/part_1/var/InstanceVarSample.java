package var;

public class InstanceVarSample {
  int no;
  String name;

  public static void main(String[] args) {
    InstanceVarSample ivs1 = new InstanceVarSample();
    System.out.println(ivs1.no + "....." + ivs1.name); // 0.....null

    ivs1.no = 101;
    ivs1.name = "Sam";
    System.out.println(ivs1.no + "....." + ivs1.name); // 101.....Sam

    InstanceVarSample ivs2 = new InstanceVarSample();
    ivs2.no = 102;
    ivs2.name = "Tom";
    System.out.println(ivs2.no + "....." + ivs2.name); // 102.....Tom
  }
}
