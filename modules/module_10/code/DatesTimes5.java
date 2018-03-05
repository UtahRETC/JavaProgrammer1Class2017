import java.time.*;
import java.time.format.*;

class DatesTimes5 {

  public static void main(String[] args) {
    DateTimeFormatter f = DateTimeFormatter.ofPattern("hh 'hour' mm 'minutes'");
    LocalTime t = LocalTime.now();
    System.out.println(t.format(f));
    // LocalDate d = LocalDate.now();
    // System.out.println(d.format(f));
  }
}
