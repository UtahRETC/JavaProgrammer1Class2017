/* Instance Variable Sample */
package var;

public class Student {
  int no;
  String name;

  public static void main(String[] args) {
    Student s1 = new Student();
    System.out.println(s1.no + "....." + s1.name); // 0.....null

    s1.no = 101;
    s1.name = "Sam";
    System.out.println(s1.no + "....." + s1.name); // 101.....Sam

    Student s2 = new Student();
    s2.no = 102;
    s2.name = "Tom";
    System.out.println(s2.no + "....." + s2.name); // 102.....Tom
  }
}
