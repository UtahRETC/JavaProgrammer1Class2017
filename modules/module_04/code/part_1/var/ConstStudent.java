package var;

public class ConstStudent {
  int rollNo;
  String studentName;

  ConstStudent() {
    this(10, "Sam");
  }

  ConstStudent(int rollNo, String studentName) {
    super();
    this.rollNo = rollNo;
    this.studentName = studentName;
  }

  public static void main(String args[]) {
    ConstStudent s1 = new ConstStudent();
    ConstStudent s2 = new ConstStudent(101, "Tom");

    System.out.println(s1.rollNo + "......" + s1.studentName);
    System.out.println(s2.rollNo + "......" + s2.studentName);
  }
}
