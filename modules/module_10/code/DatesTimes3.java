import java.time.*;
import java.time.temporal.ChronoUnit;

class DatesTimes3 {

  public static void main(String[] args) {
    // Print the current time and date
    LocalDate d = LocalDate.now();
    LocalTime t = LocalTime.now();
    // February 1
    LocalDate nextMonth = LocalDate.of(2018, 2, 1);

    Period untilNextMonth = d.until(nextMonth);
    int daysLeft = untilNextMonth.getDays();

    System.out.println("There are " + daysLeft + "days left in January");

    // for times it works differently...
    LocalTime endOfClass = LocalTime.of(15, 0);
    long untilEndOfClass = t.until(endOfClass, ChronoUnit.MINUTES);

    System.out.println("There are " + untilEndOfClass + " minutes left");
  }
}
