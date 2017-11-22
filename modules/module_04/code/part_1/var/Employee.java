package var;

/* Static Variable Example */
public class Employee {
  String empName;
  static String orgName;

  public static void main(String[] args) {
    Employee e1 = new Employee();
    System.out.println(e1.empName + " works for " + e1.orgName);
    e1.empName = "Sam";
    e1.orgName = "Sun";
    System.out.println(e1.empName + " works for " + e1.orgName);
    Employee e2 = new Employee();
    e2.empName = "Tom";
    System.out.println(e2.empName + " works for " + e2.orgName);
    orgName = "Oracle";
    System.out.println(e1.empName + " works for " + e1.orgName);
    System.out.println(e2.empName + " works for " + orgName);
  }
}
