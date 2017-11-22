public class EncapsulationExample {
  public static void main(String args[]) {
    Employee empVar1 = new Employee();
    boolean adminUser = false;
    if (args.length >= 1) {
      adminUser = args[0].equals("admin");
    }

    empVar1.setUserAsAdmin(adminUser);
    System.out.println("Salary of the employee is: " + empVar1.getSalary());
    empVar1.setSalary(70000);
    System.out.println("Salary of the employee after calling setSalary() : " + empVar1.getSalary());
  }
}

class Employee {

  private String name = "John";
  private int age = 22;
  private int empId = 12177;
  private double salary = 50000;

  public boolean adminUser = false;

  public void setUserAsAdmin(boolean adminUser) {
    this.adminUser = adminUser;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (adminUser) {
      this.age = age;
    } else {
      System.out.println("No Permission to set Age");
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (adminUser) {
      this.name = name;
    } else {
      System.out.println("No Permission to set Name");
    }
  }

  public int getEmpId() {
    return empId;
  }

  public void setEmpId(int empId) {
    if (adminUser) {
      this.empId = empId;
    } else {
      System.out.println("No Permission to set Emp Id");
    }
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    if (adminUser) {
      this.salary = salary;
    } else {
      System.out.println("No Permission to set Salary");
    }
  }
}
