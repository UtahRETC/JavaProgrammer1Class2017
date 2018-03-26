import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Student extends Person {
  String studentID;

  Student(String name, int age, String studentID) {
    super(name, age);
    this.studentID = studentID;
  }

  public String getID() {
    System.out.println(studentID);
    return studentID;
  }

  public static void main(String[] args) throws Exception {

    Student p1 = new Student("Sam", 29, "200-BR");

    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);
    String inputText = br.readLine();

    while (!inputText.equals("close")) {
      StringTokenizer tk = new StringTokenizer(inputText);
      String param1 = tk.nextToken();
      String param2 = null;
      if (tk.hasMoreTokens()) {
        param2 = tk.nextToken();
      }

      if (param1.equals("setAge")) {
        p1.setAge(Integer.parseInt(param2));
      } else if (param1.equals("getAge")) {
        p1.getAge();
      } else if (param1.equals("getName")) {
        p1.getName();
      } else if (param1.equals("setName")) {
        p1.setName(param1);
      } else if (param1.equals("birthday")) {
        p1.birthday();
      } else if (param1.equals("getID")) {
        p1.getID();
      } else {
        System.out.println("Unidentified input");
      }
      inputText = br.readLine();
    }
  }
}
