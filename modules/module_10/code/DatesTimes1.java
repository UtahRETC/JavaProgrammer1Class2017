import java.time.*;

public class DatesTimes1 {

  public static void main(String[] args) {
    // Print the current time and date
    LocalDate d = LocalDate.now();
    LocalTime t = LocalTime.now();
    System.out.println("Date/Time: " + d + ", " + t);

    // Or you can do it like this:
    LocalDateTime dt = LocalDateTime.now();
    System.out.println("Date/Time: " + dt);
  }
}
