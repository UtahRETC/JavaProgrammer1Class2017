package var;

public class ConstStudent1 {
  int rollNo;
  String studentName;

  ConstStudent1() {
    this(10, "Sam");
  }

  ConstStudent1(int rollNo, String studentName) {
    super(); // this();
    this.rollNo = rollNo;
    this.studentName = studentName;
  }

  public static void main(String args[]) {
    ConstStudent1 s1 = new ConstStudent1();
    System.out.println(s1.rollNo + "......" + s1.studentName);
  }
}
