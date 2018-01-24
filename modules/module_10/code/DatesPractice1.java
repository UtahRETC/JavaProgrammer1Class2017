import java.time.*;

class DatesPractice1 {

	public static void main(String[] args) {
		// now()
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		LocalDateTime dt = LocalDateTime.now();

		System.out.println("Date: " + d);
		System.out.println("Time: " +  t);
		System.out.println("Date/Time: " + dt);

		// a specifc time / date
		LocalDate yesterday = LocalDate.of(2017, 1, 26);
		LocalTime noon = LocalTime.of(12, 0);
		LocalDateTime l = LocalDateTime.of(2017, 1, 26, 12, 0);
		// Same:
		LocalDateTime l2 = LocalDateTime.of(yesterday, noon);

		System.out.println("yesterday: " + yesterday);
		System.out.println("noon: " +  noon);
		System.out.println("Together: " + l);
		System.out.println("Same result: " + l2);
	}
}